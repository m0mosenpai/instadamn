package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.24y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC449424y {
    public static final int A01(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    return 3;
                case 1:
                    return 2;
                case 2:
                case 10:
                    return 1;
                case 3:
                    return 4;
                case 4:
                    return 9;
                case 5:
                    return 23;
                case 6:
                    return 17;
                case 7:
                    return 21;
                case 8:
                    return 10;
                case 9:
                    return 18;
                case 11:
                    return 19;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return 25;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Zx, X.8bg] */
    public static final C190228bg A07(C006802i c006802i, UserSession userSession) {
        C190218bf c190218bf;
        long freeMemory;
        long j;
        ActivityManager activityManager;
        C14360o3.A0B(c006802i, 1);
        c006802i.markerStart(17644943);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316860475577034L)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            Object systemService = context.getSystemService("activity");
            if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            freeMemory = memoryInfo.availMem;
            j = memoryInfo.totalMem;
        } else if (C18U.A06(c06090Tz, userSession, 36316860475511497L)) {
            Runtime runtime = Runtime.getRuntime();
            C14360o3.A07(runtime);
            freeMemory = runtime.freeMemory();
            j = runtime.totalMemory();
        } else {
            c190218bf = new C190218bf(0L, 0L);
            c006802i.markerEnd(17644943, (short) 2);
            ?? r2 = new C0Zx() { // from class: X.8bg
            };
            r2.A05("memory_total", Long.valueOf(c190218bf.A01));
            r2.A05("memory_available", Long.valueOf(c190218bf.A00));
            return r2;
        }
        c190218bf = new C190218bf(freeMemory, j);
        c006802i.markerEnd(17644943, (short) 2);
        ?? r22 = new C0Zx() { // from class: X.8bg
        };
        r22.A05("memory_total", Long.valueOf(c190218bf.A01));
        r22.A05("memory_available", Long.valueOf(c190218bf.A00));
        return r22;
    }

    public static final ArrayList A0C(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
            if (abstractC115485Ki instanceof C115475Kh) {
                C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
                List list2 = c115475Kh.A0F.A03;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(A08.A00((CameraToolInfo) it2.next(), c115475Kh.A07));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final MYO A03(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    AbstractC12120kG.A08("IgCameraLoggingUtil", AnonymousClass001.A0O("Unsupported SourceType: ", i), null);
                    return MYO.OTHER;
                }
                return MYO.FEED_RESHARE;
            }
            return MYO.CAPTURE;
        }
        return MYO.GALLERY;
    }

    public static final EnumC203578zI A04(String str, String str2) {
        if (str != null && str2 != null && str.equals("389287015265096")) {
            for (EnumC203578zI enumC203578zI : EnumC203578zI.values()) {
                if (C14360o3.A0K(enumC203578zI.toString(), str2)) {
                    return EnumC203578zI.valueOf(str2);
                }
            }
            return null;
        }
        return null;
    }

    public static final C81X A05(CameraTool cameraTool) {
        if (cameraTool == null) {
            return null;
        }
        switch (cameraTool.ordinal()) {
            case 6:
            case 77:
                return C81X.A0C;
            case 7:
                return C81X.A0D;
            case 18:
                return C81X.A0S;
            case 74:
            case 79:
                return C81X.A1G;
            case 78:
            case 103:
                return C81X.A1F;
            case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
                return C81X.A1w;
            default:
                return null;
        }
    }

    public static final Long A08(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static final String A09(ACRType aCRType) {
        if (aCRType != null) {
            switch (aCRType.ordinal()) {
                case -1:
                case 0:
                case 6:
                    return null;
                case 1:
                    return "ACTIVE_STORY";
                case 2:
                    return "CAMERA_ROLL";
                case 3:
                    return "FEED_CAROUSEL_HISTORICAL";
                case 4:
                    return "HIGHLIGHT_REEL";
                case 5:
                    return "SMART_REEL";
                default:
                    throw new RuntimeException();
            }
        }
        return null;
    }

    public static final ArrayList A0B(List list) {
        String str;
        Long l;
        Double d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5JB c5jb = (C5JB) it.next();
            try {
                String str2 = c5jb.A01.A00;
                C14360o3.A0B(str2, 0);
                C81X A06 = A06(AbstractC003100w.A0k(10, str2));
                if (A06 != null) {
                    C9Vb c9Vb = new C9Vb();
                    c9Vb.A01(A06, "tool");
                    c9Vb.A05("segment_index", Long.valueOf(c5jb.A00));
                    Float f = c5jb.A04;
                    if (f != null) {
                        str = f.toString();
                    } else {
                        str = null;
                    }
                    c9Vb.A06("timer_selector_s", str);
                    if (c5jb.A02 != null) {
                        l = Long.valueOf(r0.floatValue());
                    } else {
                        l = null;
                    }
                    c9Vb.A05("duration_selector_s", l);
                    if (c5jb.A03 != null) {
                        d = Double.valueOf(r0.floatValue());
                    } else {
                        d = null;
                    }
                    c9Vb.A04("speed_selector", d);
                    arrayList.add(c9Vb);
                }
            } catch (NumberFormatException unused) {
                AbstractC12120kG.A07("IgCameraLoggingUtil", AnonymousClass001.A0R("Camera Tool has non-numeric value: ", c5jb.A01.A00), null);
            }
        }
        return arrayList;
    }

    public static final List A0D(String str) {
        if (str != null) {
            Long A0k = AbstractC003100w.A0k(10, str);
            if (A0k == null) {
                AbstractC12120kG.A08("IgCameraLoggingUtil", AnonymousClass001.A0R("Invalid numeric string: ", str), null);
            } else {
                List singletonList = Collections.singletonList(A0k);
                C14360o3.A07(singletonList);
                return singletonList;
            }
        }
        return C16930sl.A00;
    }

    public static final List A0E(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                EnumC203578zI[] values = EnumC203578zI.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (C14360o3.A0K(values[i].toString(), str)) {
                        EnumC203578zI valueOf = EnumC203578zI.valueOf(str);
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    } else {
                        i++;
                    }
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public static final List A0F(List list) {
        if (list != null) {
            C81X[] values = C81X.values();
            int A0L = AbstractC16850sd.A0L(values.length);
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (C81X c81x : values) {
                linkedHashMap.put(Long.valueOf(c81x.A00), c81x);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final int A00(UserSession userSession, Integer num, int i) {
        int A01 = A01(num);
        if (i == 30) {
            if (C18U.A06(C06090Tz.A05, userSession, 36319394506743201L)) {
                return 31;
            }
        } else {
            if (i == 1) {
                return A01;
            }
            if (i != 4) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 0) {
                            return 12;
                        }
                    } else {
                        return 15;
                    }
                } else {
                    return 16;
                }
            } else {
                return 11;
            }
        }
        AbstractC12120kG.A08("IgCameraLoggingUtil", AnonymousClass001.A0c("Logging source type=", " as gallery", i), null);
        return 12;
    }

    public static final EnumC33503Erc A02(int i) {
        switch (i) {
            case -1:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_UNTRACKED;
            case 0:
            default:
                return null;
            case 1:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_GALLERY;
            case 2:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_DESTINATION_PICKER;
            case 3:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_MIDCARD;
            case 4:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_NOTIFICATION;
            case 5:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_PROFILE_CREATION_MENU;
            case 6:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_REELS_VIEWER;
            case 7:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_AUDIO_PAGE;
            case 8:
                return EnumC33503Erc.ACR_BROWSER_ENTRY_POINT_CAMERA_ROLL_MIDCARD;
        }
    }

    public static final C81X A06(Long l) {
        for (C81X c81x : C81X.values()) {
            if (C14360o3.A0K(Long.valueOf(c81x.A00), l)) {
                return c81x;
            }
        }
        return null;
    }

    public static final String A0A(VoiceOption voiceOption) {
        if (voiceOption == null) {
            return NetInfoModule.CONNECTION_TYPE_NONE;
        }
        if (voiceOption != A4M.A0J) {
            String str = voiceOption.A00;
            if (!C14360o3.A0K(str, "Naomi") && !C14360o3.A0K(str, "Voice 1")) {
                if (voiceOption != A4M.A05 && !C14360o3.A0K(str, "Charlie") && !C14360o3.A0K(str, "Voice 2")) {
                    if (voiceOption != A4M.A07 && !C14360o3.A0K(str, "Chester")) {
                        if (voiceOption != A4M.A0C && !C14360o3.A0K(str, "Francesca")) {
                            if (voiceOption != A4M.A00 && !C14360o3.A0K(str, "Alex")) {
                                if (voiceOption != A4M.A01 && !C14360o3.A0K(str, "Billie")) {
                                    if (voiceOption != A4M.A0Q && !C14360o3.A0K(str, "Robot")) {
                                        if (voiceOption != A4M.A0A && !C14360o3.A0K(str, "Demon")) {
                                            if (voiceOption != A4M.A09 && !C14360o3.A0K(str, "Chipmunk")) {
                                                if (voiceOption != A4M.A0I && !C14360o3.A0K(str, "Monster")) {
                                                    if (voiceOption != A4M.A0G && !C14360o3.A0K(str, "Martian")) {
                                                        if (voiceOption != A4M.A0P && !C14360o3.A0K(str, "Radio")) {
                                                            if (voiceOption != A4M.A0V && !C14360o3.A0K(str, "Whisper")) {
                                                                if (voiceOption != A4M.A0H && !C14360o3.A0K(str, "Megaphone")) {
                                                                    if (voiceOption != A4M.A0U && !C14360o3.A0K(str, "Vampire")) {
                                                                        if (voiceOption != A4M.A0N && !C14360o3.A0K(str, "Prospector")) {
                                                                            if (voiceOption != A4M.A0D && !C14360o3.A0K(str, "Friendly")) {
                                                                                if (voiceOption != A4M.A0E && !C14360o3.A0K(str, "Glamorous")) {
                                                                                    if (voiceOption != A4M.A06 && !C14360o3.A0K(str, "Cheerful")) {
                                                                                        if (voiceOption != A4M.A08 && !C14360o3.A0K(str, "Chill")) {
                                                                                            if (voiceOption != A4M.A0B && !C14360o3.A0K(str, "Encouraging")) {
                                                                                                if (voiceOption != A4M.A0R && !C14360o3.A0K(str, "Sage")) {
                                                                                                    if (voiceOption != A4M.A03 && !C14360o3.A0K(str, "Bubbly")) {
                                                                                                        if (voiceOption != A4M.A0L && !C14360o3.A0K(str, "Pirate")) {
                                                                                                            if (voiceOption != A4M.A0F && !C14360o3.A0K(str, "Gracious")) {
                                                                                                                if (voiceOption != A4M.A0S && !C14360o3.A0K(str, "Stuffy")) {
                                                                                                                    if (voiceOption != A4M.A0T && !C14360o3.A0K(str, "Toddler")) {
                                                                                                                        if (voiceOption != A4M.A0O && !C14360o3.A0K(str, "Proud")) {
                                                                                                                            if (voiceOption == A4M.A0M || C14360o3.A0K(str, "Poised")) {
                                                                                                                                return "poised";
                                                                                                                            }
                                                                                                                            return (voiceOption == A4M.A04 || C14360o3.A0K(str, "Calm")) ? "calm" : NetInfoModule.CONNECTION_TYPE_NONE;
                                                                                                                        }
                                                                                                                        return "proud";
                                                                                                                    }
                                                                                                                    return "toddler";
                                                                                                                }
                                                                                                                return "stuffy";
                                                                                                            }
                                                                                                            return "regal";
                                                                                                        }
                                                                                                        return "pirate";
                                                                                                    }
                                                                                                    return "bubbly";
                                                                                                }
                                                                                                return "sage";
                                                                                            }
                                                                                            return "encouraging";
                                                                                        }
                                                                                        return "chill";
                                                                                    }
                                                                                    return "charming";
                                                                                }
                                                                                return "glamorous";
                                                                            }
                                                                            return "friendly";
                                                                        }
                                                                        return "prospector";
                                                                    }
                                                                    return "vampire";
                                                                }
                                                                return "megaphone";
                                                            }
                                                            return "whisperer";
                                                        }
                                                        return "walkie_talkie";
                                                    }
                                                    return "martian";
                                                }
                                                return "monster";
                                            }
                                            return "chipmunk";
                                        }
                                        return "demon";
                                    }
                                    return "robot";
                                }
                                return "billie";
                            }
                            return "alex";
                        }
                        return "francesca";
                    }
                    return "chester";
                }
                return "charlie";
            }
            return "naomi";
        }
        return "naomi";
    }
}
