package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.SqI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63610SqI implements InterfaceC09670ek, C07W {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63610SqI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C07T lifecycle;
        ViewGroup viewGroup;
        String str;
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A02;
                if (c07r != obj) {
                    return;
                }
                ((InterfaceC16820sZ) interfaceC74963Ym.getValue()).invoke();
                return;
            case 1:
                AbstractC65952Twx abstractC65952Twx = (AbstractC65952Twx) this.A01;
                if (abstractC65952Twx.A07.A11()) {
                    return;
                }
                c07x.getLifecycle().A0A(this);
                UHT uht = (UHT) this.A02;
                if (!uht.itemView.isAttachedToWindow()) {
                    return;
                }
                abstractC65952Twx.A05(uht);
                return;
            case 2:
                C14360o3.A0B(c07r, 1);
                if (c07r.ordinal() != 5) {
                    return;
                }
                CT3 ct3 = (CT3) this.A02;
                View view = (View) this.A01;
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(view);
                }
                lifecycle = ct3.A03.getLifecycle();
                break;
                break;
            default:
                boolean A1a = AbstractC167017dG.A1a(c07x, c07r);
                if (c07r == C07R.ON_PAUSE) {
                    C61595RqJ c61595RqJ = (C61595RqJ) this.A02;
                    c61595RqJ.A00 = System.currentTimeMillis();
                    C18920wW c18920wW = c61595RqJ.A01;
                    if (c18920wW != null) {
                        C38321qM c38321qM = c61595RqJ.A02;
                        if (c38321qM != null) {
                            String CAR = c38321qM.CAR();
                            String str2 = c61595RqJ.A04;
                            if (str2 != null) {
                                c61595RqJ.A00(c18920wW, null, "mai_play_store_launched", CAR, str2);
                                ((C14510oO) this.A01).A00 = A1a;
                            }
                            str = "appStoreUri";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        str = "media";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "logger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (c07r == C07R.ON_RESUME && ((C14510oO) this.A01).A00) {
                    C61595RqJ c61595RqJ2 = (C61595RqJ) this.A02;
                    long currentTimeMillis = System.currentTimeMillis() - c61595RqJ2.A00;
                    C18920wW c18920wW2 = c61595RqJ2.A01;
                    if (c18920wW2 != null) {
                        C38321qM c38321qM2 = c61595RqJ2.A02;
                        if (c38321qM2 != null) {
                            String CAR2 = c38321qM2.CAR();
                            Double valueOf = Double.valueOf(currentTimeMillis);
                            String str3 = c61595RqJ2.A04;
                            if (str3 != null) {
                                c61595RqJ2.A00(c18920wW2, valueOf, "mai_play_store_dismissed", CAR2, str3);
                                lifecycle = c07x.getLifecycle();
                                break;
                            }
                            str = "appStoreUri";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        str = "media";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    str = "logger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
        }
        lifecycle.A0A(this);
    }
}
