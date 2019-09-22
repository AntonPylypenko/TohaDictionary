package com.example.antonpylypenko;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private EditText pass;
    private Button btn;

    private String[] gairaigoWords = {
        "アベック",
        "アフターサービス",
        "アイドル",
        "アイス",
        "アイスクリーム",
        "アイゼン",
        "アメフト",
        "アメリカンドッグ",
        "アニメ",
        "アニソン",
        "アンケート",
        "アンニュイ",
        "アンサー",
        "アンチ",
        "アパート",
        "アポ",
        "〜アップ",
        "アロエ",
        "アルバイト or バイト",
        "アールブイ",
        "アルコール",
        "アウトコース",
        "バーゲン",
        "バイキング",
        "バイク",
        "バカンス",
        "ブックカバー",
        "バックミラー",
        "バックナンバー",
        "バックネット",
        "バリアフリー",
        "バリカン",
        "バスジャック",
        "バター",
        "バッティング",
        "ベビーカー",
        "ベッドタウン",
        "ビー玉",
        "ビジネスホテル",
        "ビロード",
        "ビル",
        "ビール",
        "ボンベ",
        "ボールペン",
        "ボタン",
        "ブランコ",
        "ブラセラ or ブルセラ",
        "ブレザー",
        "ブルマ",
        "キャビンアテンダント",
        "チェリーボーイ",
        "チアガール",
        "チアマン",
        "チアリーダー",
        "チアリーディング",
        "チケット",
        "チンキ",
        "チューハイ or 酎ハイ",
        "コラボ",
        "コンピューター or コンピュータ",
        "ダブル(noun), ダブる(intransitive verb). Sometimes “W”",
        "ダンプカー",
        "ダストボックス",
        "ダウンロードオンリーメンバー",
        "〜ティック or 〜チック",
        "デッドボール",
        "デコレーションケーキ",
        "電子レンジ or レンジ",
        "デパート\t",
        "デパ地下",
        "デリバリーヘルス",
        "デッサン",
        "デスク",
        "ドイツ",
        "ドクター ストップ",
        "ドンマイ",
        "ドライバー",
        "ドライブイン",
        "ドラマ",
        "ドリフト",
        "エアコン",
        "AV",
        "エキス",
        "エネルギッシュ",
        "エンスト",
        "エレベーター",
        "エロ",
        "エログ",
        "エログロ",
        "エール",
        "LLC",
        "エスカレーター",
        "エステ",
        "エッチ",
        "ファイナル",
        "ファイト",
        "ファミコン",
        "ファンファーレ",
        "ファンタジック",
        "ファッションヘルス",
        "フェッチ",
        "～フェチ",
        "フォアボール",
        "フライ",
        "フライングゲット",
        "フライドポテト",
        "フライング(スタート)",
        "フリーダイアル or フリ",
        "ーダイヤル",
        "フリーコール",
        "フリーサイズ",
        "フリーター",
        "フロント",
        "フロントガラス",
        "ガードマン",
        "ガラス or 硝子",
        "ガソリンスタンド",
        "ガッツポーズ",
        "ガーゼ",
        "ゲームセンター or ゲーセン",
        "ゲレンデ",
        "ギブ(アップ)",
        "ギプス or ギブス",
        "ゴム",
        "ゴールデンアワー or ゴールデンタイム",
        "ゴールデンウィーク or ゴールデンウイーク",
        "ググる",
        "グラビア",
        "グラス",
        "グロ",
        "ギャラリー",
        "ギャル",
        "ハイカラ",
        "ハイネック",
        "ハイオク",
        "ハイタッチ",
        "ハッカー",
        "ハッピーエンド",
        "ハモる",
        "ハンバーグ",
        "ハンチング帽",
        "ハンドル",
        "ハンドルキーパー",
        "ハンドルネーム",
        "ハンカチ",
        "ハンスト",
        "ハウス",
        "ヘアピンカーブ",
        "ヘルスメーター",
        "ヒステリー",
        "ヒップ",
        "ホルモン",
        "ホース",
        "ホッチキス",
        "ホットケーキ",
        "ホーム",
        "ホワイトデー",
        "イエス",
        "イギリス",
        "イクラ",
        "イメージ",
        "インスタ",
        "インフレ",
        "イン・キー",
        "イラスト",
        "イヤー・オブ・ザ・コーチ",
        "ジャンパー",
        "ジェンダーフリー",
        "ジェットコースター",
        "ジンギスカン",
        "ジーパン",
        "ジュース",
        "カメラマン",
        "カモン or カモーン",
        "カン or 缶",
        "カンニング",
        "カッパ or 合羽",
        "カラン",
        "カラオケ",
        "カリウム or カリ or 加里",
        "カルキ",
        "カルピス",
        "カルタ",
        "カルテ",
        "カシューナッツ",
        "カステラ",
        "カタルシス",
        "カチューシャ",
        "キーホルダー",
        "キリスト or 基督",
        "キスマーク",
        "キッチンペーパー",
        "コーヒー or 珈琲",
        "コインランドリー",
        "コインロッカー",
        "コック",
        "コマーシャルメッセージ or CM",
        "コミカライズ",
        "コンビニ",
        "コンビナート",
        "コンクール",
        "コンセント",
        "コント",
        "コップ",
        "コラーゲン",
        "コロッケー",
        "コスプレ",
        "クラブ or 倶楽部",
        "クラクション",
        "クランケ",
        "クレーム",
        "クリスタル",
        "キーボード",
        "キャバクラ",
        "キャベツ",
        "キャンペーン",
        "キャンピングカー",
        "キャッチボール",
        "キャッチホン",
        "キャッチコピー",
        "キャップ",
        "マグカップ",
        "マイナスドライバー",
        "マイ〜",
        "マジックインキ",
        "マジックテープ",
        "ママ",
        "マンダラ or 曼陀羅",
        "マニア",
        "マンション",
        "満タン",
        "マロン",
        "マスコミ",
        "マザコン",
        "マゾ",
        "メーカー",
        "メール",
        "メールマガジン",
        "メルヘン",
        "ミイラ or 木乃伊",
        "ミルク",
        "ミシン",
        "モバイル",
        "モバメ",
        "モボ",
        "モガ",
        "モーニングコール",
        "モーニングコート or モーニング",
        "モーニングサービス or モーニング",
        "モラトリアム人間",
        "モーテル",
        "ムーディ",
        "ムーンサルト",
        "ナイター",
        "ナンバーディスプレイ",
        "ナンバープレート",
        "ナトリウム",
        "ニート　or NEET",
        "ノイローゼ",
        "ノークレームノーリターン",
        "ノルマ",
        "ノート",
        "ニューハーフ",
        "オージー",
        "オーバー",
        "オードブル",
        "OB, OG",
        "オーディエンス",
        "OL",
        "オフ",
        "オナニー",
        "オンリーワン",
        "オペ",
        "オープンカー",
        "オーライ",
        "オルゴール",
        "オートバイ",
        "パイン",
        "パーマ",
        "パン",
        "パネリスト",
        "パンク",
        "パンスト",
        "パソコン",
        "パーソナルコンピューター",
        "パンツ",
        "パパ",
        "ペチカ",
        "ペアルック",
        "ペニス",
        "ペンション",
        "ペーパーカンパニー",
        "ペーパードライバー",
        "ペーパーテスト",
        "ピエロ",
        "ピーマン",
        "ピッケル",
        "ピンチ",
        "ピンセット",
        "ポエマー",
        "ポケベル",
        "ポケモン",
        "ポンプ",
        "ポシェット",
        "ポスト",
        "プラスアルファ",
        "プラスドライバー",
        "プレイガイド",
        "プリクラ",
        "プロ",
        "プロフィール",
        "プロレス",
        "プッシュホン",
        "ラブホテル",
        "ライバル",
        "ライブアクション",
        "ライブハウス",
        "ライフライン",
        "ラッコ",
        "ラムネ",
        "ランドセル",
        "ランニングホームラン",
        "ランニングシャツ",
        "レジュメ",
        "レントゲン",
        "レースクイーン",
        "レストラン",
        "リベンジ",
        "リーチ",
        "リードオンリーメンバー",
        "リフォーム",
        "リモコン",
        "リンクフリー",
        "リニューアル",
        "リサイクルショップ",
        "リストラ",
        "ロードショー",
        "ロケーションハンティ",
        "ング, ロケハン",
        "ロマン",
        "ロマンスグレー",
        "ロマンスカー",
        "ロンパリ",
        "ロープウェー",
        "ロリコン",
        "ロスタイム",
        "ルー",
        "ルポ",
        "リュックサック",
        "サービス",
        "サボる",
        "サド",
        "サイドブレーキ",
        "サイダー",
        "サイン",
        "サインペン",
        "サンドイッチ or サンド",
        "サンドバッグ",
        "サラダ",
        "サラリーマン",
        "セックス",
        "セフレ",
        "セクハラ",
        "セメダイン",
        "センス",
        "セレブ",
        "セツナ or 剎那",
        "シャボン玉",
        "シャープペンシル or シャーペン",
        "シーエム",
        "シール",
        "シルバーシート",
        "シュークリーム",
        "ソフト",
        "ソフトクリーム",
        "ソーラーシステム",
        "すべた or スベタ",
        "スイートルーム",
        "スカイ",
        "スケボー",
        "スケルトン",
        "スキー",
        "スキンシップ",
        "スコップ",
        "スマート",
        "スマホ",
        "スムーズ",
        "スーパー",
        "スパッツ, スパッツタイツ",
        "スペル",
        "スピン",
        "スポイト",
        "スリーサイズ",
        "ストライキ or スト",
        "ストレートティー",
        "ストーブ",
        "スーツアクター",
        "タバコ, たばこ or 煙草",
        "タイムオーバー",
        "タイムリー",
        "タオルケット",
        "タレント",
        "テーマ",
        "テンキー",
        "てんぷら or 天ぷら",
        "テンション",
        "テレビ",
        "テレビゲーム",
        "テレフォン",
        "テレカ",
        "ティーンエージャー",
        "トーチカ",
        "トイレ(ット)",
        "トンカツ",
        "トラブル(noun), トラブる(verb)",
        "トランプ",
        "トレーナー",
        "トレーニングパンツ",
        "ツイッター",
        "ウィンカー or ウインカー",
        "ウーパールーパー",
        "ヴァージンロード",
        "ワイドショー",
        "ワイシャツ or Yシャツ",
        "ワンパターン",
        "ワンピース",
        "ワープロ",
        "ウォシュレット",
        "ヨット",
        "ヤンエグ",
        "ヨード",
        "ヨードチンキ",
        "ユニットバス",
        "Uターンラッシュ",
        "ザイル",
        "ゼミナール or ゼミ",
        "ゼン or 禅",
        "ゼロ",
        "トマト",
        "ズボン"
    };

    private String[] garaigoTranslation = {
        "romantic couple",
        "after service",
        "(teen) idol, pop star",
        "ice, also used as a shortened form of ice cream",
        "ice cream",
        "crampons",
        "American football",
        "corn dog",
        "animation, animated cartoons or films",
        "an anime song, most often the theme",
        "questionnaire, survey",
        "ennui, boredom",
        "reply to a question, solution to a problem",
        "hater, anti-fan",
        "apartment (US), flat (UK), though apāto are usually in small two-story wood-structure buildings, not multistory complexes as in the US usage",
        "appointment",
        "to upgrade or improve (something). Coupled with English or pseudo-English nouns that indicate what that something is; e.g., ‘’version-up’’: upgrade (software), buy the next-better version or model of something, improve the appearance of something; ‘’image-up’’: improve the image of, improve one’s outward appearance; “weight-up”: to gain weight; ‘’manner-up’’: improve one’s manners, learn (proper/better) manners or etiquette; ‘’power-up‘’: an object that instantly benefits or adds extra abilities to a video game character; ‘’base-up, level-up’’: take to the next or a higher (basic) level of quality; also ‘’base-up’’ (frequently abbreviated ‘’bea’’): to raise the base wage of the workers",
        "aloe",
        "part-time job",
        "truck, van, SUV, Recreational Vehicle",
        "alcohol, alcoholic beverage",
        "outside",
        "a sale at a store",
        "smorgasbord, buffet. It is said that this originated from the restaurant “Imperial Viking” in the Imperial Hotel, which was the first restaurant in Japan to serve buffet-style meals, named after the 1958 American film The Vikings’'.",
        "a motorcycle, but not a bicycle",
        "holiday, vacation",
        "dust jacket",
        "rear-view mirror",
        "back issue",
        "a backstop (in baseball)",
        "Accessible facilities for handicapped persons",
        "Hand or electric operating hair trimmer",
        "a bus hijacking (possibly based on the English term “carjack”)",
        "butter, sometimes used on food packaging to refer to margarine",
        "Swing the bat in baseball; or, to project forward or propose competitively on business or others by two or more parties, like “butting heads” by animals.\t",
        "stroller (US), pushchair or pram (UK)",
        "bedroom suburbs, bedroom community, dormitory suburb, commuter town",
        "marbles",
        "budget hotel",
        "velvet",
        "building (especially modern steel / concrete buildings)",
        "beer",
        "a steel canister for storing pressurized gas, such as a propane tank",
        "a ballpoint pen",
        "button",
        "a swing",
        "panty fetishism, especially with teenage girls wearing school outfits (“sailor suits”) and bloomers.",
        "’’blazer‘’, or a Japanese school uniform that includes that garment. It usually has buttons down the front and a vest under it with a white collared shirt.",
        "short pants worn for exercise by girls, usually in PE class in high school",
        "A flight attendant",
        "A male virgin",
        "(female) cheerleader",
        "(male) cheerleader",
        "cheerleader",
        "cheerleading",
        "ticket",
        "tincture",
        "a kind of alcoholic drink originating from Japan",
        "A term for when two separate entities come together and make something",
        "computer",
        "(noun and adjective) double; double-breasted (jacket), or turn-ups (cuffs) on trousers; (verb) to be redundant or doubled",
        "dump truck (US), dumper (UK)",
        "rubbish bin (UK), garbage can (US)",
        "a computing leech",
        "~esque, attached to a noun. For example, a product with cute character illustrations may be considered “Akihabara-chikku”.",
        "hit by a pitch",
        "a fancy cake",
        "a microwave oven",
        "department store",
        "a shopping area, often focused on food and located adjacent to train stations, found in major cities in Japan",
        "a form of prostitution, essentially a call girl or escort service",
        "drawing",
        "an editor for a certain section of a publication, derived from the English custom of calling the job a desk, as in “the sports desk”",
        "Germany",
        "when the doctor tells a patient to stop doing something",
        "”don’t worry about it”, “don’t pay (that) any mind”, “it’s/I’m OK”, “no problem”. Frequently used when something goes wrong",
        "a screwdriver, motor vehicle driver",
        "rest area, motor lodge, drive-in",
        "TV drama, soap opera",
        "drifting, in the sense of a car in the controlled skid used in drifting",
        "air conditioning or air conditioner",
        "adult video, audio visual (audio video)",
        "extract",
        "energetic",
        "stall (as in an automobile engine",
        "elevator (American English), lift (British English)",
        "erotic",
        "erotic / adult oriented blog",
        "a loosely defined artistic movement featuring “erotic grotesque nonsense” that emerged in Japan in the early 20th century",
        "(1) to cheer on a player in a sports competition; (2) to express support for a candidate in an election",
        "antifreeze coolants",
        "escalator",
        "beauty salon, esthetic clinic",
        "dirty, naughty; sex (the etymology of ‘’etchi’’ is still debated by Japanese linguists)",
        "last",
        "often used to mean “Do your best!” or “I’ll do my best.”",
        "the Nintendo Entertainment System. Also used as a catch-all term by the older generation for any gaming console",
        "a musical fanfare",
        "fantastic",
        "a form of brothel",
        "(Computer Jargon) To fetch an instruction from main memory when a microprocessor executes a command",
        "fetish (typically a sexual fetish but sometimes just referring to a distinctive preference)",
        "walk, base on, ball four",
        "fly ball (baseball term)",
        "Deep frying",
        "to purchase an item before its official release date",
        "french fries (US), chips (UK)",
        "premature start, breakaway",
        "toll free call",
        "toll free call",
        "one-size-fits-all",
        "underemployed young adults, people who opt to work (a series of) part-time jobs rather than engage in permanent employment",
        "the reception desk, e.g. at a hotel or a sentō",
        "windshield (US), windscreen (UK)",
        "a (private) security guard, a person who directs traffic around work sites",
        "glass (material)",
        "gas station (US), petrol station (UK)",
        "fist pump, victory pose",
        "gauze",
        "video arcade",
        "ski slope",
        "To give up",
        "cast (sometimes ‘’gipusu’’ means a plaster cast, while ‘’gibusu’’ refers to a plastic brace)",
        "rubber, eraser, rubber band",
        "prime time in Japanese television",
        "A week of holidays in Japan, Golden Week.",
        "to google",
        "glamour photography",
        "drinking glass",
        "grotesque",
        "an art gallery, audience, or a pool of celebrities on a program.",
        "a young woman who belongs to the gyaru subculture",
        "the popular 1970s manga and anime, Haikara-san ga Tōru (“Here Comes Miss High-Collar”).",
        "A turtleneck style shirt or sweater",
        "High octane gasoline",
        "High five",
        "refers specifically to a computer black hat",
        "a happy ending",
        "to harmonize (when singing)",
        "Salisbury steak, (culinary term)",
        "hunting cap",
        "steering wheel or bicycle handlebars",
        "designated driver",
        "handle, screen name",
        "handkerchief",
        "hunger strike",
        "greenhouse or glasshouse",
        "hairpin turn",
        "bathroom scales, scales",
        "loss of (self) control",
        "buttocks, butt",
        "hormone; also offal when served for yakiniku or hotpot",
        "a hose",
        "stapler (a genericized trademark of the E. H. Hotchkiss company, also used in Korea)",
        "a pancake, (also called hotcake in English)",
        "a railway platform",
        "White Day, a month after Valentine’s Day",
        "Jesus",
        "English, England or the United Kingdom",
        "salmon roe",
        "an image, often used to indicate an artist’s rendering or a graphic intended to provide a conceptual image of a situation; especially in advertising and design, a conceptual description intended to conjure a mental image of an abstract situation; (the public’s) impression or perception of an entity.",
        "Instagram",
        "inflation",
        "locking one’s car keys inside of one’s car",
        "an illustration",
        "coach of the year (a title given to coaches by Asahi Shimbun and the Japan High School Baseball Federation from 2003-2005; corrected to the Japanese name 育成功労賞 from 2006; now known as the Training Achievement Award)",
        "jacket, jumper (Ski jumping athletes)",
        "gender equality, gender blind",
        "roller coaster",
        "Jingisukan (Mongolian style barbecue with cut lamb and vegetables)",
        "jeans",
        "often used to refer to soda or energy drinks, regardless of whether they contain any juice",
        "photographer or cameraman",
        "An invitation to join an activity or event.",
        "can (beverage can or tin can)",
        "cheating",
        "(rain) coat",
        "faucet",
        "karaoke",
        "potassium",
        "lime (mineral)",
        "Calpis (a milky soft drink)",
        "karuta (Japanese playing cards)",
        "(a patient’s) medical record",
        "cashew",
        "a kind of sponge cake popular at festivals and as a street food in Japan",
        "purification or purgation",
        "Alice band; horseshoe-shaped hairband made of metal or plastic (often covered with cloth). However, in Russian it is called “ободок” (“obodók”).",
        "key ring or key chain",
        "Christ",
        "hickey",
        "paper towel",
        "coffee",
        "laundromat (US), launderette (UK)",
        "type of locker",
        "a cook",
        "television advertisement",
        "to make a comic strip (‘’manga‘’) version of an originally non-comic strip title, such as a novel, movie, or TV show.",
        "convenience store",
        "Combine (enterprise)",
        "a contest, a competition",
        "power outlet",
        "a short comedy",
        "a glass or tumbler",
        "collagen",
        "croquette, a small fried roll",
        "cosplay (a subculture involving dressing up in costumes, especially from manga, anime and video games)",
        "a club or society",
        "horn (on an automobile)",
        "patient",
        "a complaint",
        "shiny or clear",
        "a keyboard",
        "hostess club",
        "cabbage",
        "a sales campaign or sweepstakes",
        "a recreational vehicle",
        "the game of catch",
        "call waiting",
        "tagline",
        "cap",
        "mug",
        "(flathead) screwdriver",
        "Someone’s own. Common examples include ‘’mai būmu’’: personal taste; ‘’mai kã’’: one’s own car; ‘’mai waifu ‘’: one’s wife; ‘’mai hōmū’’: one’s own house; ‘’mai pēsu’’: doing things at one’s own (leisurely) pace, taking one’s time (often somewhat derogatory). Confusingly for English speakers, this can be used to refer to someone ‘’else’s’’ car, wife, home, etc.",
        "Permanent marker",
        "Velcro",
        "mom",
        "circle",
        "enthusiasm, enthusiast",
        "modern concrete apartment / condominium block",
        "full tank (as in the fuel tank of an automobile)",
        "chestnut, metaphor for brown eyes",
        "mass media, the media, the press",
        "Oedipus complex, or a strong attachment, formed in childhood, to one’s mother, often used derogatorily; “girly man”",
        "masochist",
        "manufacturer",
        "e-mail",
        "e-mail newsletter, ezine",
        "fairy tale",
        "a mummy",
        "milk, non-dairy creamer",
        "sewing machine",
        "mobile communications, mobile communications capability, or mobile communications devices, esp. PDAs and personal computers with wireless communications capabilities",
        "mobile phone-based mailing list subscription, usually used by entertainers to share their daily activities with fans",
        "1920s slang for young men adopting western styles and behaviours",
        "1920s slang for young women adopting western styles and behaviours, flapper",
        "wake-up call",
        "morning coat",
        "breakfast special, complimentary toast, hard-boiled egg et al. that is served at cafes when a cup of coffee is ordered (only seen in some parts of Japan)",
        "a person who, having completed education and other preparations, delays the transition from student to productive member of society, staying in an uncertain limbo of continued education, part-time work, and parental support (similar to ‘’freeter’’)",
        "recently called as “love hotel“. Does not have meaning of English “motel” used by tourists with their own vehicles.",
        "nice",
        "an artistic gymnastics maneuver. Also used to describe a professional wrestling maneuver.",
        "a night game",
        "caller ID",
        "BrE number plate, AmE license plate",
        "sodium (Na)",
        "underemployed young adults, akin to “フリーター”",
        "neurosis",
        "sold “as is”",
        "quota, minimum requirement (tasks)",
        "a notebook",
        "A transgender individual that has undergone a sex change operation.",
        "an orgy",
        "overreaction to a situation or the end of a dating relationship",
        "hors-d’œuvre",
        "alumnus, alumna, former student; furthermore used for former sport team members, employees, politicians etc., for former members of any kind of organisation likewise",
        "group of people who participate in a show",
        "female office worker, usually in a clerical or support job",
        "a sale at a store; e.g., a “big summer off” (=big summer sale)",
        "masturbation (see Onan)",
        "(adjective) ‘’one of a kind’’ or ‘’unique’’; e.g., オンリーワン技術 (‘’~gijutsu’’: “only one technology”) or オンリーワン商品 (‘’~shōhin’’: “only one products”) meaning ‘’one of a kind’’ technology or products",
        "surgical operation, minor surgery",
        "convertible (automobile)",
        "all right, OK",
        "a music box or any instrument that operates off of a music roll such as a calliope",
        "motorcycle, motorbike",
        "pineapple",
        "perm",
        "bread",
        "panelist",
        "flat tire",
        "pantyhose",
        "PC",
        "personal computer",
        "underpants (American English), pants (British English)",
        "dad",
        "Russian stove",
        "matching outfits (usually between a couple)",
        "the penis",
        "a resort hotel / chalet / cottage",
        "dummy company, shell company",
        "a person who has a driver’s license but does not usually drive (i.e.: a driver only on paper)",
        "written examination/test",
        "a clown",
        "sweet bell pepper",
        "ice axe",
        "potentially disastrous situation",
        "tweezers",
        "a poet",
        "beeper, pager",
        "Pokémon",
        "pump",
        "a small bag",
        "a mailbox (US), a postbox (UK)",
        "in addition, a little bit more, with something else",
        "Phillips screwdriver",
        "(theater) ticket agency",
        "photo booth#purikura",
        "describes a business professional or professional sports",
        "a profile",
        "professional wrestling",
        "push-button telephone. A genericized trademark first registered by the Nippon Telegraph and Telephone Public Corporation (電電公社 Dendenkōsha, now NTT)",
        "love hotel (hotel used as a private place for couples to have sexual contact)",
        "A fellow competitor or an enemy",
        "animated or comic form stories made into TV shows/movies involving real actors. It’s the opposite of komikarizu",
        "club with live music, rock bar",
        "infrastructure",
        "a sea otter",
        "Ramune (a lemon-lime soft drink; hard, powdery candy like Rockets or Smarties)",
        "a hard schoolbag, worn on the back, carried by young children to school",
        "an inside-the-park home run",
        "a sleeveless T-shirt",
        "a resume, an outline",
        "X-ray, X-ray medical imaging",
        "umbrella girls",
        "restaurant",
        "return match, rematch, chance for redemption after a failed attempt",
        "One step away from winning. Usually used in bingo.",
        "an internet lurker, thought to be a pun on “read-only memory“",
        "remodel, renovation (as in a building)",
        "remote control",
        "free to link",
        "remodeling",
        "secondhand shop (selling used or unwanted furniture, household appliances, housewares, and clothes; slightly different from non-profit or charity thrift shops in that they are fundamentally for-profit shops and perceived as one way to help reduce trash)",
        "(noun) restructuring, but with emphasis on lowering headcounts as in downsizing, termination as a redundancy; (verb) to downsize, lay off or terminate as a redundancy. When used in the passive (〜される: ‘’~sareru’’), to get or have been made redundant, downsized (out of a job)",
        "premiere, especially of a film",
        "location scout",
        "novel, something that rouses one’s dreams / longings",
        "silver-gray hair",
        "deluxe train",
        "slang for Strabismus (crosseyed, wandering eye), derived from the image of one eye looking toward London, and the other eye looking toward Paris",
        "ropeway",
        "sexual attraction to fictional and real underage girls, or ephebophilia. (reborrowed into English to refer a genre of manga-style sexual artwork involving childlike female characters)",
        "added time, additional time",
        "roux, most commonly used in describing the sauce of the popular dish, curry rice",
        "Reportage",
        "backpack, Rucksack",
        "service, often used to describe something as being free of charge",
        "to slack off, to shirk one’s duties",
        "sadist",
        "hand brake, parking brake, emergency brake",
        "a kind of soda unrelated to actual cider",
        "signature, autograph",
        "marker, Trade name of Pentel‘s",
        "sandwich",
        "punching bag",
        "salad",
        "salaryman: a salaried office/white collar worker",
        "sexual intercourse",
        "casual sexual partner",
        "sexual harassment",
        "glue, adhesive. A genericized trademark of Cemedine Co., Ltd.",
        "understanding of subtleties",
        "used to refer to a rich person, whether or not they are famous",
        "moment",
        "soap bubble",
        "mechanical pencil",
        "television commercial",
        "sticker, decal",
        "priority seating on public transportation",
        "a cream puff",
        "video game console or computer software; also used to describe tasks or work (such as design) requiring imagination, foresight, and intuition",
        "soft serve (ice cream)",
        "a solar battery",
        "unattractive woman (spade)",
        "a suite in a hotel",
        "a bib, said to come from the name of an American clothing maker who sold bibs",
        "skateboard",
        "translucent",
        "used as a noun to refer to skiing",
        "skinship (bonding through physical contact)",
        "trowel, spade, shovel",
        "slim, stylish, well-dressed, cool, handsome",
        "smartphone",
        "When a plan or transaction happens without inciden",
        "supermarket",
        "tights (US), leggings",
        "used as a noun to mean “spelling“",
        "a ribbon or tassel on a book",
        "syringe, dropper",
        "three primary female body measurements (bust, waist, hips)",
        "labor strike",
        "black tea without milk or lemon",
        "space heater",
        "suit actor, an actor who performs wearing a cartoon-character costume",
        "tobacco, cigarette",
        "when a time limit has been reached",
        "a clutch hit (in baseball), on time",
        "a type of blanket made of a material similar to a beach or bath towel",
        "TV personality/celebrity",
        "theme",
        "numeric keypad",
        "Apparent conflation of Portuguese tempero’' (“seasoning”) and tempora’' (“Ember days“, a Catholic holiday). See also Tempura#Etymology.",
        "a state of excitement",
        "television",
        "video game",
        "a system that converts acoustic vibrations to electrical signals in order to transmit sound, over a distance using wire or radio.",
        "prepaid card for using public telephones",
        "A person in their teens",
        "bunker",
        "toilet, bathroom, washroom, restroom",
        "pork cutlet",
        "(noun) (legal) trouble, a dispute or altercation; (verb) to encounter or experience trouble, to break down or not function as expected (e.g., a device)",
        "playing cards",
        "a sweat shirt",
        "pants for toddlers or babies; diaper",
        "twitter apps",
        "turn signal, a.k.a. blinker or indicator on an automobile",
        "an axolotl",
        "the aisle (in a Western-style or Christian wedding ceremony, as followed by the bridal procession)",
        "talk show",
        "dress shirt (of any color)",
        "of (artificial or boring) uniformity or conformity, lacking of (spontaneous) variation. Used to describe behavior and responses as well as objects. Being “in a rut”",
        "(a single-piece) dress",
        "word processor",
        "a toilet with a built-in bidet (a genericized trademark of TOTO Ltd.)",
        "a sailboat or yacht",
        "young executive",
        "iodine",
        "tincture of iodine",
        "modular bath, prefabricated bath",
        "the rush of traffic and people, and attendant traffic jams and crowding of transportation facilities, that occurs as everyone returns home after extended holidays, esp. New Year’s, Golden Week, and the summer o-bon week.",
        "rope (used in a climbing context, in preference to the general term ‘rōpu’)",
        "seminar",
        "a meditation",
        "zero",
        "tomato",
        "trousers (British English), pants (American English)"
    };

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, gairaigoWords);
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(),
                "Translation " + garaigoTranslation[position], Toast.LENGTH_LONG).show();
    }


}
