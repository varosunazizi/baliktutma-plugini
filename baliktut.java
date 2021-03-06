PK
    ??M            	  META-INF/??  PK
    ??M??H?g   g      META-INF/MANIFEST.MFManifest-Version: 1.0
Ant-Version: Apache Ant 1.9.4
Created-By: 1.7.0_55-b13 (Oracle Corporation)

PK
    ??M               beny/PK
    ??M               beny/plugins/PK
    ??M               beny/plugins/fishing/PK
    ??M               beny/plugins/fishing/bot/PK
    ??M               beny/plugins/fishing/commands/PK
    ??M               beny/plugins/fishing/data/PK
    ??M            "   beny/plugins/fishing/data/rpitems/PK
    ??M            (   beny/plugins/fishing/data/rpitems/types/PK
    ??M               beny/plugins/fishing/threads/PK
    ??M???s  s     beny/plugins/fishing/Main.class????   4 ?
   P
 Q R
 S T
 U V	 
 W
 X Y Z [ \ ] \ ^ _
 
 `
 X a b
  P
 c d e
  P f g
 h i j
  k	 l m
 
 n	 o m	 p m	 q m	 r s	 r t	 r m u v w <init> ()V Code LineNumberTable LocalVariableTable this Lbeny/plugins/fishing/Main; onEnable 
Exceptions 	onDisable data %Lbeny/plugins/fishing/data/HabboData; StackMapTable x hasPermission :(Lcom/eu/habbo/habbohotel/users/Habbo;Ljava/lang/String;)Z habbo %Lcom/eu/habbo/habbohotel/users/Habbo; string Ljava/lang/String; onEmulatorLoadedEvent <(Lcom/eu/habbo/plugin/events/emulator/EmulatorLoadedEvent;)V ex Ljava/lang/Exception; e 9Lcom/eu/habbo/plugin/events/emulator/EmulatorLoadedEvent; j RuntimeVisibleAnnotations "Lcom/eu/habbo/plugin/EventHandler; onUserLogin 4(Lcom/eu/habbo/plugin/events/users/UserLoginEvent;)V 1Lcom/eu/habbo/plugin/events/users/UserLoginEvent; onUserDisconnectEvent 9(Lcom/eu/habbo/plugin/events/users/UserDisconnectEvent;)V 6Lcom/eu/habbo/plugin/events/users/UserDisconnectEvent; onUserExitRoomEvent 7(Lcom/eu/habbo/plugin/events/users/UserExitRoomEvent;)V 4Lcom/eu/habbo/plugin/events/users/UserExitRoomEvent; onUserEnterRoomEvent 8(Lcom/eu/habbo/plugin/events/users/UserEnterRoomEvent;)V 5Lcom/eu/habbo/plugin/events/users/UserEnterRoomEvent; onUserTakeStepEvent 7(Lcom/eu/habbo/plugin/events/users/UserTakeStepEvent;)V 4Lcom/eu/habbo/plugin/events/users/UserTakeStepEvent; 
SourceFile 	Main.java " # y z { | } ~  ? # ? ? ? ? ? ? ? ? x ? ? ? ? #beny/plugins/fishing/data/HabboData ? ? ? # )beny/plugins/fishing/commands/FishCommand ? ? ? .beny/plugins/fishing/commands/InventoryCommand 	fisherman %beny/plugins/fishing/bot/FishermanBot ? ? ? java/lang/Exception ? # ? 2 3 ? ? ? ? ? ? ? ? ? ? beny/plugins/fishing/Main com/eu/habbo/plugin/HabboPlugin !com/eu/habbo/plugin/EventListener java/util/Iterator com/eu/habbo/Emulator getPluginManager %()Lcom/eu/habbo/plugin/PluginManager; !com/eu/habbo/plugin/PluginManager registerEvents G(Lcom/eu/habbo/plugin/HabboPlugin;Lcom/eu/habbo/plugin/EventListener;)V (beny/plugins/fishing/data/rpitems/RPItem load 
cachedData Lgnu/trove/map/hash/THashMap; gnu/trove/map/hash/THashMap values ()Ljava/util/Collection; java/util/Collection iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; 
setFishing (Z)V clear /com/eu/habbo/habbohotel/commands/CommandHandler 
addCommand -(Lcom/eu/habbo/habbohotel/commands/Command;)V 'com/eu/habbo/habbohotel/bots/BotManager addBotDefinition &(Ljava/lang/String;Ljava/lang/Class;)V printStackTrace /com/eu/habbo/plugin/events/users/UserLoginEvent get L(Lcom/eu/habbo/habbohotel/users/Habbo;)Lbeny/plugins/fishing/data/HabboData; 4com/eu/habbo/plugin/events/users/UserDisconnectEvent 2com/eu/habbo/plugin/events/users/UserExitRoomEvent 3com/eu/habbo/plugin/events/users/UserEnterRoomEvent 2com/eu/habbo/plugin/events/users/UserTakeStepEvent 
toLocation (Lcom/eu/habbo/habbohotel/rooms/RoomTile; fromLocation !     !   
  " #  $   /     *? ?    %        &        ' (    ) #  $   >     ? **? ? ?    %             &        ' (   *       + #  $   ?     .? ? ?  L+?  ? +? 	 ? 
M,? ???? ? ?    %       %  & $ ' ' * - + &       , -    . ' (   .    ?  /?  *       0 1  $   @     ?    %       / &         ' (      2 3     4 5   6 7  $   ?     $? Y? ? ? Y? ? ? ? M,? ?       %       4 
 5  7  :  8  9 # ; &        8 9    $ ' (     $ : ;  .    ^ < =     >    ? @  $   T     +? ? M,? ?    %       ?  @  A &         ' (      : A    , -  =     >    B C  $   T     +? ? M,? ?    %       E  F  G &         ' (      : D    , -  =     >    E F  $   T     +? ? M,? ?    %       K  L  M &         ' (      : G    , -  =     >    H I  $   T     +? ? M,? ?    %       Q  R  S &         ' (      : J    , -  =     >    K L  $   l     +? +? ? +? ? M,? ?    %       W  X  Y  [ &        , -     ' (      : M  .     =     >    N    OPK
    ??M ?	$?  ?  +   beny/plugins/fishing/bot/FishermanBot.class????   4*
 J ? ?
  ?	 I ?
 J ?
 ? ?
 ? ?
 ? ? ?
 ? ?
 ? ? ?
 I ?
 ? ?
 ? ?
 ? ?
 ? ?@      
 ? ?
 ? ?
 ! ? ?
 I ?
 ! ? ? ? ? ? ?
  ?
 ? ?
 ? ? ? ?
 ! ? ?
 # ?
 # ? ?
 # ? ?
 # ?
 ! ? ? ? ?
 ? ? ? ?
 ? ?
 ? ?
 ? ?
 9 ?
 ? ?
  ?
  ?
  ? ?
 9 ?
  ? ?
 ? ?
 ? ?
 ? ?
 ! ?
 ? ?
 ? ?
 ? ? ?
  ? ? ?
 I ? ? ? 	brainData Lgnu/trove/map/hash/THashMap; 	Signature ELgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Ljava/lang/Integer;>; <init> (Ljava/sql/ResultSet;)V Code LineNumberTable LocalVariableTable this 'Lbeny/plugins/fishing/bot/FishermanBot; set Ljava/sql/ResultSet; 
Exceptions %(Lcom/eu/habbo/habbohotel/bots/Bot;)V bot "Lcom/eu/habbo/habbohotel/bots/Bot; 	onUserSay 2(Lcom/eu/habbo/habbohotel/rooms/RoomChatMessage;)V value -Lbeny/plugins/fishing/data/rpitems/SellValue; item .Lbeny/plugins/fishing/data/rpitems/RPUserItem; offers Lgnu/trove/set/hash/THashSet; offer Ljava/lang/String; ex Ljava/sql/SQLException; deletedItems coinsAmount I pixelsAmount diamondsAmount data %Lbeny/plugins/fishing/data/HabboData; message /Lcom/eu/habbo/habbohotel/rooms/RoomChatMessage; LocalVariableTypeTable 1Lgnu/trove/set/hash/THashSet<Ljava/lang/String;>; MLgnu/trove/set/hash/THashSet<Lbeny/plugins/fishing/data/rpitems/RPUserItem;>; StackMapTable ? ? ? ? ? ? ? ? onUserEnter ((Lcom/eu/habbo/habbohotel/users/Habbo;)V habbo %Lcom/eu/habbo/habbohotel/users/Habbo; 
initialise ()V 
SourceFile FishermanBot.java O P gnu/trove/map/hash/THashMap O ? K L O Y ? ? ? ? ? ? ? ? ? rp.fishing.bot.keyword.getoffer ? ? ? ? ? "rp.fishing.bot.keyword.confirmsale ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? rp.fishing.bot.offer.nofish ? ? ? ? ? ? ? ? ? ,beny/plugins/fishing/data/rpitems/RPUserItem ?  ? ? ? rp.fishing.bot.offer.worthless gnu/trove/set/hash/THashSet java/lang/StringBuilder   rp.fishing.currencies.credits ? rp.fishing.currencies.duckets rp.fishing.currencies.diamonds , 	
 rp.fishing.bot.offer.offer %offer% ? ? ? java/lang/Integer ? ? java/sql/SQLException ! ?"#$#%& rp.fishing.bot.offer.complete' rp.fishing.bot.welcome 	%keyword%() %beny/plugins/fishing/bot/FishermanBot 'com/eu/habbo/habbohotel/bots/VisitorBot #beny/plugins/fishing/data/HabboData -com/eu/habbo/habbohotel/rooms/RoomChatMessage java/util/Iterator +beny/plugins/fishing/data/rpitems/SellValue 
getMessage ()Ljava/lang/String; java/lang/String toLowerCase com/eu/habbo/Emulator getTexts "()Lcom/eu/habbo/core/TextsManager; com/eu/habbo/core/TextsManager getValue &(Ljava/lang/String;)Ljava/lang/String; contains (Ljava/lang/CharSequence;)Z getRoomUnit *()Lcom/eu/habbo/habbohotel/rooms/RoomUnit; &com/eu/habbo/habbohotel/rooms/RoomUnit getCurrentLocation *()Lcom/eu/habbo/habbohotel/rooms/RoomTile; getHabbo '()Lcom/eu/habbo/habbohotel/users/Habbo; #com/eu/habbo/habbohotel/users/Habbo &com/eu/habbo/habbohotel/rooms/RoomTile distance +(Lcom/eu/habbo/habbohotel/rooms/RoomTile;)D get L(Lcom/eu/habbo/habbohotel/users/Habbo;)Lbeny/plugins/fishing/data/HabboData; getInventory ()Lgnu/trove/set/hash/THashSet; size ()I talk (Ljava/lang/String;)V iterator /()Lgnu/trove/iterator/hash/TObjectHashIterator; hasNext ()Z next ()Ljava/lang/Object; getSellValue /()Lbeny/plugins/fishing/data/rpitems/SellValue; 	getAmount getCurrency append (I)Ljava/lang/StringBuilder; -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString add (Ljava/lang/Object;)Z join @(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String; 
replaceAll 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; getHabboInfo +()Lcom/eu/habbo/habbohotel/users/HabboInfo; 'com/eu/habbo/habbohotel/users/HabboInfo getId valueOf (I)Ljava/lang/Integer; getIntUnixTimestamp put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; containsKey &(Ljava/lang/Object;)Ljava/lang/Object; intValue delete 
getLogging ()Lcom/eu/habbo/core/Logging; com/eu/habbo/core/Logging logSQLException (Ljava/sql/SQLException;)V 
removeItem 1(Lbeny/plugins/fishing/data/rpitems/RPUserItem;)V clear giveCredits (I)V 
givePixels 
givePoints (II)V remove whisper :(Ljava/lang/String;Lcom/eu/habbo/habbohotel/users/Habbo;)V ! I J     K L  M    N   O P  Q   M     *+? *? Y? ? ?    R            S        T U      V W  X     <  O Y  Q   M     *+? *? Y? ? ?    R             S        T U      Z [   \ ]  Q    
  ?+? ? ? 	? 
? ? +? ? ? ? 
? ??*? ? +? ? ? ?  ???+? ? M,? ? ? *? ? 
? ?>66,? ? :?  ? i?  ? :? :? ? K? ?   C   ????   !       ,      9? `>? ? `6? ? `6???? ? ? *?  ? 
? ?+? ? ? 	? 
? ? û !Y? ":? '? #Y? $? %&? '? (? 
? '? )? *W? (? #Y? $? %&? '? +? 
? '? )? *W? (? #Y? $? %&? '? ,? 
? '? )? *W-? .:*? /? 
0? 1? *? +? ? 2? 3? 4? 5x`? 4? 6W?+? ? ? ? 
? ? *? +? ? 2? 3? 4? 7? ?*? +? ? 2? 3? 4? 8? 9? :? 5? ɻ !Y? ":,? ? :?  ? 7?  ? :? ? ? ? ;? *W? :	? =	? >???? :?  ? ?  ? :,? ????? @? +? ? A? +? ? B? +? ? C*? D? 
? *? +? ? 2? 3? 4? EW?? Iad <  R   ? 9   $ E % M ' W ( c ) d - f . i / l 1 ? 2 ? 3 ? 4 ? 6 ? 7 ? : ? ; ? > ? B ? D ? E ? F  I J L" MF PK Qp Tu U? X? Y? [? ]? a! c* fI hT iY ja nd lf mn oq q? r? s? u? x? y? |? }? ?? ?? ?? ?? ?? ? S   ?  ? P ^ _  ? W ` a  ? b c ? 2 d e f  f g 	I % ` a ?  ` a * ? h c  f? i j  i~ k j  l{ l j  M? m n   ? T U    ? o p  q     ? b r * ? h s  t   n *? 9 u?   v w u x  ? J y z
? 	? ? E {))? :? ] { x? - yB |? 	? ?  x? ? !  v w    } ~  Q   S     *? F? 
G? 	? 
? 1+? H?    R   
    ?  ? S        T U       ?  	 ? ?  Q          ?    R       ?  ?    ?PK
    ??M????  ?  /   beny/plugins/fishing/commands/FishCommand.class????   4 ? O
 P Q R
 S T U
 V W
 $ X
 Y Z
 [ \
 ] ^
 [ _
 ` a
 b c
 d e
 b f
 g h
 i j
 d k l m n o p q p r s t u	 v w
 [ x
 d y
 z { | } ~
 ] 
 ] ? ? ? <init> ()V Code LineNumberTable LocalVariableTable this +Lbeny/plugins/fishing/commands/FishCommand; handle F(Lcom/eu/habbo/habbohotel/gameclients/GameClient;[Ljava/lang/String;)Z bot "Lcom/eu/habbo/habbohotel/bots/Bot; item )Lcom/eu/habbo/habbohotel/users/HabboItem; gc 0Lcom/eu/habbo/habbohotel/gameclients/GameClient; strings [Ljava/lang/String; ru (Lcom/eu/habbo/habbohotel/rooms/RoomUnit; data %Lbeny/plugins/fishing/data/HabboData; room $Lcom/eu/habbo/habbohotel/rooms/Room; currentTile (Lcom/eu/habbo/habbohotel/rooms/RoomTile; tileInfront hasWater Z hasBot StackMapTable ? ? 5 ? ? ? ? ? 
Exceptions ? 
SourceFile FishCommand.java cmd_fish ? ? ? commands.keys.cmd_fish ? ? ? ; ? ? ? % ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?  com/eu/habbo/habbohotel/bots/Bot %beny/plugins/fishing/bot/FishermanBot rp.fishing.alerts.nobot ? ? ? ? ? ? ? ? ? ? 'com/eu/habbo/habbohotel/users/HabboItem ;com/eu/habbo/habbohotel/items/interactions/InteractionWater rp.fishing.alerts.nowater ? ? ? ? )beny/plugins/fishing/commands/FishCommand (com/eu/habbo/habbohotel/commands/Command .com/eu/habbo/habbohotel/gameclients/GameClient &com/eu/habbo/habbohotel/rooms/RoomUnit #beny/plugins/fishing/data/HabboData "com/eu/habbo/habbohotel/rooms/Room &com/eu/habbo/habbohotel/rooms/RoomTile java/util/Iterator java/lang/Exception com/eu/habbo/Emulator getTexts "()Lcom/eu/habbo/core/TextsManager; com/eu/habbo/core/TextsManager getValue &(Ljava/lang/String;)Ljava/lang/String; java/lang/String split '(Ljava/lang/String;)[Ljava/lang/String; ((Ljava/lang/String;[Ljava/lang/String;)V getHabbo '()Lcom/eu/habbo/habbohotel/users/Habbo; #com/eu/habbo/habbohotel/users/Habbo getRoomUnit *()Lcom/eu/habbo/habbohotel/rooms/RoomUnit; get L(Lcom/eu/habbo/habbohotel/users/Habbo;)Lbeny/plugins/fishing/data/HabboData; getHabboInfo +()Lcom/eu/habbo/habbohotel/users/HabboInfo; 'com/eu/habbo/habbohotel/users/HabboInfo getCurrentRoom &()Lcom/eu/habbo/habbohotel/rooms/Room; getCurrentLocation *()Lcom/eu/habbo/habbohotel/rooms/RoomTile; 	getLayout ,()Lcom/eu/habbo/habbohotel/rooms/RoomLayout; getBodyRotation 2()Lcom/eu/habbo/habbohotel/rooms/RoomUserRotation; .com/eu/habbo/habbohotel/rooms/RoomUserRotation ()I (com/eu/habbo/habbohotel/rooms/RoomLayout getTileInFront S(Lcom/eu/habbo/habbohotel/rooms/RoomTile;I)Lcom/eu/habbo/habbohotel/rooms/RoomTile; getCurrentBots ()Lgnu/trove/map/TIntObjectMap; gnu/trove/map/TIntObjectMap valueCollection ()Ljava/util/Collection; java/util/Collection iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; 4com/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles WIRED 6Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles; whisper K(Ljava/lang/String;Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles;)V 
getItemsAt G(Lcom/eu/habbo/habbohotel/rooms/RoomTile;)Lgnu/trove/set/hash/THashSet; gnu/trove/set/hash/THashSet /()Lgnu/trove/iterator/hash/TObjectHashIterator; 	isFishing 
setFishing (Z)V ! # $       % &  '   B     *? ? ? ? ?    (   
       )        * +    , -  '  <     ?+? ? 	N+? ? 
:+? ? ? :-? :? -? ? ? :66	? ?  ?  :

?  ? 
?  ? :? ? 6	???	? +? ? ? ? ? ?? ? :

?  ? 
?  ? :? ? 6???? +? ?  ? ? ? ?? !? ? ? "?    (   ^          ! # " 6 $ 9 % < ' c ( k ) n + q - v . ? / ? 2 ? 3 ? 4 ? 6 ? 8 ? 9 ? : ? = ? @ )   z  c  . /  ?  0 1    ? * +     ? 2 3    ? 4 5   ? 6 7   ? 8 9   ? : ;  # ? < =  6 ? > =  9 ? ? @  < ? A @ 	 B   _ 
? M  C D E F G H I I J   ? ?  J ? M G?   
 C D E F G H I I  G K     L  M    NPK
    ??M??[?`  `  4   beny/plugins/fishing/commands/InventoryCommand.class????   4 ? G
 H I J
 K L M
   N
 # O
 P Q
 R S
 R T U
  V W
  X Y
  Z
 [ \ ]
 [ ^ _ ` a b a c d
  e
 f g
  h
 [ i
  j k
 f l m n
 o p q r <init> ()V Code LineNumberTable LocalVariableTable this 0Lbeny/plugins/fishing/commands/InventoryCommand; handle F(Lcom/eu/habbo/habbohotel/gameclients/GameClient;[Ljava/lang/String;)Z item *Lbeny/plugins/fishing/data/rpitems/RPItem; amount I key gc 0Lcom/eu/habbo/habbohotel/gameclients/GameClient; strings [Ljava/lang/String; data %Lbeny/plugins/fishing/data/HabboData; map Lgnu/trove/map/hash/THashMap; 	inventory Ljava/lang/String; LocalVariableTypeTable ELgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Ljava/lang/Integer;>; StackMapTable s t n u 
Exceptions v 
SourceFile InventoryCommand.java cmd_inventory w x y commands.keys.cmd_inventory z { | ; } ~ $  ? ? ? s ? ? ? ? java/lang/StringBuilder $ % rp.fishing.inventory.title ? ? 
---
 ? ? t ? ? rp.fishing.inventory.empty ? ? ? ? ? u ? ? ? ? java/lang/Integer ? ? ? ? ? ? ? ? ? ? ?  x  ? ? 
 java/lang/String ? ? ? .beny/plugins/fishing/commands/InventoryCommand (com/eu/habbo/habbohotel/commands/Command #beny/plugins/fishing/data/HabboData gnu/trove/map/hash/THashMap java/util/Iterator java/lang/Exception com/eu/habbo/Emulator getTexts "()Lcom/eu/habbo/core/TextsManager; com/eu/habbo/core/TextsManager getValue &(Ljava/lang/String;)Ljava/lang/String; split '(Ljava/lang/String;)[Ljava/lang/String; ((Ljava/lang/String;[Ljava/lang/String;)V .com/eu/habbo/habbohotel/gameclients/GameClient getHabbo '()Lcom/eu/habbo/habbohotel/users/Habbo; get L(Lcom/eu/habbo/habbohotel/users/Habbo;)Lbeny/plugins/fishing/data/HabboData; getInventoryCounts ()Lgnu/trove/map/hash/THashMap; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; size ()I keySet ()Ljava/util/Set; java/util/Set iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; intValue (beny/plugins/fishing/data/rpitems/RPItem getItem -(I)Lbeny/plugins/fishing/data/rpitems/RPItem; valueOf (I)Ljava/lang/Integer; &(Ljava/lang/Object;)Ljava/lang/Object; (I)Ljava/lang/StringBuilder; getName #com/eu/habbo/habbohotel/users/Habbo alert ([Ljava/lang/String;)V ! " #       $ %  &   B     *? ? ? ? ?    '   
       (        ) *    + ,  &  ?  
   ?+? ? 	N-? 
:? Y? ? ? ? ? ? :? ? "? Y? ? ? ? ? ? :? l? ?  :?  ? V?  ? ? 6? :? ? ? ? 6	? Y? ? 	? ? ? ? ? ? :???+? ?  YS? !?    '   2         *  2  Q ! v " } # ? $ ? % ? ( ? * (   \ 	 } : - .  ? ( / 0 	 v A 1 0    ? ) *     ? 2 3    ? 4 5   ? 6 7   ? 8 9  * ? : ;  <      ? 8 =  >    ? Q ? @ A?  B? \ C     D  E    FPK
    ??MK??  ?  )   beny/plugins/fishing/data/HabboData.class????   4z
 Z ?	 ? ?	 ? ? ?
  ?	 ? ?
 ? ? ?
 ? ?
 ? ?	 ? ? ? ? ? ?
 ? ? ?
  ?
 ? ?
 ? ? ?
 ? ? ?
 ? ?
 ? ?
 ? ?
 ? ?
 ? ?
 ? ? ? ????
 ? ? ?
   ?
   ?
 ? ? ? ?
 ? ? ?
 ? ?	 ? ?
 % ?
 $ ?
 $ ? ?
  ?
  ? ?
 0 ?
 ? ?
  ? ? ? ? ? ?
 6 ?
  ?
 0 ?
 0 ?
  ?
 0 ?	 ? ?
 ? ? ?
 ? ?
 ? ?
 ? ?
 ? ?
 ? ? ?  ? ?

	




 Q
 6  
cachedData Lgnu/trove/map/hash/THashMap; 	Signature WLgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Lbeny/plugins/fishing/data/HabboData;>; habbo %Lcom/eu/habbo/habbohotel/users/Habbo; 	isFishing Z futureFishing Ljava/util/concurrent/Future; 	inventory Lgnu/trove/set/hash/THashSet; MLgnu/trove/set/hash/THashSet<Lbeny/plugins/fishing/data/rpitems/RPUserItem;>; <init> ((Lcom/eu/habbo/habbohotel/users/Habbo;)V Code LineNumberTable LocalVariableTable ex Ljava/sql/SQLException; this %Lbeny/plugins/fishing/data/HabboData; StackMapTable ? ? setHabbo ()Z 
setFishing (Z)V value currentRoom $Lcom/eu/habbo/habbohotel/rooms/Room; currentRoomUnit (Lcom/eu/habbo/habbohotel/rooms/RoomUnit; getHabbo '()Lcom/eu/habbo/habbohotel/users/Habbo; addItem 1(Lbeny/plugins/fishing/data/rpitems/RPUserItem;)V item .Lbeny/plugins/fishing/data/rpitems/RPUserItem; 
removeItem getInventory ()Lgnu/trove/set/hash/THashSet; O()Lgnu/trove/set/hash/THashSet<Lbeny/plugins/fishing/data/rpitems/RPUserItem;>; getInventoryCounts ()Lgnu/trove/map/hash/THashMap; val I type map LocalVariableTypeTable ELgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Ljava/lang/Integer;>; ? ? G()Lgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Ljava/lang/Integer;>; setFutureFishing )(Ljava/util/concurrent/ScheduledFuture;)V run &Ljava/util/concurrent/ScheduledFuture; get L(Lcom/eu/habbo/habbohotel/users/Habbo;)Lbeny/plugins/fishing/data/HabboData; data loadInventory ()V *Lbeny/plugins/fishing/data/rpitems/RPItem; stm Ljava/sql/PreparedStatement; set Ljava/sql/ResultSet; con Ljava/sql/Connection; 
Exceptions <clinit> 
SourceFile HabboData.java h ? _ ` a b gnu/trove/set/hash/THashSet e f ? ? java/sql/SQLException !"#$% c d&' v()*+ *beny/plugins/fishing/threads/FishingThread h,-./0 rp.fishing.time.max123 rp.fishing.time.min4567 ?89:;<=>?@ i rp.fishing.effect_id java/lang/IntegerAB Acom/eu/habbo/messages/outgoing/rooms/users/RoomUserEffectComposer hCDEFG @com/eu/habbo/messages/outgoing/rooms/users/RoomUserShoutComposer -com/eu/habbo/habbohotel/rooms/RoomChatMessageHI rp.fishing.fishing.beginsJKLMNO hP hQ rp.fishing.fishing.endsRSTS gnu/trove/map/hash/THashMap ? ?UVW vXY ,beny/plugins/fishing/data/rpitems/RPUserItemZ[\]^S ?_`[ab [ \c[ #beny/plugins/fishing/data/HabboData u i h idefghijk 9SELECT * FROM `rp_fishing_user_items` WHERE `user_id` = ?lmnBopX vqrstu[ fishvS 2beny/plugins/fishing/data/rpitems/types/RPFishItem id user_id 
extra_datawL hx java/lang/Exceptiony ? java/lang/Object #com/eu/habbo/habbohotel/users/Habbo "com/eu/habbo/habbohotel/rooms/Room &com/eu/habbo/habbohotel/rooms/RoomUnit java/util/Iterator java/sql/Connection java/sql/PreparedStatement java/sql/ResultSet (beny/plugins/fishing/data/rpitems/RPItem java/lang/String com/eu/habbo/Emulator 
getLogging ()Lcom/eu/habbo/core/Logging; com/eu/habbo/core/Logging logSQLException (Ljava/sql/SQLException;)V java/util/concurrent/Future isCancelled cancel (Z)Z getThreading (()Lcom/eu/habbo/threading/ThreadPooling; ((Lbeny/plugins/fishing/data/HabboData;)V 	getRandom ()Ljava/util/Random; 	getConfig *()Lcom/eu/habbo/core/ConfigurationManager; &com/eu/habbo/core/ConfigurationManager getInt (Ljava/lang/String;)I java/util/Random nextInt (I)I $com/eu/habbo/threading/ThreadPooling =(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture; getHabboInfo +()Lcom/eu/habbo/habbohotel/users/HabboInfo; 'com/eu/habbo/habbohotel/users/HabboInfo getCurrentRoom &()Lcom/eu/habbo/habbohotel/rooms/Room; getRoomUnit *()Lcom/eu/habbo/habbohotel/rooms/RoomUnit; makeSit setEffectId (II)V +(Lcom/eu/habbo/habbohotel/rooms/RoomUnit;)V compose '()Lcom/eu/habbo/messages/ServerMessage; sendComposer ((Lcom/eu/habbo/messages/ServerMessage;)V getTexts "()Lcom/eu/habbo/core/TextsManager; com/eu/habbo/core/TextsManager getValue &(Ljava/lang/String;)Ljava/lang/String; 4com/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles NORMAL 6Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles; ?(Ljava/lang/String;Lcom/eu/habbo/habbohotel/users/Habbo;Lcom/eu/habbo/habbohotel/users/Habbo;Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles;)V 2(Lcom/eu/habbo/habbohotel/rooms/RoomChatMessage;)V add (Ljava/lang/Object;)Z remove iterator /()Lgnu/trove/iterator/hash/TObjectHashIterator; hasNext next ()Ljava/lang/Object; getType ()I valueOf (I)Ljava/lang/Integer; containsKey &(Ljava/lang/Object;)Ljava/lang/Object; intValue put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; getId getDatabase "()Lcom/eu/habbo/database/Database; com/eu/habbo/database/Database getDataSource &()Lcom/zaxxer/hikari/HikariDataSource; "com/zaxxer/hikari/HikariDataSource getConnection ()Ljava/sql/Connection; prepareStatement 0(Ljava/lang/String;)Ljava/sql/PreparedStatement; setInt executeQuery ()Ljava/sql/ResultSet; getItem -(I)Lbeny/plugins/fishing/data/rpitems/RPItem; getTypename ()Ljava/lang/String; hashCode equals 	getString (IIILjava/lang/String;)V close ! ? Z    	 [ \  ]    ^  _ `    a b    c d    e f  ]    g   h i  j   ?     )*? *+? *? *? Y? ? *? ? M? 	,? 
?        k   & 	   %  & 	 '  (  +  .   , ! - ( 0 l      !  m n    ) o p     ) _ `  q    ?    r s  t  u i  j   >     *+? ?    k   
    3  4 l        o p      _ `   a v  j   /     *? ?    k       7 l        o p    w x  j  ? 	   7*? ? ?*? *? ? $*? ? *? ?  ? *? ?  W? T*? ? M*? ? *? ?  ? :*? ? Y*? ? ? ? ? ? d? ? ? `?h?? ? *? ? ? M*? ? N,? ?-? ?*? ? S,*? ? -? ? ? ,?  Y-? !? "? #,? $Y? %Y? &'? (*? *? ? )? *? +? ,? #? @-? ,?  Y-? !? "? #,? $Y? %Y? &-? (*? *? ? )? *? +? ,? #?    k   N    <  = 	 ?  A ( B 6 D P E ? H ? I ? K ? L ? M ? N ? O ? P ? S ? T U6 X l   *   7 o p    7 y b  ? ? z {  ? ? | }  q    	,6? q ~ <  ? ?  j   /     *? ?    k       [ l        o p    ? ?  j   B     
*? +? .W?    k   
    _ 	 ` l       
 o p     
 ? ?   ? ?  j   B     
*? +? /W?    k   
    c 	 d l       
 o p     
 ? ?   ? ?  j   /     *? ?    k       g l        o p   ]    ?  ? ?  j       m? 0Y? 1L*? 2? 3M,? 4 ? U,? 5 ? 6N-? 76+? 8? 9? (+? 8? :? ? ;6+? 8`? 8? <W? +? 8? 8? <W???+?    k   * 
   l  n # o ) q 5 r F s W t Z v h x k z l   4  F  ? ?  ) ? ? ?  # E ? ?    m o p    e ? \  ?      e ? ?  q    ?  ? ?? I ?? ?  ]    ?  ? ?  j   >     *+? ?    k   
    ~   l        o p      ? ?  	 ? ?  j   ?     S? =*? ? >? 8? 9? &? =*? ? >? 8? :? ?L+? *? +*? @+?? ?Y*? AL? =*? ? >? 8+? <W+?    k   "    ?  ? ' ? / ? 4 ? 6 ? ? ? Q ? l      '  ? p    S _ `   ?  ? p  q    ? 4 r?   ? ?  j  ?     ?? B? C? DL+E? F M,*? ? ? >? G ,? H N-? I ? ?-J? K ? L:? M:6? N?      !    /?X   O? P? 6?   C          *? ? QY-R? K -S? K -J? K -T? U ? V? .W? 2*? ? 6Y-R? K -S? K -J? K -T? U ? W? .W??F? M+? Y ? M?  
 ? ? X ? ? ? X  k   F    ? 
 ?  ? $ ? + ? 4 ? A ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? l   4  A ? ? ?   ? ? ?  + ? ? ?    ? o p   
 ? ? ?  q   + ? + ? ? ?? 8 ? ?1? .? B ? H ?  ?       ? ?  j   #      ? 0Y? 1? =?    k         ?    ?PK
    ??M??=?3  3  .   beny/plugins/fishing/data/rpitems/RPItem.class????   4 ?
 ) _	  `	  a	  b	  c	  d	  e
 f g
 h i
 j k l
  _	  m n o p q r s t u s v
 w x y
 w z { | . s } ~ 0  4 5
  ?
  ? ?
 " ? o ?
 ? ?
  ?
  ?
  ? ? items Lgnu/trove/map/hash/THashMap; 	Signature \Lgnu/trove/map/hash/THashMap<Ljava/lang/Integer;Lbeny/plugins/fishing/data/rpitems/RPItem;>; id I name Ljava/lang/String; saleCurrency 	saleValue typename chance <init> +(ILjava/lang/String;IILjava/lang/String;I)V Code LineNumberTable LocalVariableTable this *Lbeny/plugins/fishing/data/rpitems/RPItem; getId ()I getName ()Ljava/lang/String; getSaleCurrency getSaleValue getTypename 	getChance load ()V currencyType set Ljava/sql/ResultSet; e Ljava/lang/Exception; con Ljava/sql/Connection; StackMapTable ? ? ? ? 
Exceptions ? addItem .(ILbeny/plugins/fishing/data/rpitems/RPItem;)V item getItem -(I)Lbeny/plugins/fishing/data/rpitems/RPItem; getItems ()Ljava/lang/Iterable; B()Ljava/lang/Iterable<Lbeny/plugins/fishing/data/rpitems/RPItem;>; 
SourceFile RPItem.java 6 F . / 0 1 2 / 3 / 4 1 5 / ? ? ? ? ? ? ? ? ? gnu/trove/map/hash/THashMap * +  SELECT * FROM `rp_fishing_items` ? ? ? ? ? ? ? ? ? sale_currency ? ? ? ? > duckets ? ? pixels diamonds ? ? (beny/plugins/fishing/data/rpitems/RPItem 
sale_value 6 7 U V java/lang/Exception ? F ? F ? ? ? ? ? ? ? ? ? java/lang/Object java/sql/Connection java/sql/ResultSet java/lang/String java/sql/SQLException com/eu/habbo/Emulator getDatabase "()Lcom/eu/habbo/database/Database; com/eu/habbo/database/Database getDataSource &()Lcom/zaxxer/hikari/HikariDataSource; "com/zaxxer/hikari/HikariDataSource getConnection ()Ljava/sql/Connection; prepareStatement 0(Ljava/lang/String;)Ljava/sql/PreparedStatement; java/sql/PreparedStatement executeQuery ()Ljava/sql/ResultSet; next ()Z 	getString &(Ljava/lang/String;)Ljava/lang/String; hashCode equals (Ljava/lang/Object;)Z getInt (Ljava/lang/String;)I printStackTrace close java/lang/Integer valueOf (I)Ljava/lang/Integer; put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; get &(Ljava/lang/Object;)Ljava/lang/Object; values ()Ljava/util/Collection; !  )    
 * +  ,    -  . /    0 1    2 /    3 /    4 1    5 /     6 7  8   ?     &*? *? *,? *? *? *? *? ?    9   "       	          %  :   H    & ; <     & . /    & 0 1    & 2 /    & 3 /    & 4 1    & 5 /   = >  8   /     *? ?    9       " :        ; <    ? @  8   /     *? ?    9       & :        ; <    A >  8   /     *? ?    9       * :        ; <    B >  8   /     *? ?    9       . :        ; <    C @  8   /     *? ?    9       2 :        ; <    D >  8   /     *? ?    9       6 :        ; <   	 E F  8  ? 
   ? ? 	? 
K? Y? ? *?  ?  L+?  ? ?=+?  N6-? ?     M   ?~?   2?	?   Aw;jK   #-? ? $6? -? ? 6? -? ? 6?      #                !=? =+?  ? Y+?  +?  +?  +?  +?  ?  ? !??8? L+? #*? $ ? L+? #?   ? ? " ? ? ? "  9   N    ; 
 <  ? " A + B - C ? F ? G ? J ? M ? N ? R ? P ? Q ? U ? Y ? W ? X Z :   4  - ? G /  " ? H I  ?  J K  ?  J K  
 ? L M   N   ( ? " O P? = Q? ? =B RH R S     T 	 U V  8   E     ? ? %+? &W?    9   
    ]  ^ :        . /      W <  	 X Y  8   8     ? ? %? '? ?    9       a :        . /   	 Z [  8         ? ? (?    9       e ,    \  ]    ^PK
    ??Mj?2v  v  2   beny/plugins/fishing/data/rpitems/RPUserItem.class????   4 ?
  E	  F	  G	  H	  I
 J K
 J L M
 J N
 J O
  P
 Q R
 S T
 U V W X Y Z [ Z \ X ] ^ _
 Q `
 a b
  c d e id I user_id type 
extra_data Ljava/lang/String; <init> (IIILjava/lang/String;)V Code LineNumberTable LocalVariableTable this .Lbeny/plugins/fishing/data/rpitems/RPUserItem; getItemName ()Ljava/lang/String; getSellValue /()Lbeny/plugins/fishing/data/rpitems/SellValue; setId (I)V getId ()I 	getUserId getType getExtraData delete ()V stm Ljava/sql/PreparedStatement; e Ljava/sql/SQLException; Ljava/lang/Exception; 
connection Ljava/sql/Connection; StackMapTable d f ^ _ g 
Exceptions 
SourceFile RPUserItem.java ! 4          h i j k ) +beny/plugins/fishing/data/rpitems/SellValue l / m / ! n o p q r s t u v w 2DELETE FROM `rp_fishing_user_items` WHERE `id` = ? f x y z { n | } ~ 4 java/lang/Exception java/sql/SQLException  ? ? ? ? ? 4 ,beny/plugins/fishing/data/rpitems/RPUserItem java/lang/Object java/sql/Connection java/lang/Throwable (beny/plugins/fishing/data/rpitems/RPItem getItem -(I)Lbeny/plugins/fishing/data/rpitems/RPItem; getName getSaleCurrency getSaleValue (II)V com/eu/habbo/Emulator getDatabase "()Lcom/eu/habbo/database/Database; com/eu/habbo/database/Database getDataSource &()Lcom/zaxxer/hikari/HikariDataSource; "com/zaxxer/hikari/HikariDataSource getConnection ()Ljava/sql/Connection; prepareCall 0(Ljava/lang/String;)Ljava/sql/CallableStatement; java/sql/PreparedStatement setInt execute ()Z close 
getLogging ()Lcom/eu/habbo/core/Logging; com/eu/habbo/core/Logging logSQLException (Ljava/sql/SQLException;)V printStackTrace !                           	  ! "  #   ?     *? *? *? *? *? ?    $          	        %   4     & '                             ( )  #   5     *? ? ? ?    $        %        & '    * +  #   F     ? Y*? ? ? 	*? ? ? 
? ?    $        %        & '    , -  #   >     *? ?    $   
    #  $ %        & '          . /  #   /     *? ?    $       ' %        & '    0 /  #   /     *? ?    $       + %        & '    1 /  #   /     *? ?    $       / %        & '    2 )  #   /     *? ?    $       3 %        & '    3 4  #  ?     {? ? ? L+?  M,*? ?  ,?  W+?  ? <M? 8M? ,? +?  ? 'M? #M,? +?  ? M? N+?  ? :-?? L? +? ? L+? ?  % + .  
 % 2  : @ C  
 % G  L R U  
 % Y   2 : Y   G L Y   Z ` c    g j    g u   $   n    8 
 :  ;  < % G + I / J 2 > 3 @ : G @ I D J G B H C L G R I V J Y F Z G ` I g S j L k N r S u P v R z T %   H    5 6  3  7 8  H  7 9  
 ] : ;  k  7 8  v  7 9    { & '   <   G ? .  = >  ?C @P ?C ?M ?C A? 	  = >  A  ?? B @J ? B       C    DPK
    ??Mň??H  H  1   beny/plugins/fishing/data/rpitems/SellValue.class????   4 
  	  	     currency I amount <init> (II)V Code LineNumberTable LocalVariableTable this -Lbeny/plugins/fishing/data/rpitems/SellValue; getCurrency ()I 	getAmount 
SourceFile SellValue.java 	      +beny/plugins/fishing/data/rpitems/SellValue java/lang/Object ()V !                  	 
     Y     *? *? *? ?              	                                    /     *? ?                               /     *? ?                             PK
    ??MwZ?z  z  8   beny/plugins/fishing/data/rpitems/types/RPFishItem.class????   4 ?
  :
 ; <
 = >
 ? @ A B C
  D E F
  G
  H E I E J E K L M L N
  O P
  Q B R S
 ; T
 U V W X <init> (IIILjava/lang/String;)V Code LineNumberTable LocalVariableTable this 4Lbeny/plugins/fishing/data/rpitems/types/RPFishItem; id I user_id type 
extra_data Ljava/lang/String; insert ()V stm Ljava/sql/PreparedStatement; set Ljava/sql/ResultSet; e Ljava/lang/Exception; con Ljava/sql/Connection; ex Ljava/sql/SQLException; StackMapTable Y Z [ P S 
SourceFile RPFishItem.java   \ ] ^ _ ` a b c d VINSERT INTO `rp_fishing_user_items` (`user_id`, `type`, `extra_data`) VALUES (?, ?, ?) Y e f g h Z i j k h l m n o p q r s [ t q u v w x java/lang/Exception y ' z ' java/sql/SQLException { | } ~  2beny/plugins/fishing/data/rpitems/types/RPFishItem ,beny/plugins/fishing/data/rpitems/RPUserItem java/sql/Connection java/sql/PreparedStatement java/sql/ResultSet com/eu/habbo/Emulator getDatabase "()Lcom/eu/habbo/database/Database; com/eu/habbo/database/Database getDataSource &()Lcom/zaxxer/hikari/HikariDataSource; "com/zaxxer/hikari/HikariDataSource getConnection ()Ljava/sql/Connection; prepareStatement 1(Ljava/lang/String;I)Ljava/sql/PreparedStatement; 	getUserId ()I setInt (II)V getType getExtraData ()Ljava/lang/String; 	setString (ILjava/lang/String;)V execute ()Z getGeneratedKeys ()Ljava/sql/ResultSet; next getInt (I)I setId (I)V printStackTrace close 
getLogging ()Lcom/eu/habbo/core/Logging; com/eu/habbo/core/Logging logSQLException (Ljava/sql/SQLException;)V !               `     
*? ?       
     	     4    
       
   !    
 " !    
 # !    
 $ %   & '    n     |? ? ? L+?  M,*? ?  ,*? 	?  ,*? 
?  ,?  W,?  N-?  ? *-?  ? ???? M,? +?  ? M,? ? L? +? ?  
 Z ]  b h k    p s      R     
      *  5  <  C ! L " Z ' ] % ^ & b * h . k , l - p 2 s 0 t 1 { 3    H   F ( )  C  * +  ^  , -  l  , -  
 f . /  t  0 1    |     2   " ? C 3 4 5? B 6H 6? B 7  8    9PK
    ??Mj=G	    0   beny/plugins/fishing/threads/FishingThread.class????   4 ?
 . L	 - M
 N O
 P Q
 R S
 - T U
 R V
 ( V W
  X
  Y
 N Z [ \
 ] ^ _
 ` a b
 ( c
 d e	 f g
  h
  i
  j
 k l
 ] m
 ] n
 ] o p
 q r s
 t u
 v w
 N x
 ( y z { | } | ~ 
 ( ? ?
 d ?
 ( ? ? ? ? data %Lbeny/plugins/fishing/data/HabboData; <init> ((Lbeny/plugins/fishing/data/HabboData;)V Code LineNumberTable LocalVariableTable this ,Lbeny/plugins/fishing/threads/FishingThread; run ()V currentRoom $Lcom/eu/habbo/habbohotel/rooms/Room; 
caughtItem *Lbeny/plugins/fishing/data/rpitems/RPItem; fish 4Lbeny/plugins/fishing/data/rpitems/types/RPFishItem; getRandomFish ,()Lbeny/plugins/fishing/data/rpitems/RPItem; item accumulated I 
lookingFor current StackMapTable ? 
SourceFile FishingThread.java 2 : 0 1 ? ? ? ? ? ? ? ? ? A B 2beny/plugins/fishing/data/rpitems/types/RPFishItem ? ?   2 ? ? : ? ? @com/eu/habbo/messages/outgoing/rooms/users/RoomUserShoutComposer -com/eu/habbo/habbohotel/rooms/RoomChatMessage ? ? ? rp.fishing.fishing.catches ? ? ? %item% ? ? ? ? ? ? ? ? 2 ? 2 ? ? ? ? ? ? ? ? ? ? ? ? rp.fishing.time.max ? ? ? rp.fishing.time.min ? ? ? ? 9 ? ? ? ? ? ? ? ? ? ? ? ? ? (beny/plugins/fishing/data/rpitems/RPItem ? ? ? ? ? ? *beny/plugins/fishing/threads/FishingThread java/lang/Object java/lang/Runnable java/util/Iterator #beny/plugins/fishing/data/HabboData getHabbo '()Lcom/eu/habbo/habbohotel/users/Habbo; #com/eu/habbo/habbohotel/users/Habbo getHabboInfo +()Lcom/eu/habbo/habbohotel/users/HabboInfo; 'com/eu/habbo/habbohotel/users/HabboInfo getCurrentRoom &()Lcom/eu/habbo/habbohotel/rooms/Room; getId ()I (IIILjava/lang/String;)V insert addItem 1(Lbeny/plugins/fishing/data/rpitems/RPUserItem;)V com/eu/habbo/Emulator getTexts "()Lcom/eu/habbo/core/TextsManager; com/eu/habbo/core/TextsManager getValue &(Ljava/lang/String;)Ljava/lang/String; getName ()Ljava/lang/String; java/lang/String 
replaceAll 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 4com/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles NORMAL 6Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles; ?(Ljava/lang/String;Lcom/eu/habbo/habbohotel/users/Habbo;Lcom/eu/habbo/habbohotel/users/Habbo;Lcom/eu/habbo/habbohotel/rooms/RoomChatMessageBubbles;)V 2(Lcom/eu/habbo/habbohotel/rooms/RoomChatMessage;)V compose '()Lcom/eu/habbo/messages/ServerMessage; "com/eu/habbo/habbohotel/rooms/Room sendComposer ((Lcom/eu/habbo/messages/ServerMessage;)V getThreading (()Lcom/eu/habbo/threading/ThreadPooling; 	getRandom ()Ljava/util/Random; 	getConfig *()Lcom/eu/habbo/core/ConfigurationManager; &com/eu/habbo/core/ConfigurationManager getInt (Ljava/lang/String;)I java/util/Random nextInt (I)I $com/eu/habbo/threading/ThreadPooling =(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture; setFutureFishing )(Ljava/util/concurrent/ScheduledFuture;)V getItems ()Ljava/lang/Iterable; java/lang/Iterable iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; getTypename equals (Ljava/lang/Object;)Z 	getChance ! - .  /   0 1     2 3  4   F     
*? *+? ?    5          	  6       
 7 8     
 0 1   9 :  4  	 	    ?*? ? ? ? L? M? Y*? ? ? ? ,? 	
? N-? *? -? +? Y? Y? ? ,? ? *? ? *? ? ? ? ? ? ? *? ? *? ? ? ?  ? d? !?  ? `?h?? "? #?    5   "         .  2  : ! q " ? # 6   *    ? 7 8    ? ; <   ? = >  . w ? @  	 A B  4  "     };? $? % L+? & ? #+? ' ? (M,? )*? +? 
,? ,`;??ڸ ? !<=? $? % N-? & ? .-? ' ? (:? )*? +? ? ,`=? ?????    5   :    &  (  ) * * 1 , 4 . < / > 1 [ 2 h 3 p 4 u 6 x 9 { ; 6   4    C >  [  C >   { D E   < A F E  > ? G E  H    ?  I%? ?  I0?   J    KPK
    ??M.??w^   ^      plugin.json{
  "main" : "beny.plugins.fishing.Main",
  "name" : "Fishing Plugin",
  "author" : "Beny."
}
PK
    ??M            	         ?A    META-INF/??  PK
    ??M??H?g   g              ??+   META-INF/MANIFEST.MFPK
    ??M                      ?A?   beny/PK
    ??M                      ?A?   beny/plugins/PK
    ??M                      ?A  beny/plugins/fishing/PK
    ??M                      ?AE  beny/plugins/fishing/bot/PK
    ??M                      ?A|  beny/plugins/fishing/commands/PK
    ??M                      ?A?  beny/plugins/fishing/data/PK
    ??M            "          ?A?  beny/plugins/fishing/data/rpitems/PK
    ??M            (          ?A0  beny/plugins/fishing/data/rpitems/types/PK
    ??M                      ?Av  beny/plugins/fishing/threads/PK
    ??M???s  s             ???  beny/plugins/fishing/Main.classPK
    ??M ?	$?  ?  +           ??a  beny/plugins/fishing/bot/FishermanBot.classPK
    ??M????  ?  /           ???+  beny/plugins/fishing/commands/FishCommand.classPK
    ??M??[?`  `  4           ???;  beny/plugins/fishing/commands/InventoryCommand.classPK
    ??MK??  ?  )           ??qG  beny/plugins/fishing/data/HabboData.classPK
    ??M??=?3  3  .           ??sg  beny/plugins/fishing/data/rpitems/RPItem.classPK
    ??Mj?2v  v  2           ???u  beny/plugins/fishing/data/rpitems/RPUserItem.classPK
    ??Mň??H  H  1           ????  beny/plugins/fishing/data/rpitems/SellValue.classPK
    ??MwZ?z  z  8           ??O?  beny/plugins/fishing/data/rpitems/types/RPFishItem.classPK
    ??Mj=G	    0           ???  beny/plugins/fishing/threads/FishingThread.classPK
    ??M.??w^   ^              ??y?  plugin.jsonPK      ?   ?    