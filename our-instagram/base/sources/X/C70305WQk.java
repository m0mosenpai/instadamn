package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;

/* renamed from: X.WQk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70305WQk implements InterfaceC58362lv {
    public final /* synthetic */ C2GT A00;
    public final /* synthetic */ C2GL A01;

    public C70305WQk(C2GT c2gt, C2GL c2gl) {
        this.A01 = c2gl;
        this.A00 = c2gt;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C2GL c2gl;
        C2I1 c2i1;
        C2I1 c2i12;
        Object obj2;
        C62678SLr c62678SLr = (C62678SLr) obj;
        C14360o3.A0B(c62678SLr, 0);
        Throwable th = c62678SLr.A02;
        if (AbstractC25229BEm.A1Z(th)) {
            Object obj3 = (XL1) c62678SLr.A01;
            if (obj3 != null && (obj2 = (XL0) ((C2JS) obj3).getOptionalTreeField(0, "migrate_autofill_key(data:$input)", C67556Unu.class, -596972262)) != null) {
                C2JS c2js = (C2JS) obj2;
                C2I1 c2i13 = C2I1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                c2i1 = (C2I1) c2js.getOptionalEnumField(2, "app_migration_result", c2i13);
                c2i12 = (C2I1) c2js.getOptionalEnumField(3, "cross_app_migration_result", c2i13);
            } else {
                c2i1 = null;
                c2i12 = null;
            }
            C2I1 c2i14 = C2I1.SUCCESS;
            if ((c2i1 == c2i14 || c2i1 == C2I1.SKIPPED) && (c2i12 == c2i14 || c2i12 == C2I1.SKIPPED)) {
                c2gl = this.A01;
                C69572Vrb c69572Vrb = ((C2GM) c2gl).A03;
                if (c69572Vrb != null) {
                    String A00 = AbstractC69851Vwc.A00(c2i1);
                    String A002 = AbstractC69851Vwc.A00(c2i12);
                    LinkedHashMap A01 = AbstractC69851Vwc.A01(null, ((C2GM) c2gl).A00);
                    InterfaceC02590Ai A0H = MSY.A0H(c69572Vrb.A00, "client_copy_autofillproof_success");
                    if (A0H.isSampled()) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("cross_app_migration_status", A002);
                        c0Zx.A06("legacy_key_migration_status", A00);
                        c0Zx.A03("legacy_key_migration_should_retry", false);
                        c0Zx.A03("cross_app_migration_should_retry", false);
                        A0H.AAP(AbstractC58358Pty.A00(), c69572Vrb.A01);
                        A0H.A8R(C2O5.A04, "product_type");
                        A0H.A8R(EnumC31203Dnm.ANDROID, "platform");
                        C14360o3.A07(c69572Vrb.A02.getValue());
                        A0H.A9K("actual_event_time", AbstractC31173DnH.A0g());
                        A0H.AAQ(c0Zx, "event_payload");
                        A0H.A9M("extra_data", A01);
                        A0H.AAP(TraceFieldType.ErrorCode, "");
                        A0H.Cht();
                    }
                    String A04 = C18U.A04(C06090Tz.A06, c2gl.A03, 36873376572702733L);
                    ((C2GM) c2gl).A00 = 0;
                    C47522Gc c47522Gc = c2gl.A04;
                    C14360o3.A07(C2GM.A07.getValue());
                    long currentTimeMillis = System.currentTimeMillis();
                    C2Hn c2Hn = c47522Gc.A00;
                    c2Hn.A02 = currentTimeMillis;
                    c47522Gc.A00();
                    c2Hn.A00 = 0;
                    c47522Gc.A00();
                    c2Hn.A03 = c2i1;
                    c47522Gc.A00();
                    c2Hn.A04 = c2i12;
                    c47522Gc.A00();
                    if (C2GM.A06) {
                        c2Hn.A05.put(A04, 0);
                        c47522Gc.A00();
                    }
                    this.A00.A05(C65705Tsd.A08);
                    c2gl.A05.clear();
                    return;
                }
                C14360o3.A0F("uplLogger");
                throw C00O.createAndThrow();
            }
            c2gl = this.A01;
            C69572Vrb c69572Vrb2 = ((C2GM) c2gl).A03;
            if (c69572Vrb2 != null) {
                c69572Vrb2.A00(null, AbstractC69851Vwc.A00(c2i1), AbstractC69851Vwc.A00(c2i12), AbstractC69851Vwc.A01(null, ((C2GM) c2gl).A00));
                c2gl.A01(c2i1, c2i12, C18U.A04(C06090Tz.A06, c2gl.A03, 36873376572702733L));
                this.A00.A05(C65705Tsd.A08);
                c2gl.A05.clear();
                return;
            }
            C14360o3.A0F("uplLogger");
            throw C00O.createAndThrow();
        }
        c2gl = this.A01;
        C69572Vrb c69572Vrb3 = ((C2GM) c2gl).A03;
        if (c69572Vrb3 != null) {
            c69572Vrb3.A00(new Exception(th), "FAILURE", "FAILURE", AbstractC69851Vwc.A01(null, ((C2GM) c2gl).A00));
            String A042 = C18U.A04(C06090Tz.A06, c2gl.A03, 36873376572702733L);
            C2I1 c2i15 = C2I1.NONE;
            c2gl.A01(c2i15, c2i15, A042);
            this.A00.A05(C65705Tsd.A08);
            c2gl.A05.clear();
            return;
        }
        C14360o3.A0F("uplLogger");
        throw C00O.createAndThrow();
    }
}
