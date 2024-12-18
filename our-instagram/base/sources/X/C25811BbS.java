package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.BbS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25811BbS extends C193578hc {
    public int A00;
    public int A01;
    public Integer A02;
    public C5Hc A03;
    public AnonymousClass195 A04;
    public AnonymousClass195 A05;
    public boolean A06;
    public boolean A07;
    public final Application A08;
    public final QuickPerformanceLogger A09;
    public final FoaUserSession A0A;
    public final C28421CgT A0B;
    public final MEmuDataRepository A0C;
    public final C7C A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC19390xP A0J;
    public final InterfaceC06180Ui A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final C0UO A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final MEmuNetworkService A0V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25811BbS(Application application, FoaUserSession foaUserSession, C28421CgT c28421CgT, C7H c7h, String str, String str2, boolean z, boolean z2) {
        super(application);
        C7C c7c;
        AbstractC167007dF.A1D(application, 1, foaUserSession);
        AbstractC167007dF.A1H(c7h, 3, c28421CgT);
        this.A08 = application;
        this.A0A = foaUserSession;
        this.A0T = z;
        this.A0E = str;
        this.A0F = str2;
        this.A0B = c28421CgT;
        this.A0U = z2;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0H = AbstractC09440dt.A00(enumC09460dv, C29910DGy.A01(this, 47));
        C008002u A1H = AbstractC25225BEi.A1H(c7h);
        this.A0O = A1H;
        this.A0S = A1H;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0K = A00;
        this.A0J = A00;
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC27386C6p.A02);
        this.A0N = A1H2;
        this.A0R = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(C6B.A02);
        this.A0L = A1H3;
        this.A0P = A1H3;
        int ordinal = c7h.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 16) {
                    c7c = C7C.A09;
                } else {
                    c7c = C7C.A03;
                }
            } else {
                c7c = C7C.A02;
            }
        } else {
            c7c = C7C.A08;
        }
        this.A0D = c7c;
        C008002u A1H4 = AbstractC25225BEi.A1H(c7c);
        this.A0M = A1H4;
        this.A0Q = A1H4;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A09 = c006802i;
        this.A0I = AbstractC09440dt.A00(enumC09460dv, C29910DGy.A01(this, 48));
        this.A0G = AbstractC166987dD.A1E();
        MEmuNetworkService mEmuNetworkService = new MEmuNetworkService(AbstractC166987dD.A0O(application), foaUserSession);
        this.A0V = mEmuNetworkService;
        this.A0C = new MEmuDataRepository(mEmuNetworkService);
        this.A02 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC28057CYl.A00(r6.A0A), 36325763943904601L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r6 = this;
            X.05A r2 = r6.A0O
        L2:
            java.lang.Object r1 = r2.getValue()
            X.C7H r0 = X.C7H.A0F
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L2
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A09
            r0 = 164823041(0x9d30001, float:5.0796406E-33)
            r1.markerStart(r0)
            java.lang.String r1 = r6.A0E
            java.lang.String r0 = "AI_BOT"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L34
            com.meta.foa.session.FoaUserSession r0 = r6.A0A
            com.instagram.common.session.UserSession r3 = X.AbstractC28057CYl.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325763943904601(0x810e1700123559, double:3.0358976180115E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5 = 1
            if (r0 != 0) goto L35
        L34:
            r5 = 0
        L35:
            X.6aw r4 = X.AbstractC141776au.A00(r6)
            X.12T r3 = X.C12P.A00
            r2 = 0
            r1 = 32
            X.PZO r0 = new X.PZO
            r0.<init>(r6, r2, r1, r5)
            X.AbstractC23641Du.A05(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25811BbS.A01():void");
    }

    public static final void A02(C25811BbS c25811BbS) {
        Object value;
        C7C c7c;
        C05A c05a = c25811BbS.A0L;
        do {
        } while (!c05a.AIi(c05a.getValue(), C6B.A02));
        C05A c05a2 = c25811BbS.A0M;
        do {
            value = c05a2.getValue();
            int ordinal = ((C7H) c25811BbS.A0O.getValue()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 12 && ordinal != 13) {
                    if (ordinal != 14) {
                        c25811BbS.A09.markerEnd(164823041, (short) 4);
                        c7c = C7C.A05;
                    } else {
                        c7c = C7C.A04;
                    }
                } else {
                    c7c = C7C.A07;
                }
            } else {
                c7c = C7C.A06;
            }
        } while (!c05a2.AIi(value, c7c));
    }

    public static final void A03(C25811BbS c25811BbS) {
        int i = c25811BbS.A00 + 1;
        c25811BbS.A00 = i;
        if (i >= ((List) c25811BbS.A0I.getValue()).size()) {
            if (AbstractC167007dF.A1Z(c25811BbS.A0H)) {
                c25811BbS.A07 = false;
                C05A c05a = c25811BbS.A0L;
                do {
                } while (!c05a.AIi(c05a.getValue(), C6B.A02));
                C05A c05a2 = c25811BbS.A0M;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), C7C.A03));
                C05A c05a3 = c25811BbS.A0O;
                do {
                } while (!c05a3.AIi(c05a3.getValue(), C7H.A05));
                return;
            }
            c25811BbS.A01();
            return;
        }
        C05A c05a4 = c25811BbS.A0O;
        do {
        } while (!c05a4.AIi(c05a4.getValue(), C7H.A03));
    }

    public final CW1 A0E() {
        C7V c7v;
        int i = this.A00;
        InterfaceC09390do interfaceC09390do = this.A0I;
        if (i >= ((List) interfaceC09390do.getValue()).size()) {
            c7v = null;
        } else {
            c7v = (C7V) ((List) interfaceC09390do.getValue()).get(this.A00);
        }
        boolean z = true;
        int i2 = this.A00 + 1;
        if (c7v != C7V.A04) {
            if (C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(this.A0A), 36325763943576918L)) {
                z = false;
            }
        }
        return new CW1(c7v, i2, ((List) interfaceC09390do.getValue()).size(), z);
    }

    public final void A0F(CA0 ca0) {
        C28421CgT c28421CgT;
        C8o c8o;
        int size;
        C8o c8o2;
        C8b c8b;
        Integer num;
        Integer num2;
        Object value;
        C7H c7h;
        String str;
        int i;
        Object value2;
        C7H c7h2;
        String str2;
        if (!(ca0 instanceof C4P)) {
            if (ca0 instanceof C4N) {
                C05A c05a = this.A0N;
                do {
                } while (!c05a.AIi(c05a.getValue(), EnumC27386C6p.A02));
                return;
            }
            if (ca0 instanceof C4V) {
                C05A c05a2 = this.A0M;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), C7C.A02));
                C05A c05a3 = this.A0O;
                do {
                } while (!c05a3.AIi(c05a3.getValue(), C7H.A02));
                return;
            }
            if (ca0 instanceof C4H) {
                JSONObject jSONObject = ((C4H) ca0).A00;
                String string = jSONObject.getString("event");
                C14360o3.A0A(string);
                C14360o3.A0B(string, 0);
                Integer[] A00 = C05F.A00(3);
                int length = A00.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        num = A00[i2];
                        switch (num.intValue()) {
                            case 1:
                                str2 = "MEMU_FACE_CT_CHANGE";
                                break;
                            case 2:
                                str2 = "MEMU_DETECTION_RESULT";
                                break;
                            default:
                                str2 = "MEMU_EFFECT_READY";
                                break;
                        }
                        if (!str2.equals(AbstractC166997dE.A10(Locale.ROOT, string))) {
                            i2++;
                        }
                    } else {
                        num = null;
                    }
                }
                C05A c05a4 = this.A0O;
                boolean A002 = AbstractC27730CKx.A00((C7H) c05a4.getValue());
                Integer num3 = C05F.A00;
                if (num != num3) {
                    Integer num4 = C05F.A01;
                    if (num == num4) {
                        boolean z = false;
                        if (jSONObject.has("data")) {
                            String string2 = jSONObject.getString("data");
                            C14360o3.A07(string2);
                            i = Integer.parseInt(string2);
                        } else {
                            i = 0;
                        }
                        do {
                            value2 = c05a4.getValue();
                            if (i == 0) {
                                c7h2 = C7H.A0A;
                            } else if (i > 1) {
                                c7h2 = C7H.A0D;
                            } else if (i == 1 && this.A06) {
                                c7h2 = C7H.A03;
                            } else {
                                c7h2 = C7H.A09;
                            }
                        } while (!c05a4.AIi(value2, c7h2));
                        if (this.A06 || i != 1) {
                            AbstractC25229BEm.A1R(this.A05);
                            this.A00 = 0;
                            AnonymousClass016.A1A(this.A0G, C30148DQe.A00);
                        }
                        if (!this.A06 && i == 1) {
                            z = true;
                        }
                        this.A06 = z;
                        return;
                    }
                    if (!A002 || num != C05F.A0C || !jSONObject.has("data")) {
                        return;
                    }
                    String string3 = jSONObject.getString("data");
                    C14360o3.A07(string3);
                    Integer[] A003 = C05F.A00(7);
                    int length2 = A003.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            num2 = A003[i3];
                            switch (num2.intValue()) {
                                case 1:
                                    str = "DETECTED";
                                    break;
                                case 2:
                                    str = "CENTER_FACE";
                                    break;
                                case 3:
                                    str = "TOO_CLOSE";
                                    break;
                                case 4:
                                    str = AbstractC111324zv.A00(1811);
                                    break;
                                case 5:
                                    str = "POSE_NOT_DETECTED";
                                    break;
                                case 6:
                                    str = "FRAME_TOO_DARK";
                                    break;
                                default:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                    break;
                            }
                            if (str.equals(AbstractC166997dE.A10(Locale.ROOT, string3))) {
                                if (num2 == num3) {
                                    return;
                                }
                            } else {
                                i3++;
                            }
                        } else {
                            num2 = null;
                        }
                    }
                    do {
                        value = c05a4.getValue();
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        if (intValue != 4) {
                                            if (intValue == 6) {
                                                c7h = C7H.A04;
                                            }
                                        } else {
                                            c7h = C7H.A0C;
                                        }
                                    } else {
                                        c7h = C7H.A0B;
                                    }
                                } else {
                                    c7h = C7H.A07;
                                }
                            } else {
                                c7h = C7H.A08;
                            }
                        }
                        c7h = C7H.A09;
                    } while (!c05a4.AIi(value, c7h));
                    CW1 A0E = A0E();
                    AbstractC25229BEm.A1R(this.A05);
                    if (num2 != num4 || A0E.A03) {
                        return;
                    }
                    InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A05);
                    this.A05 = AbstractC23641Du.A03(num3, C12P.A00, new D51(this, A0s, 21), AbstractC141776au.A00(this));
                    return;
                }
                do {
                } while (!c05a4.AIi(c05a4.getValue(), C7H.A0A));
                this.A00 = 0;
                AnonymousClass016.A1A(this.A0G, C30149DQf.A00);
                return;
            }
            if (ca0 instanceof C4Q) {
                this.A02 = C05F.A0C;
                C05A c05a5 = this.A0N;
                do {
                } while (!c05a5.AIi(c05a5.getValue(), EnumC27386C6p.A03));
                return;
            }
            if (ca0 instanceof C4L) {
                D51.A02(this, AbstractC141776au.A00(this), 22);
                return;
            }
            if (ca0 instanceof C4G) {
                Bitmap bitmap = ((C4G) ca0).A00;
                InterfaceC09390do interfaceC09390do = this.A0I;
                int ordinal = ((C7V) ((List) interfaceC09390do.getValue()).get(this.A00)).ordinal();
                if (ordinal != 2) {
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            c8b = C8b.RIGHT;
                        }
                        this.A0G.add(new OLk(A00(bitmap), (C7V) ((List) interfaceC09390do.getValue()).get(this.A00), null));
                        A03(this);
                        return;
                    }
                    c8b = C8b.LEFT;
                } else {
                    c8b = C8b.CENTER;
                }
                C28421CgT.A00(C8o.A03, null, c8b, null, null, this.A0B, null, null, null, null, false);
                this.A0G.add(new OLk(A00(bitmap), (C7V) ((List) interfaceC09390do.getValue()).get(this.A00), null));
                A03(this);
                return;
            }
            if (ca0 instanceof C4K) {
                C05A c05a6 = this.A0O;
                C7H c7h3 = (C7H) c05a6.getValue();
                C14360o3.A0B(c7h3, 0);
                if (((c7h3 == C7H.A0E || AbstractC27730CKx.A00(c7h3)) && this.A00 > 0) || c05a6.getValue() == C7H.A0F) {
                    C05A c05a7 = this.A0N;
                    do {
                    } while (!c05a7.AIi(c05a7.getValue(), EnumC27386C6p.A04));
                    return;
                }
            } else {
                if (ca0 instanceof C4M) {
                    this.A0M.Egh(C7C.A08);
                    return;
                }
                if (ca0 instanceof C4J) {
                    C28421CgT.A02(C8o.A02, this.A0B);
                    C05A c05a8 = this.A0M;
                    do {
                    } while (!c05a8.AIi(c05a8.getValue(), C7C.A09));
                    C05A c05a9 = this.A0O;
                    do {
                    } while (!c05a9.AIi(c05a9.getValue(), C7H.A0E));
                    return;
                }
                if (ca0 instanceof C4O) {
                    this.A02 = C05F.A01;
                    C28421CgT.A02(C8o.A05, this.A0B);
                } else {
                    if (ca0 instanceof C4R) {
                        C05A c05a10 = this.A0L;
                        do {
                        } while (!c05a10.AIi(c05a10.getValue(), C6B.A03));
                        return;
                    }
                    if (ca0 instanceof C4I) {
                        C4I c4i = (C4I) ca0;
                        boolean z2 = c4i.A01;
                        List<C27991CVo> list = c4i.A00;
                        C28421CgT c28421CgT2 = this.A0B;
                        if (z2) {
                            size = this.A01;
                            c8o2 = C8o.A0S;
                        } else {
                            size = list.size();
                            c8o2 = C8o.A0P;
                        }
                        C28421CgT.A01(c8o2, null, null, c28421CgT2, Integer.valueOf(size), false);
                        C05A c05a11 = this.A0M;
                        do {
                        } while (!c05a11.AIi(c05a11.getValue(), C7C.A09));
                        for (C27991CVo c27991CVo : list) {
                            List list2 = this.A0G;
                            C7V c7v = C7V.A03;
                            Application application = this.A08;
                            Bitmap decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(application.getContentResolver(), c27991CVo.A00));
                            C14360o3.A0A(decodeBitmap);
                            list2.add(new OLk(A00(decodeBitmap), c7v, null));
                        }
                        this.A07 = AbstractC166987dD.A1b(list);
                        A01();
                        return;
                    }
                    if (ca0 instanceof C4S) {
                        C05A c05a12 = this.A0M;
                        do {
                        } while (!c05a12.AIi(c05a12.getValue(), C7C.A09));
                        C05A c05a13 = this.A0O;
                        do {
                        } while (!c05a13.AIi(c05a13.getValue(), C7H.A0E));
                        C05A c05a14 = this.A0L;
                        do {
                        } while (!c05a14.AIi(c05a14.getValue(), C6B.A03));
                        return;
                    }
                    if (!(ca0 instanceof C4F)) {
                        return;
                    }
                    InterfaceC30843DhI interfaceC30843DhI = ((C4F) ca0).A00;
                    if (interfaceC30843DhI instanceof C29499CzD) {
                        c28421CgT = this.A0B;
                        c8o = C8o.A0I;
                    } else if (interfaceC30843DhI instanceof C29497CzB) {
                        c28421CgT = this.A0B;
                        c8o = C8o.A0G;
                    } else if (interfaceC30843DhI instanceof C29498CzC) {
                        c28421CgT = this.A0B;
                        c8o = C8o.A0H;
                    } else if (interfaceC30843DhI instanceof C29496CzA) {
                        c28421CgT = this.A0B;
                        c8o = C8o.A0F;
                    } else if (interfaceC30843DhI instanceof C29500CzE) {
                        c28421CgT = this.A0B;
                        c8o = C8o.A0J;
                    } else {
                        throw B4Z.A00();
                    }
                    C28421CgT.A02(c8o, c28421CgT);
                    return;
                }
            }
        }
        A02(this);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        AbstractC25229BEm.A1R(this.A04);
        AbstractC25229BEm.A1R(this.A05);
    }

    public static final Bitmap A00(Bitmap bitmap) {
        if (bitmap.getWidth() > 1080 && bitmap.getHeight() > 1080) {
            Bitmap bitmap2 = bitmap;
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 1080.0f;
            if (min > 1.0f) {
                bitmap2 = AbstractC25236BEt.A0B(bitmap, min);
                C14360o3.A0A(bitmap2);
            }
            bitmap.recycle();
            return bitmap2;
        }
        return bitmap;
    }

    public static final void A04(C25811BbS c25811BbS, short s) {
        C141796aw A00 = AbstractC141776au.A00(c25811BbS);
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00, new D51(c25811BbS, (InterfaceC23621Ds) null, s), A00);
    }
}
