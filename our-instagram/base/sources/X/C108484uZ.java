package X;

import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.4uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108484uZ implements InterfaceC12870lZ, InterfaceC13000lm {
    public final long A00;
    public final C18920wW A01;
    public final String A02;
    public final Random A03 = new Random();
    public final UserSession A04;

    private final boolean A00() {
        if (this.A03.nextInt(100) >= 30) {
            return false;
        }
        return true;
    }

    public C108484uZ(UserSession userSession) {
        this.A04 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A00 = C18U.A01(c06090Tz, userSession, 36597034078767840L);
        this.A02 = C18U.A04(c06090Tz, userSession, 36878509055410368L);
        this.A01 = AbstractC12220kQ.A02(userSession);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        String str;
        Boolean valueOf;
        Long valueOf2;
        Double valueOf3;
        String A0O;
        int A03 = C0f9.A03(1370859185);
        Random random = this.A03;
        if (random.nextInt(100) < this.A00) {
            C18920wW c18920wW = this.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "fa_double_logging_event");
            if (A00.isSampled()) {
                A00.AAP(MSV.A00(174), "Instagram");
                A00.AAP("platform", "Android");
                A00.A9K(AbstractC111324zv.A00(1341), Long.valueOf(System.currentTimeMillis()));
                A00.A7v("boolean_property_1", Boolean.valueOf(A00()));
                A00.A9K("int_property_1", Long.valueOf(random.nextInt(1000)));
                A00.A8I("float_property_1", Double.valueOf(random.nextDouble() * 1000.0d));
                int nextInt = random.nextInt(100);
                if (nextInt <= 58) {
                    str = "event_1";
                } else if (nextInt <= 74) {
                    str = "event_2";
                } else if (nextInt <= 81) {
                    str = "event_3";
                } else if (nextInt <= 93) {
                    str = "event_4";
                } else if (nextInt <= 98) {
                    str = "event_5";
                } else {
                    str = "event_6";
                }
                A00.AAP("string_property_1", str);
                String str2 = null;
                if (A00()) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(A00());
                }
                A00.A7v("boolean_property_2", valueOf);
                if (A00()) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(random.nextInt(1000));
                }
                A00.A9K("int_property_2", valueOf2);
                if (A00()) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Double.valueOf(random.nextDouble() * 1000.0d);
                }
                A00.A8I("float_property_2", valueOf3);
                if (A00()) {
                    A0O = null;
                } else {
                    A0O = AnonymousClass001.A0O("random_string_", random.nextInt(100));
                }
                A00.AAP("string_property_2", A0O);
                String str3 = this.A02;
                if (str3.length() != 0) {
                    str2 = str3;
                }
                A00.AAP("tag", str2);
                A00.Cht();
            }
        }
        C0f9.A0A(-1584791633, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1082783096, C0f9.A03(1948557677));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
