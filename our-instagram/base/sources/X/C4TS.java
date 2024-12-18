package X;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4TS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TS {
    public static final C4TT[] A0c = {C4TT.A02, C4TT.A05, C4TT.A06};
    public C4TM A01;
    public C4SS A02;
    public ServiceEventCallbackImpl A03;
    public C123245hz A04;
    public C96794Wo A05;
    public C96854Wv A06;
    public InterfaceC95914Ta A07;
    public C95934Tc A08;
    public C96384Uw A09;
    public C4VR A0A;
    public C4XW A0C;
    public C92124As A0D;
    public C4VA A0E;
    public InterfaceC96054To[] A0G;
    public C2BZ A0H;
    public InterfaceC92404Bv A0I;
    public C4TP A0J;
    public AtomicReference A0K;
    public final Context A0L;
    public final Handler A0M;
    public final C95834Ss A0N;
    public final C95794Sn A0O;
    public final C4TV A0P;
    public final HeroPlayerSetting A0Q;
    public final C4TN A0S;
    public final C46282Ap A0T;
    public final C123185ht A0U;
    public final C123195hu A0V;
    public final C41991wp A0W;
    public final C4TT A0X;
    public final Map A0Y;
    public final AtomicBoolean A0Z;
    public final AtomicBoolean A0a;
    public final AtomicBoolean A0b;
    public final List A0R = new CopyOnWriteArrayList();
    public float A00 = 1.0f;
    public C4TU A0B = C4TU.A03;
    public boolean A0F = false;

    public final boolean A0C(C92124As c92124As) {
        return (c92124As == null || c92124As.A0Q.size() <= 0 || c92124As.A02(0).A03.isEmpty() || ((C4BF) c92124As.A02(0).A03.get(0)).A05.isEmpty()) ? false : true;
    }

    public static String A00(C92124As c92124As) {
        C4BI A02;
        List<C4BF> list;
        String str;
        if (c92124As != null && c92124As.A0Q.size() >= 1 && (A02 = c92124As.A02(0)) != null && (list = A02.A03) != null) {
            ArrayList arrayList = new ArrayList();
            for (C4BF c4bf : list) {
                if (c4bf.A01 == 3) {
                    arrayList.add(c4bf);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list2 = ((C4BF) it.next()).A07;
                if (list2 != null && !list2.isEmpty()) {
                    arrayList2.add(list2.get(0));
                }
            }
            if (arrayList2.size() == 1 && (str = ((C4BB) arrayList2.get(0)).A02.A0V) != null) {
                return str;
            }
            return null;
        }
        return null;
    }

    private void A01() {
        C4SS c4ss = this.A02;
        if (c4ss != null && !c4ss.A0M.isEmpty()) {
            for (C46742Cm c46742Cm : this.A02.A0M) {
                if (c46742Cm.A01 == EnumC46722Ck.A0I) {
                    C46642Cc.A01(c46742Cm);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c8, code lost:
    
        if (r1.A10.A0G != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f1, code lost:
    
        if (r40.A09 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025f, code lost:
    
        if (r6.A0R != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031f, code lost:
    
        if (r3.A0R != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (r5.A0v != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r3.A0V == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        if (r3.A0G == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        if (r41.A0C(r41.A0D) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r6.A0T == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01df A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034b A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02db A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fd A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ae A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105 A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177 A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f A[Catch: all -> 0x0372, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x0024, B:9:0x002a, B:11:0x00ad, B:13:0x00b3, B:14:0x00b8, B:16:0x00c0, B:18:0x00c4, B:20:0x00ca, B:22:0x00d0, B:24:0x00d8, B:26:0x00de, B:28:0x00e2, B:30:0x00f3, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0105, B:38:0x0112, B:40:0x0118, B:43:0x0122, B:49:0x0127, B:50:0x0129, B:53:0x0136, B:56:0x014b, B:57:0x013a, B:59:0x0143, B:60:0x0144, B:63:0x02a1, B:64:0x02a2, B:66:0x014d, B:68:0x015a, B:70:0x0164, B:72:0x0168, B:74:0x016c, B:75:0x0170, B:77:0x0177, B:80:0x0181, B:83:0x0187, B:85:0x018b, B:86:0x0192, B:87:0x018e, B:90:0x0196, B:93:0x019f, B:94:0x01a2, B:98:0x01b2, B:99:0x01b8, B:101:0x01bf, B:103:0x01c3, B:105:0x01d1, B:107:0x01d5, B:108:0x01d7, B:109:0x01db, B:111:0x01df, B:115:0x01ee, B:117:0x01f4, B:122:0x0200, B:124:0x0245, B:125:0x0249, B:127:0x025b, B:129:0x0263, B:131:0x0285, B:132:0x028a, B:135:0x0290, B:137:0x0296, B:140:0x02a3, B:142:0x02b1, B:143:0x02b7, B:145:0x02d4, B:147:0x034b, B:148:0x0350, B:152:0x02db, B:154:0x02f2, B:155:0x02f5, B:157:0x031b, B:159:0x0323, B:161:0x01fd, B:168:0x01ae, B:172:0x00e9, B:174:0x00ed, B:52:0x012a, B:58:0x013b), top: B:4:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.4V5, X.4V4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.4V7, java.lang.Object, X.4V8] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.4V5, X.4V6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A02(X.C4SS r40, final X.C4TS r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TS.A02(X.4SS, X.4TS, boolean):void");
    }

    public static void A03(final C4TS c4ts) {
        long Azf = c4ts.A0A.Azf() - 2000;
        if (Azf > c4ts.A0A.Azf()) {
            Azf = c4ts.A0A.Azf() / 2;
        }
        C96814Wq AMX = c4ts.A0A.AMX(new InterfaceC96064Tp() { // from class: X.4Yt
            @Override // X.InterfaceC96064Tp
            public final void CK0(int i, Object obj) {
                Iterator it = C4TS.this.A0R.iterator();
                while (it.hasNext()) {
                    ((C96844Wu) it.next()).A00.A0v.DZ0();
                }
            }
        });
        C4B8.A04(!AMX.A07);
        AMX.A02 = Azf;
        AMX.A00();
    }

    public static boolean A04(C4TS c4ts) {
        C4SS c4ss;
        if (c4ts.A0Q.A39 && (c4ss = c4ts.A02) != null) {
            if (c4ss.A0F != -1 || c4ss.A0E != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int A05(int i) {
        if (!this.A0E.A04().A01.get(i)) {
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7.A0E != (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r12 = this;
            X.4XW r0 = r12.A0C
            if (r0 == 0) goto L4b
            X.4SS r0 = r12.A02
            java.util.List r0 = r0.A0N
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            X.4VR r2 = r12.A0A
            X.4SS r0 = r12.A02
            java.util.List r1 = r0.A0N
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.Egp(r0)
        L1c:
            X.4VR r1 = r12.A0A
            r0 = 0
            r1.EZc(r0)
            X.4SS r7 = r12.A02
            int r6 = r7.A0F
            r5 = -1
            if (r6 != r5) goto L2e
            int r1 = r7.A0E
            r0 = 0
            if (r1 == r5) goto L2f
        L2e:
            r0 = 1
        L2f:
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L55
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r6 == r5) goto L52
            long r8 = (long) r6
            long r8 = r8 * r1
        L39:
            int r0 = r7.A0E
            if (r0 == r5) goto L4c
            long r10 = (long) r0
            long r10 = r10 * r1
        L3f:
            X.4VR r0 = r12.A0A
            X.4XW r7 = r12.A0C
            X.4Xh r6 = new X.4Xh
            r6.<init>(r7, r8, r10)
        L48:
            r0.E5T(r6, r3, r4)
        L4b:
            return
        L4c:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L3f
        L52:
            r8 = 0
            goto L39
        L55:
            X.4VR r0 = r12.A0A
            X.4XW r6 = r12.A0C
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TS.A06():void");
    }

    public final void A07(int i, int i2) {
        C96414Uz c96414Uz = new C96414Uz(this.A0E.A04());
        boolean z = false;
        if (i2 == -1) {
            z = true;
        }
        c96414Uz.A09(i, z);
        this.A0E.A05(c96414Uz);
    }

    public final void A08(long j) {
        C4SS c4ss = this.A02;
        if (c4ss != null && c4ss.A0K.A02()) {
            this.A0A.EdL(C4TT.A06);
        }
        if (this.A0Q.A2k && !A04(this)) {
            this.A0A.EMj(j);
        } else {
            this.A0A.AE7(j);
        }
    }

    public final void A09(long j, boolean z) {
        C4VR c4vr;
        C4TT c4tt;
        C4SS c4ss = this.A02;
        if (c4ss != null && (c4ss.A0K.A02() || (this.A0Q.A2m && (C2I7.A00(this.A02.A0K.A0A, "feed_timeline") || C2I7.A00(this.A02.A0K.A0A, "feed_contextual_chain") || C2I7.A00(this.A02.A0K.A0A, "feed_contextual_self_profile"))))) {
            c4vr = this.A0A;
            c4tt = C4TT.A06;
        } else {
            c4vr = this.A0A;
            if (z) {
                c4tt = this.A0X;
            } else {
                c4tt = C4TT.A03;
            }
        }
        c4vr.EdL(c4tt);
        if (this.A0Q.A2k && !A04(this)) {
            this.A0A.EMj(j);
        } else {
            C4VP c4vp = (C4VP) this.A0A;
            c4vp.A0J(c4vp.Av8(), j);
        }
    }

    public final void A0A(Surface surface, boolean z) {
        C96814Wq AMX = this.A0A.AMX(this.A0G[0]);
        AMX.A01(1);
        AMX.A02(surface);
        AMX.A00();
        if (z) {
            try {
                synchronized (AMX) {
                    C4B8.A04(AMX.A07);
                    boolean z2 = false;
                    if (AMX.A03.getThread() != Thread.currentThread()) {
                        z2 = true;
                    }
                    C4B8.A04(z2);
                    while (!AMX.A06) {
                        AMX.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(C4SS c4ss) {
        final Context context;
        final ServiceEventCallbackImpl serviceEventCallbackImpl;
        final C46282Ap c46282Ap;
        InterfaceC95914Ta interfaceC95914Ta;
        C4AN c4an = c4ss.A0K;
        if (c4an.A07 == C4AK.HLS) {
            context = this.A0L;
            serviceEventCallbackImpl = this.A03;
            c46282Ap = this.A0T;
            interfaceC95914Ta = new Object();
        } else {
            boolean A03 = c4an.A03();
            context = this.A0L;
            if (A03) {
                Map map = this.A0Y;
                serviceEventCallbackImpl = this.A03;
                C2BZ c2bz = this.A0H;
                Handler handler = this.A0M;
                WYQ wyq = new WYQ(this);
                AtomicBoolean atomicBoolean = this.A0b;
                AtomicBoolean atomicBoolean2 = this.A0a;
                C123195hu c123195hu = this.A0V;
                c46282Ap = this.A0T;
                interfaceC95914Ta = new WYP(context, handler, c2bz, this.A0I, this.A0S, c46282Ap, serviceEventCallbackImpl, c123195hu, wyq, map, atomicBoolean, atomicBoolean2);
            } else {
                final Map map2 = this.A0Y;
                serviceEventCallbackImpl = this.A03;
                final C2BZ c2bz2 = this.A0H;
                final AtomicBoolean atomicBoolean3 = this.A0b;
                final AtomicBoolean atomicBoolean4 = this.A0a;
                c46282Ap = this.A0T;
                final InterfaceC92404Bv interfaceC92404Bv = this.A0I;
                interfaceC95914Ta = new InterfaceC95914Ta(context, c2bz2, interfaceC92404Bv, c46282Ap, serviceEventCallbackImpl, map2, atomicBoolean3, atomicBoolean4) { // from class: X.4TZ
                    public C2B4 A00;
                    public C2BH A01;
                    public C2BE A02;
                    public InterfaceC461129v A03;
                    public final C2A4 A04;
                    public final InterfaceC92404Bv A05;
                    public final C461429y A06;
                    public final ServiceEventCallbackImpl A07;
                    public final C95924Tb A08;
                    public final HeroPlayerSetting A09;
                    public final AtomicBoolean A0A;
                    public final AtomicBoolean A0B;
                    public final Context A0C;
                    public final C2A5 A0D;
                    public final C2BZ A0E;
                    public final C460529p A0F;
                    public final InterfaceC460429o A0G;
                    public final Map A0H;

                    private C4XW A01(C4SS c4ss2, C4XW c4xw, long j) {
                        String str;
                        C4AN c4an2 = c4ss2.A0K;
                        List list = c4an2.A0H;
                        int i = 0;
                        if (this.A09.A2S && list != null && !list.isEmpty()) {
                            final C4XW[] c4xwArr = new C4XW[list.size() + 1];
                            while (true) {
                                c4xwArr[i] = c4xw;
                                if (i < list.size()) {
                                    SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) list.get(i);
                                    i++;
                                    android.net.Uri uri = subtitleConfiguration.A00;
                                    if (subtitleConfiguration.A01 != null) {
                                        str = Util.A0C(subtitleConfiguration.A01);
                                    } else {
                                        str = null;
                                    }
                                    c4xw = A02(uri, c4ss2, str, j);
                                } else {
                                    return new AbstractC96994Xj(c4xwArr) { // from class: X.5o0
                                        public static final C4W2 A09;
                                        public int A00;
                                        public C1343264z A01;
                                        public long[][] A02;
                                        public final C4XQ A03;
                                        public final C46g A04;
                                        public final ArrayList A05;
                                        public final Map A06;
                                        public final Timeline[] A07;
                                        public final C4XW[] A08;

                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4XQ] */
                                        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.collect.AbstractMapBasedMultimap, X.46g, java.lang.Object, com.google.common.collect.Multimaps$CustomListMultimap] */
                                        {
                                            ?? obj = new Object();
                                            this.A08 = c4xwArr;
                                            this.A03 = obj;
                                            this.A05 = new ArrayList(Arrays.asList(c4xwArr));
                                            this.A00 = -1;
                                            this.A07 = new Timeline[c4xwArr.length];
                                            this.A02 = new long[0];
                                            this.A06 = new HashMap();
                                            CompactHashMap compactHashMap = new CompactHashMap(8);
                                            MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
                                            ?? obj2 = new Object();
                                            C18C.A0E(compactHashMap.isEmpty());
                                            obj2.A01 = compactHashMap;
                                            obj2.A00 = multimapBuilder$ArrayListSupplier;
                                            this.A04 = obj2;
                                        }

                                        static {
                                            C96614Vw c96614Vw = new C96614Vw();
                                            c96614Vw.A07 = "MergingMediaSource";
                                            A09 = c96614Vw.A00();
                                        }

                                        @Override // X.AbstractC96994Xj
                                        public final /* bridge */ /* synthetic */ C4WX A0D(C4WX c4wx, Object obj) {
                                            if (((Number) obj).intValue() != 0) {
                                                return null;
                                            }
                                            return c4wx;
                                        }

                                        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.IOException, X.64z] */
                                        @Override // X.AbstractC96994Xj
                                        public final /* bridge */ /* synthetic */ void A0E(Timeline timeline, C4XW c4xw2, Object obj) {
                                            int i2;
                                            Number number = (Number) obj;
                                            if (this.A01 == null) {
                                                int i3 = this.A00;
                                                int A01 = timeline.A01();
                                                if (i3 == -1) {
                                                    this.A00 = A01;
                                                    i2 = A01;
                                                } else {
                                                    i2 = this.A00;
                                                    if (A01 != i2) {
                                                        this.A01 = new IOException();
                                                        return;
                                                    }
                                                }
                                                if (this.A02.length == 0) {
                                                    this.A02 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i2, this.A07.length);
                                                }
                                                ArrayList arrayList = this.A05;
                                                arrayList.remove(c4xw2);
                                                Timeline[] timelineArr = this.A07;
                                                timelineArr[number.intValue()] = timeline;
                                                if (arrayList.isEmpty()) {
                                                    A0A(timelineArr[0]);
                                                }
                                            }
                                        }

                                        @Override // X.C4XW
                                        public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j2) {
                                            C4XW[] c4xwArr2 = this.A08;
                                            int length = c4xwArr2.length;
                                            C4Z0[] c4z0Arr = new C4Z0[length];
                                            Timeline[] timelineArr = this.A07;
                                            int A06 = timelineArr[0].A06(c4wx.A04);
                                            for (int i2 = 0; i2 < length; i2++) {
                                                c4z0Arr[i2] = c4xwArr2[i2].AMl(c4wx.A00(timelineArr[i2].A0C(A06)), interfaceC96344Us, j2 - this.A02[A06][i2]);
                                            }
                                            return new C126655o3(this.A03, this.A02[A06], c4z0Arr);
                                        }

                                        @Override // X.C4XW
                                        public final C4W2 BRA() {
                                            C4XW[] c4xwArr2 = this.A08;
                                            if (c4xwArr2.length > 0) {
                                                return c4xwArr2[0].BRA();
                                            }
                                            return A09;
                                        }

                                        @Override // X.AbstractC96994Xj, X.C4XW
                                        public final void Cp0() {
                                            C1343264z c1343264z = this.A01;
                                            if (c1343264z == null) {
                                                super.Cp0();
                                                return;
                                            }
                                            throw c1343264z;
                                        }

                                        @Override // X.C4XW
                                        public final void EEP(C4Z0 c4z0) {
                                            C126655o3 c126655o3 = (C126655o3) c4z0;
                                            int i2 = 0;
                                            while (true) {
                                                C4XW[] c4xwArr2 = this.A08;
                                                if (i2 < c4xwArr2.length) {
                                                    C4XW c4xw2 = c4xwArr2[i2];
                                                    C4Z0 c4z02 = c126655o3.A04[i2];
                                                    if (c4z02 instanceof C133185zk) {
                                                        c4z02 = ((C133185zk) c4z02).A01;
                                                    }
                                                    c4xw2.EEP(c4z02);
                                                    i2++;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }

                                        @Override // X.AbstractC96994Xj, X.C4XV
                                        public final void A0B() {
                                            super.A0B();
                                            Arrays.fill(this.A07, (Object) null);
                                            this.A00 = -1;
                                            this.A01 = null;
                                            ArrayList arrayList = this.A05;
                                            arrayList.clear();
                                            Collections.addAll(arrayList, this.A08);
                                        }

                                        @Override // X.AbstractC96994Xj, X.C4XV
                                        public final void A0C(C2BC c2bc) {
                                            super.A0C(c2bc);
                                            int i2 = 0;
                                            while (true) {
                                                C4XW[] c4xwArr2 = this.A08;
                                                if (i2 < c4xwArr2.length) {
                                                    A0F(c4xwArr2[i2], Integer.valueOf(i2));
                                                    i2++;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    };
                                }
                            }
                        } else {
                            android.net.Uri uri2 = c4an2.A04;
                            if (uri2 != null) {
                                final C4XW[] c4xwArr2 = {c4xw, A02(uri2, c4ss2, null, j)};
                                return new AbstractC96994Xj(c4xwArr2) { // from class: X.5o0
                                    public static final C4W2 A09;
                                    public int A00;
                                    public C1343264z A01;
                                    public long[][] A02;
                                    public final C4XQ A03;
                                    public final C46g A04;
                                    public final ArrayList A05;
                                    public final Map A06;
                                    public final Timeline[] A07;
                                    public final C4XW[] A08;

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4XQ] */
                                    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.collect.AbstractMapBasedMultimap, X.46g, java.lang.Object, com.google.common.collect.Multimaps$CustomListMultimap] */
                                    {
                                        ?? obj = new Object();
                                        this.A08 = c4xwArr2;
                                        this.A03 = obj;
                                        this.A05 = new ArrayList(Arrays.asList(c4xwArr2));
                                        this.A00 = -1;
                                        this.A07 = new Timeline[c4xwArr2.length];
                                        this.A02 = new long[0];
                                        this.A06 = new HashMap();
                                        CompactHashMap compactHashMap = new CompactHashMap(8);
                                        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
                                        ?? obj2 = new Object();
                                        C18C.A0E(compactHashMap.isEmpty());
                                        obj2.A01 = compactHashMap;
                                        obj2.A00 = multimapBuilder$ArrayListSupplier;
                                        this.A04 = obj2;
                                    }

                                    static {
                                        C96614Vw c96614Vw = new C96614Vw();
                                        c96614Vw.A07 = "MergingMediaSource";
                                        A09 = c96614Vw.A00();
                                    }

                                    @Override // X.AbstractC96994Xj
                                    public final /* bridge */ /* synthetic */ C4WX A0D(C4WX c4wx, Object obj) {
                                        if (((Number) obj).intValue() != 0) {
                                            return null;
                                        }
                                        return c4wx;
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.IOException, X.64z] */
                                    @Override // X.AbstractC96994Xj
                                    public final /* bridge */ /* synthetic */ void A0E(Timeline timeline, C4XW c4xw2, Object obj) {
                                        int i2;
                                        Number number = (Number) obj;
                                        if (this.A01 == null) {
                                            int i3 = this.A00;
                                            int A01 = timeline.A01();
                                            if (i3 == -1) {
                                                this.A00 = A01;
                                                i2 = A01;
                                            } else {
                                                i2 = this.A00;
                                                if (A01 != i2) {
                                                    this.A01 = new IOException();
                                                    return;
                                                }
                                            }
                                            if (this.A02.length == 0) {
                                                this.A02 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i2, this.A07.length);
                                            }
                                            ArrayList arrayList = this.A05;
                                            arrayList.remove(c4xw2);
                                            Timeline[] timelineArr = this.A07;
                                            timelineArr[number.intValue()] = timeline;
                                            if (arrayList.isEmpty()) {
                                                A0A(timelineArr[0]);
                                            }
                                        }
                                    }

                                    @Override // X.C4XW
                                    public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j2) {
                                        C4XW[] c4xwArr22 = this.A08;
                                        int length = c4xwArr22.length;
                                        C4Z0[] c4z0Arr = new C4Z0[length];
                                        Timeline[] timelineArr = this.A07;
                                        int A06 = timelineArr[0].A06(c4wx.A04);
                                        for (int i2 = 0; i2 < length; i2++) {
                                            c4z0Arr[i2] = c4xwArr22[i2].AMl(c4wx.A00(timelineArr[i2].A0C(A06)), interfaceC96344Us, j2 - this.A02[A06][i2]);
                                        }
                                        return new C126655o3(this.A03, this.A02[A06], c4z0Arr);
                                    }

                                    @Override // X.C4XW
                                    public final C4W2 BRA() {
                                        C4XW[] c4xwArr22 = this.A08;
                                        if (c4xwArr22.length > 0) {
                                            return c4xwArr22[0].BRA();
                                        }
                                        return A09;
                                    }

                                    @Override // X.AbstractC96994Xj, X.C4XW
                                    public final void Cp0() {
                                        C1343264z c1343264z = this.A01;
                                        if (c1343264z == null) {
                                            super.Cp0();
                                            return;
                                        }
                                        throw c1343264z;
                                    }

                                    @Override // X.C4XW
                                    public final void EEP(C4Z0 c4z0) {
                                        C126655o3 c126655o3 = (C126655o3) c4z0;
                                        int i2 = 0;
                                        while (true) {
                                            C4XW[] c4xwArr22 = this.A08;
                                            if (i2 < c4xwArr22.length) {
                                                C4XW c4xw2 = c4xwArr22[i2];
                                                C4Z0 c4z02 = c126655o3.A04[i2];
                                                if (c4z02 instanceof C133185zk) {
                                                    c4z02 = ((C133185zk) c4z02).A01;
                                                }
                                                c4xw2.EEP(c4z02);
                                                i2++;
                                            } else {
                                                return;
                                            }
                                        }
                                    }

                                    @Override // X.AbstractC96994Xj, X.C4XV
                                    public final void A0B() {
                                        super.A0B();
                                        Arrays.fill(this.A07, (Object) null);
                                        this.A00 = -1;
                                        this.A01 = null;
                                        ArrayList arrayList = this.A05;
                                        arrayList.clear();
                                        Collections.addAll(arrayList, this.A08);
                                    }

                                    @Override // X.AbstractC96994Xj, X.C4XV
                                    public final void A0C(C2BC c2bc) {
                                        super.A0C(c2bc);
                                        int i2 = 0;
                                        while (true) {
                                            C4XW[] c4xwArr22 = this.A08;
                                            if (i2 < c4xwArr22.length) {
                                                A0F(c4xwArr22[i2], Integer.valueOf(i2));
                                                i2++;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                };
                            }
                            return c4xw;
                        }
                    }

                    @Override // X.InterfaceC95914Ta
                    public final InterfaceC123215hw BPN(C4SS c4ss2) {
                        return null;
                    }

                    public static final C2B2 A00(C4SS c4ss2) {
                        C2B2 c2b2 = new C2B2();
                        C4AN c4an2 = c4ss2.A0K;
                        boolean z = true;
                        if (!c4an2.A0M) {
                            z = false;
                        }
                        c2b2.A06(z);
                        String str = c4ss2.A06;
                        synchronized (c2b2) {
                            c2b2.A00 = str;
                        }
                        synchronized (c2b2) {
                        }
                        c2b2.A05(c4an2.A0G);
                        boolean z2 = c4an2.A0N;
                        synchronized (c2b2) {
                            c2b2.A04 = z2;
                        }
                        c2b2.A04(c4an2.A0A);
                        synchronized (c2b2) {
                        }
                        boolean z3 = c4ss2.A0C;
                        synchronized (c2b2) {
                            c2b2.A06 = z3;
                        }
                        boolean z4 = c4ss2.A0A;
                        synchronized (c2b2) {
                            c2b2.A05 = z4;
                        }
                        android.net.Uri uri = c4an2.A05;
                        if (uri != null) {
                            c2b2.A03(uri.getHost());
                        }
                        synchronized (c2b2) {
                        }
                        return c2b2;
                    }

                    /* JADX WARN: Type inference failed for: r10v1, types: [X.5kw] */
                    private C124915kw A02(final android.net.Uri uri, C4SS c4ss2, String str, long j) {
                        final long j2;
                        C4B3 c4b3 = new C4B3();
                        c4b3.A0R = "0";
                        c4b3.A0U = "application/x-subrip";
                        c4b3.A0F = 2;
                        c4b3.A0T = str;
                        final C4B6 c4b6 = new C4B6(c4b3);
                        final C4XA c4xa = new C4XA(null, EnumC91984Ae.DASH_TEXT, c4ss2, this.A08, null, this.A0B, this.A0A, j);
                        C2BB c2bb = c4ss2.A03;
                        if (c2bb != null) {
                            c4xa.A00 = c2bb;
                        }
                        final C4XN c4xn = new C4XN(-1);
                        if (this.A09.A3I) {
                            j2 = Long.MAX_VALUE;
                        } else {
                            j2 = -2;
                        }
                        return new C4XV(uri, c4b6, c4xa, c4xn, j2) { // from class: X.5kw
                            public C2BC A00;
                            public final long A01;
                            public final C4B6 A02;
                            public final Timeline A03;
                            public final InterfaceC96424Va A04;
                            public final C4C7 A05;
                            public final C4XO A06;

                            @Override // X.C4XV
                            public final void A0B() {
                            }

                            @Override // X.C4XW
                            public final void Cp0() {
                            }

                            @Override // X.C4XV
                            public final void A0C(C2BC c2bc) {
                                this.A00 = c2bc;
                                A0A(this.A03);
                            }

                            @Override // X.C4XW
                            public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j3) {
                                C4C7 c4c7 = this.A05;
                                InterfaceC96424Va interfaceC96424Va = this.A04;
                                C2BC c2bc = this.A00;
                                C4B6 c4b62 = this.A02;
                                long j4 = this.A01;
                                return new C5T8(c4b62, A09(c4wx), interfaceC96424Va, c4c7, this.A06, c2bc, j4);
                            }

                            @Override // X.C4XW
                            public final C4W2 BRA() {
                                return null;
                            }

                            @Override // X.C4XW
                            public final void EEP(C4Z0 c4z0) {
                                ((C5T8) c4z0).A08.A03(null);
                            }

                            {
                                this.A04 = c4xa;
                                this.A02 = c4b6;
                                this.A01 = j2;
                                this.A06 = c4xn;
                                this.A05 = new C4C7(uri, 0, -1);
                                this.A03 = new C126635nz(j2);
                            }
                        };
                    }

                    @Override // X.InterfaceC95914Ta
                    public final C2BE Adl(C2BH c2bh, C4SS c4ss2) {
                        C2B1 c2b1;
                        HeroPlayerSetting heroPlayerSetting = this.A09;
                        C42081wy c42081wy = heroPlayerSetting.A0w;
                        boolean z = c42081wy.A0t;
                        if (z || c42081wy.A0r || c42081wy.A0v) {
                            C2B2 A00 = A00(c4ss2);
                            C2A4 c2a4 = this.A04;
                            AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c42081wy, c2a4, A00, false, false);
                            if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
                                C2BZ c2bz3 = this.A0E;
                                c2b1 = new C2B1(new C4V2(c2bz3), c2bz3, c4ss2.A04, heroPlayerSetting);
                            } else {
                                c2b1 = null;
                            }
                            C2B4 c2b4 = new C2B4(abrContextAwareConfiguration, this.A0G);
                            if (c42081wy.A0v || z) {
                                return new C2BE(this.A0C, c2b4, A00, c2b1, this.A02, abrContextAwareConfiguration, c2bh, c2a4);
                            }
                        }
                        return null;
                    }

                    @Override // X.InterfaceC95914Ta
                    public final C2B4 AfJ() {
                        return this.A00;
                    }

                    @Override // X.InterfaceC95914Ta
                    public final C2BE AvX() {
                        return this.A02;
                    }

                    /* JADX WARN: Type inference failed for: r13v0, types: [X.1x9, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r14v0, types: [X.1x8, java.lang.Object] */
                    @Override // X.InterfaceC95914Ta
                    public final C4V3 BDZ(InterfaceC123215hw interfaceC123215hw, C4SS c4ss2) {
                        boolean z;
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        HeroPlayerSetting heroPlayerSetting = this.A09;
                        ?? obj = new Object();
                        C42121x2 c42121x2 = C42121x2.A00;
                        ?? obj2 = new Object();
                        boolean z6 = heroPlayerSetting.A2I;
                        int i = heroPlayerSetting.A0H;
                        boolean z7 = heroPlayerSetting.A1S;
                        C42361xQ c42361xQ = heroPlayerSetting.A10;
                        boolean z8 = c42361xQ.A0h;
                        C41861wa c41861wa = heroPlayerSetting.A01;
                        if (c41861wa != null) {
                            z = c41861wa.A0l;
                            z2 = c41861wa.A0k;
                            z3 = c41861wa.A0j;
                            z4 = c41861wa.A0i;
                            z5 = c41861wa.A0I;
                        } else {
                            z = false;
                            z2 = false;
                            z3 = false;
                            z4 = false;
                            z5 = false;
                        }
                        return new C4V3(obj, obj2, c42121x2, -1, -1, 0, -1, 0, 0, 0, 0, 0, -1, i, -1000L, false, false, true, false, false, false, z6, z7, z8, z, z2, z3, z4, z5, heroPlayerSetting.A1o, heroPlayerSetting.A3K, c42361xQ.A0f);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
                    
                        if (java.lang.Integer.parseInt((java.lang.String) r3.get("dash.use_play_when_ready_for_load_control")) == 0) goto L8;
                     */
                    @Override // X.InterfaceC95914Ta
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.InterfaceC96374Uv BOB(X.C4SS r48, X.C41991wp r49, java.util.concurrent.atomic.AtomicBoolean r50, java.util.concurrent.atomic.AtomicBoolean r51, boolean r52) {
                        /*
                            Method dump skipped, instructions count: 289
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C4TZ.BOB(X.4SS, X.1wp, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, boolean):X.4Uv");
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:43:0x0269, code lost:
                    
                        if (r8.isEmpty() == false) goto L88;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x028a, code lost:
                    
                        if (r11 == false) goto L121;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x0300, code lost:
                    
                        if (r6 != null) goto L107;
                     */
                    /* JADX WARN: Type inference failed for: r28v0, types: [X.4XC, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r28v2, types: [X.4XC, java.lang.Object] */
                    @Override // X.InterfaceC95914Ta
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C96944Xe BRX(X.C4TM r48, X.C4TG r49, X.C4SS r50, X.C4X8 r51, X.C4TV r52, X.C4XR r53, X.C4BL r54, X.C92124As r55, X.C2BC r56, long r57, boolean r59) {
                        /*
                            Method dump skipped, instructions count: 1008
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C4TZ.BRX(X.4TM, X.4TG, X.4SS, X.4X8, X.4TV, X.4XR, X.4BL, X.4As, X.2BC, long, boolean):X.4Xe");
                    }

                    @Override // X.InterfaceC95914Ta
                    public final C2BE CF2(C2BH c2bh, C4SS c4ss2, C92124As c92124As) {
                        C2B2 A00 = A00(c4ss2);
                        HeroPlayerSetting heroPlayerSetting = this.A09;
                        C42081wy c42081wy = heroPlayerSetting.A0w;
                        C2BZ c2bz3 = this.A0E;
                        C2B1 c2b1 = new C2B1(new C4V2(c2bz3), c2bz3, c4ss2.A04, heroPlayerSetting);
                        this.A01 = c2bh;
                        C2A4 c2a4 = this.A04;
                        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c42081wy, c2a4, A00, false, false);
                        C2B4 c2b4 = new C2B4(abrContextAwareConfiguration, this.A0G);
                        this.A00 = c2b4;
                        C2BE c2be = new C2BE(this.A0C, c2b4, A00, c2b1, null, abrContextAwareConfiguration, c2bh, c2a4);
                        this.A02 = c2be;
                        return c2be;
                    }

                    {
                        this.A0C = context;
                        this.A0H = map2;
                        HeroPlayerSetting heroPlayerSetting = c46282Ap.A06;
                        this.A09 = heroPlayerSetting;
                        C461429y c461429y = (C461429y) c46282Ap.A09.get();
                        this.A06 = c461429y;
                        this.A07 = serviceEventCallbackImpl;
                        InterfaceC460429o interfaceC460429o = c46282Ap.A07;
                        this.A0G = interfaceC460429o;
                        this.A08 = new C95924Tb(context, c2bz2, new C92394Bu(), c461429y, serviceEventCallbackImpl, heroPlayerSetting, interfaceC460429o);
                        this.A04 = c46282Ap.A03;
                        this.A0D = c46282Ap.A01;
                        this.A0E = c2bz2;
                        this.A0B = atomicBoolean3;
                        this.A0A = atomicBoolean4;
                        this.A0F = (C460529p) c46282Ap.A08.get();
                        this.A05 = interfaceC92404Bv;
                        this.A03 = c46282Ap.A04;
                    }
                };
            }
        }
        this.A07 = interfaceC95914Ta;
        Map map3 = this.A0Y;
        Handler handler2 = this.A0M;
        C95794Sn c95794Sn = this.A0O;
        C123195hu c123195hu2 = this.A0V;
        Context context2 = context;
        C46282Ap c46282Ap2 = c46282Ap;
        this.A08 = new C95934Tc(context2, handler2, c46282Ap2, c95794Sn, this.A0J, serviceEventCallbackImpl, interfaceC95914Ta, this.A0U, c123195hu2, map3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
    
        if (r17.A0K.A0L == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4TS(android.content.Context r11, android.os.Handler r12, X.C2BZ r13, X.InterfaceC92404Bv r14, X.C4TN r15, X.C4TM r16, X.C4SS r17, X.C46282Ap r18, X.C95834Ss r19, X.C95794Sn r20, X.C4TP r21, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r22, X.C41991wp r23, java.util.Map r24, java.util.concurrent.atomic.AtomicBoolean r25, java.util.concurrent.atomic.AtomicBoolean r26, java.util.concurrent.atomic.AtomicBoolean r27, java.util.concurrent.atomic.AtomicReference r28) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TS.<init>(android.content.Context, android.os.Handler, X.2BZ, X.4Bv, X.4TN, X.4TM, X.4SS, X.2Ap, X.4Ss, X.4Sn, X.4TP, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl, X.1wp, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicReference):void");
    }
}
