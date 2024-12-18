package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.config.PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2;
import java.util.Map;

/* renamed from: X.86A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86A implements AnonymousClass866, C86B {
    public final C86G A00;
    public final C86H A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final C1810981l A04;
    public final C86D A05;
    public final Map A06;
    public final /* synthetic */ C86C A07;

    public C86A(UserSession userSession, C1810981l c1810981l, Map map, boolean z) {
        C14360o3.A0B(map, 3);
        this.A07 = new C86C(c1810981l, map);
        this.A02 = userSession;
        this.A04 = c1810981l;
        this.A06 = map;
        this.A05 = new C86D("pre_capture");
        this.A03 = AbstractC09440dt.A01(new C9ET(this, 3));
        this.A00 = C86G.A00;
        this.A01 = new C86H(z);
    }

    @Override // X.AnonymousClass866
    public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
        C14360o3.A0B(c85d, 0);
        C14360o3.A0B(c9cb, 1);
        return this.A07.ANN(c9cb, c85d);
    }

    @Override // X.C86B
    public final InterfaceC19390xP ARK(C1810281e c1810281e) {
        C14360o3.A0B(c1810281e, 0);
        C1810981l c1810981l = this.A04;
        InterfaceC19390xP A01 = C0ST.A01(C10Q.A03(new C57182PaB(8, null), C0JE.A00(new MCK(c1810981l, (InterfaceC23621Ds) null, 49, 42)), C0JE.A00(new C25023B5e((InterfaceC23621Ds) null, c1810981l, 0))));
        final InterfaceC19390xP A00 = AbstractC184118Fa.A00(c1810281e);
        return C0ST.A01(C10Q.A03(new C9D2(3, null), A01, new InterfaceC19390xP() { // from class: X.8Fc
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }));
    }

    @Override // X.AnonymousClass866
    public final boolean Akz() {
        return this.A07.Akz();
    }

    @Override // X.AnonymousClass866
    public final Integer B0k() {
        return this.A07.B0k();
    }

    @Override // X.AnonymousClass866
    public final boolean Bv8() {
        return this.A07.Bv8();
    }

    @Override // X.AnonymousClass866
    public final boolean Bvf() {
        return this.A07.Bvf();
    }

    @Override // X.AnonymousClass866
    public final boolean Bvp() {
        return this.A07.Bvp();
    }

    @Override // X.C86B
    public final C86I AM7() {
        return new C173767oU((C1824487j) this.A03.getValue(), this.A00, this.A01, B0f(), this.A02);
    }

    @Override // X.C86B
    public final boolean Aky() {
        return true;
    }

    @Override // X.C86B
    public final EnumC190378bv B0f() {
        if (C14360o3.A0K(this.A04.A08.A00, C81S.A00)) {
            return EnumC190378bv.A04;
        }
        return EnumC190378bv.A07;
    }

    @Override // X.AnonymousClass866
    public final boolean Bv5() {
        return !this.A07.Bv8();
    }

    @Override // X.C86B
    public final C86D CAr() {
        return this.A05;
    }

    @Override // X.C86B
    public final boolean CSx() {
        return this.A04.A0R();
    }
}
