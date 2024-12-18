package com.instagram.friendmap.data;

import X.AbstractC06950Ym;
import X.AbstractC106864rn;
import X.AbstractC16960so;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC43591JPw;
import X.AnonymousClass057;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C008002u;
import X.C00O;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C10Q;
import X.C14360o3;
import X.C15430py;
import X.C16930sl;
import X.C18A;
import X.C18U;
import X.C19L;
import X.C1VW;
import X.C3LA;
import X.C45044JwZ;
import X.C4A5;
import X.C4A7;
import X.C4A8;
import X.C4F5;
import X.C50121MBv;
import X.C92964Eq;
import X.C92984Et;
import X.C9DT;
import X.EnumC92974Es;
import X.InterfaceC06180Ui;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.Jx8;
import X.MBp;
import X.MCG;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class FriendMapRepository extends C4A7 {
    public Location A00;
    public SimpleImageUrl A01;
    public C92984Et A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public long A05;
    public final UserSession A06;
    public final NotesApi A07;
    public final NotesRepository A08;
    public final C92964Eq A09;
    public final C1VW A0A;
    public final C18A A0B;
    public final Integer A0C;
    public final InterfaceC19390xP A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;
    public final InterfaceC06180Ui A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C0UO A0M;
    public final C0UO A0N;

    public final void A07(long j) {
        this.A08.A0E(j, null);
        A03(this, j, true);
    }

    public final synchronized void A08(long j) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50121MBv(this, j, (InterfaceC23621Ds) null, 8), c19l);
    }

    public final synchronized void A0A(Integer num, double d, double d2) {
        C14360o3.A0B(num, 2);
        UserSession userSession = this.A06;
        if (C3LA.A05(userSession, false) || AbstractC106864rn.A00(userSession, num)) {
            C19L c19l = super.A01;
            FriendMapRepository$updateLastActiveLocation$1 friendMapRepository$updateLastActiveLocation$1 = new FriendMapRepository$updateLastActiveLocation$1(this, num, null, d, d2);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, friendMapRepository$updateLastActiveLocation$1, c19l);
        }
    }

    public final synchronized void A0B(String str) {
        Object value;
        ArrayList arrayList;
        C05A c05a = this.A0H;
        do {
            value = c05a.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!C14360o3.A0K(((Jx8) obj).A04.getId(), str)) {
                    arrayList.add(obj);
                }
            }
        } while (!c05a.AIi(value, arrayList));
    }

    public static final int A00(FriendMapRepository friendMapRepository, C92984Et c92984Et, List list) {
        int i = 0;
        if (c92984Et.A03 > 0 && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jx8 jx8 = (Jx8) it.next();
                if (!C14360o3.A0K(friendMapRepository.A06.userId, jx8.A04.getId()) && jx8.A0B && (i = i + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        return i;
    }

    public static final Jx8 A01(Jx8 jx8, FriendMapRepository friendMapRepository, Double d, Double d2, List list) {
        Location location;
        C1VW c1vw = friendMapRepository.A0A;
        if (c1vw != null) {
            location = c1vw.getLastLocation(friendMapRepository.A06, AbstractC43591JPw.A00(630));
        } else {
            location = null;
        }
        if (d == null) {
            if (location != null) {
                d = Double.valueOf(location.getLatitude());
            } else {
                d = null;
            }
        }
        if (d2 == null) {
            if (location != null) {
                d2 = Double.valueOf(location.getLongitude());
            } else {
                d2 = null;
            }
        }
        UserSession userSession = friendMapRepository.A06;
        if (!C3LA.A04(userSession) || d == null || d2 == null) {
            return jx8;
        }
        Integer num = jx8.A05;
        Integer num2 = C05F.A00;
        if (num != num2) {
            return jx8;
        }
        LatLng latLng = jx8.A02;
        double A00 = latLng.A00(new LatLng(d.doubleValue(), d2.doubleValue()));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A00 >= ((float) C18U.A00(c06090Tz, userSession, 37166147312943533L))) {
            return jx8;
        }
        if (C18U.A06(c06090Tz, userSession, 36321722382690075L)) {
            if (list != null) {
                list.add(jx8.A09);
            } else {
                AbstractC23641Du.A03(num2, AnonymousClass191.A00, new MCG(jx8, friendMapRepository, (InterfaceC23621Ds) null, 31), ((C4A7) friendMapRepository).A01);
            }
        }
        Integer num3 = C05F.A01;
        String str = jx8.A09;
        String str2 = jx8.A08;
        C4F5 c4f5 = jx8.A03;
        User user = jx8.A04;
        long j = jx8.A01;
        boolean z = jx8.A0D;
        boolean z2 = jx8.A0E;
        boolean z3 = jx8.A0F;
        boolean z4 = jx8.A0A;
        boolean z5 = jx8.A0C;
        int i = jx8.A00;
        String str3 = jx8.A07;
        boolean z6 = jx8.A0B;
        boolean z7 = jx8.A0G;
        String str4 = jx8.A06;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(user, 4);
        C14360o3.A0B(num3, 16);
        return new Jx8(latLng, c4f5, user, num3, str, str2, str3, str4, i, j, z, z2, z3, z4, z5, z6, z7);
    }

    public static final String A02(LatLng latLng, FriendMapRepository friendMapRepository) {
        Object obj;
        Iterator it = ((C92984Et) friendMapRepository.A0N.getValue()).A05.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C45044JwZ c45044JwZ = (C45044JwZ) obj;
                if (latLng.A00(new LatLng(c45044JwZ.A00, c45044JwZ.A01)) <= c45044JwZ.A02) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C45044JwZ c45044JwZ2 = (C45044JwZ) obj;
        if (c45044JwZ2 == null) {
            return null;
        }
        return c45044JwZ2.A04;
    }

    public static final void A03(FriendMapRepository friendMapRepository, long j, boolean z) {
        Object value;
        ArrayList arrayList;
        C05A c05a = friendMapRepository.A0H;
        do {
            value = c05a.getValue();
            List<Jx8> list = (List) value;
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (Jx8 jx8 : list) {
                String str = jx8.A08;
                if (C14360o3.A0K(str, String.valueOf(j))) {
                    String str2 = jx8.A09;
                    LatLng latLng = jx8.A02;
                    C4F5 c4f5 = jx8.A03;
                    User user = jx8.A04;
                    long j2 = jx8.A01;
                    boolean z2 = jx8.A0D;
                    boolean z3 = jx8.A0E;
                    boolean z4 = jx8.A0F;
                    boolean z5 = jx8.A0A;
                    int i = jx8.A00;
                    String str3 = jx8.A07;
                    boolean z6 = jx8.A0B;
                    boolean z7 = jx8.A0G;
                    String str4 = jx8.A06;
                    Integer num = jx8.A05;
                    C14360o3.A0B(str2, 0);
                    C14360o3.A0B(latLng, 2);
                    C14360o3.A0B(user, 4);
                    C14360o3.A0B(num, 16);
                    jx8 = new Jx8(latLng, c4f5, user, num, str2, str, str3, str4, i, j2, z2, z3, z4, z5, z, z6, z7);
                }
                arrayList.add(jx8);
            }
        } while (!c05a.AIi(value, arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x04c3, code lost:
    
        if (((X.EnumC46237KdD) r5.getRequiredEnumField(3, "audience", X.EnumC46237KdD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != X.EnumC46237KdD.ONLY_OWNER) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r33 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0614, code lost:
    
        if (r5.getRequiredTimeField(6, "timestamp") <= r1.getRequiredIntField(1, X.AbstractC43591JPw.A00(372))) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0526 A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0546 A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0569 A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058b A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059f A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05f6 A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0624 A[Catch: all -> 0x0793, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:11:0x0022, B:15:0x005c, B:16:0x0086, B:17:0x00a8, B:19:0x00ae, B:21:0x00d0, B:23:0x00dd, B:25:0x011c, B:27:0x0129, B:29:0x013c, B:31:0x0149, B:32:0x0156, B:34:0x0162, B:36:0x016f, B:38:0x0182, B:40:0x018f, B:41:0x019c, B:43:0x01f0, B:45:0x01fd, B:47:0x0210, B:48:0x0219, B:50:0x0226, B:53:0x0230, B:56:0x0247, B:57:0x025e, B:59:0x0264, B:61:0x02af, B:62:0x02e7, B:64:0x02f8, B:66:0x02fe, B:69:0x030b, B:70:0x030f, B:71:0x0354, B:73:0x035a, B:75:0x0398, B:77:0x03a5, B:79:0x03ad, B:83:0x03c2, B:84:0x03fb, B:85:0x0413, B:87:0x0419, B:90:0x043e, B:93:0x0442, B:96:0x044f, B:99:0x0459, B:102:0x046a, B:103:0x046c, B:106:0x0484, B:107:0x048a, B:109:0x04a4, B:111:0x04b4, B:113:0x04c7, B:115:0x04d5, B:117:0x04e5, B:119:0x04f2, B:120:0x04f8, B:124:0x050b, B:126:0x050f, B:128:0x0513, B:130:0x051c, B:131:0x0520, B:133:0x0526, B:135:0x0530, B:136:0x0534, B:139:0x053e, B:141:0x0546, B:142:0x054b, B:144:0x0569, B:146:0x057b, B:147:0x0583, B:149:0x058b, B:150:0x0593, B:152:0x059f, B:159:0x05cf, B:161:0x05d5, B:162:0x05dd, B:163:0x05df, B:164:0x05e3, B:166:0x05f6, B:168:0x0603, B:170:0x0616, B:172:0x0624, B:178:0x066f, B:179:0x0671, B:182:0x0669, B:183:0x066c, B:185:0x062e, B:188:0x0636, B:190:0x063c, B:192:0x0643, B:194:0x064b, B:196:0x0655, B:198:0x065b, B:199:0x05c3, B:227:0x02c0, B:232:0x0695, B:233:0x069e, B:235:0x06a4, B:248:0x06ad, B:252:0x06b3, B:242:0x06be, B:239:0x06ba, B:260:0x06c2, B:261:0x06dc, B:263:0x06e2, B:266:0x06ef, B:271:0x06f3, B:273:0x0725, B:275:0x0733, B:276:0x073e, B:278:0x074d, B:280:0x0755, B:282:0x0084, B:283:0x0767, B:285:0x0776, B:286:0x0778, B:288:0x077e, B:289:0x0787), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A04(com.instagram.friendmap.data.FriendMapRepository r81, X.C59589QiE r82, java.lang.Double r83, java.lang.Double r84, X.InterfaceC16660sJ r85, boolean r86) {
        /*
            Method dump skipped, instructions count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapRepository.A04(com.instagram.friendmap.data.FriendMapRepository, X.QiE, java.lang.Double, java.lang.Double, X.0sJ, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (r25 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bf, code lost:
    
        if (r5.emit(r4, r8) == r7) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.EnumC92974Es r38, X.EnumC46191KcT r39, X.InterfaceC23621Ds r40) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapRepository.A05(X.4Es, X.KcT, X.1Ds):java.lang.Object");
    }

    public final void A06() {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBp(this, null, 33), c19l);
    }

    public final boolean A0C(long j) {
        Object obj;
        Iterator it = ((Iterable) this.A0H.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((Jx8) obj).A08, String.valueOf(j))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Jx8 jx8 = (Jx8) obj;
        if (jx8 != null && jx8.A0C) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FriendMapRepository(UserSession userSession, NotesApi notesApi, C92964Eq c92964Eq, C18A c18a) {
        super("FriendMap", C4A8.A01(846242580, 3));
        NotesRepository A00 = C4A5.A00(userSession);
        C14360o3.A0B(c18a, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(A00, 5);
        this.A09 = c92964Eq;
        this.A0B = c18a;
        this.A06 = userSession;
        this.A07 = notesApi;
        this.A08 = A00;
        this.A0A = C1VW.A00;
        EnumC92974Es enumC92974Es = EnumC92974Es.A0A;
        C16930sl c16930sl = C16930sl.A00;
        C008002u c008002u = new C008002u(new C92984Et(enumC92974Es, c16930sl, c16930sl, 0, 0, 0, 0L, false));
        this.A0I = c008002u;
        this.A0N = AbstractC208910l.A02(c008002u);
        C008002u A002 = C10E.A00(c16930sl);
        this.A0H = A002;
        this.A0M = AbstractC208910l.A02(A002);
        Integer num = C05F.A00;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0G = A003;
        this.A0D = new C15430py(A003);
        C008002u A004 = C10E.A00(null);
        this.A0L = A004;
        this.A0E = C10Q.A00(new FriendMapRepository$friendMapNotesEntryPointFlow$1(this, null), A002, c008002u, A004);
        C008002u c008002u2 = new C008002u(false);
        this.A0J = c008002u2;
        this.A0F = C10Q.A00(new FriendMapRepository$friendMapUiReadyFlow$1(null), A002, c008002u, c008002u2);
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36603197359592348L);
        this.A0C = (!C3LA.A04(userSession) || A01 <= 0) ? null : Integer.valueOf(A01);
        this.A0K = C10E.A00(null);
        if (C3LA.A04(userSession)) {
            AbstractC23641Du.A03(num, AnonymousClass191.A00, new MBp(this, null, 32), super.A01);
        }
    }

    public final void A09(Double d, Double d2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis() - this.A05;
        if (C3LA.A05(this.A06, false)) {
            if (z || currentTimeMillis > 120000) {
                C19L c19l = super.A01;
                C9DT c9dt = new C9DT(this, d, d2, (InterfaceC23621Ds) null, interfaceC16660sJ, z2);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dt, c19l);
                this.A05 = System.currentTimeMillis();
            }
        }
    }
}
