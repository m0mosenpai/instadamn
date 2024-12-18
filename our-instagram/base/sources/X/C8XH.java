package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.8XH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XH implements InterfaceC60072op, C06N {
    public C8XI A00;
    public C8XI A01;
    public final Fragment A02;
    public final AbstractC10360h2 A03;
    public final C1816783z A04;
    public final C8XG A05;
    public final InterfaceC1810081c A06;

    public C8XH(Fragment fragment, C1816783z c1816783z, C8XG c8xg, InterfaceC1810081c interfaceC1810081c) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(c1816783z, 3);
        this.A02 = fragment;
        this.A06 = interfaceC1810081c;
        this.A04 = c1816783z;
        this.A05 = c8xg;
        AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
        childFragmentManager.A0r(this);
        this.A03 = childFragmentManager;
        C8XI c8xi = C8XI.A04;
        this.A01 = c8xi;
        this.A00 = c8xi;
        C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A02;
        EnumC1810381f enumC1810381f = EnumC1810381f.A03;
        EnumC1810381f enumC1810381f2 = EnumC1810381f.A04;
        c1810281e.A03(C8XJ.class, enumC1810381f, enumC1810381f2);
        EnumC1810381f enumC1810381f3 = EnumC1810381f.A02;
        c1810281e.A03(C8XJ.class, enumC1810381f3, enumC1810381f2);
        c1810281e.A03(C8XK.class, enumC1810381f2, enumC1810381f);
        c1810281e.A03(C8XL.class, enumC1810381f2, enumC1810381f);
        c1810281e.A03(C8XM.class, enumC1810381f2, enumC1810381f3);
        c1810281e.A03(C8XN.class, enumC1810381f2, enumC1810381f3);
        C8XO c8xo = (C8XO) new C52942bb(fragment).A00(C8XO.class);
        c8xo.A00.A06(fragment, new C151846sU(new C8XP(this)));
        c8xo.A01.A06(fragment, new C151846sU(new C8XQ(this)));
        c8xo.A02.A06(fragment, new C151846sU(new C8XR(this)));
        c8xo.A03.A06(fragment, new C151846sU(new C8XS(this)));
        c8xo.A04.A06(fragment, new C151846sU(new C8XT(this)));
    }

    public static final void A00(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A09(fragment, R.id.quick_capture_fragment_container);
        c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        c14240no.A0I("QuickCaptureSubFragmentManager");
        c14240no.A01();
    }

    public static final void A01(Fragment fragment, C8XH c8xh) {
        String string;
        Bundle bundle = c8xh.A02.mArguments;
        if (bundle != null && (string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY")) != null) {
            Bundle bundle2 = fragment.mArguments;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            String string2 = bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY");
            if (string2 == null || string2.length() == 0) {
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", string);
            }
            fragment.setArguments(bundle2);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC08430c6 A0O = this.A03.A0O(R.id.quick_capture_fragment_container);
        if (!C14360o3.A0K(A0O, this.A02) && (A0O instanceof InterfaceC60072op)) {
            return ((InterfaceC60072op) A0O).onBackPressed();
        }
        return false;
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
        Object obj;
        if (this.A03.A0L() == 0) {
            InterfaceC1810081c interfaceC1810081c = this.A06;
            if (interfaceC1810081c.AuH() == EnumC1810381f.A04) {
                C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A02;
                int ordinal = this.A00.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    int ordinal2 = this.A01.ordinal();
                                    if (ordinal2 != 0) {
                                        if (ordinal2 == 1) {
                                            obj = new Object();
                                        } else {
                                            throw new IllegalStateException("captureStateOnLaunch not initialized");
                                        }
                                    }
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                this.A02.requireActivity().finish();
                                obj = C0eB.A00;
                            }
                        } else {
                            obj = new Object();
                        }
                    } else {
                        obj = new Object();
                    }
                    c1810281e.A04(obj);
                    C8XI c8xi = C8XI.A04;
                    this.A01 = c8xi;
                    this.A00 = c8xi;
                }
                obj = new Object();
                c1810281e.A04(obj);
                C8XI c8xi2 = C8XI.A04;
                this.A01 = c8xi2;
                this.A00 = c8xi2;
            }
        }
    }
}
