package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes11.dex */
public final class U62 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ U60 A01;

    public U62(U60 u60, int i) {
        this.A01 = u60;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        String str;
        View view2;
        U60 u60 = this.A01;
        int i = this.A00;
        if (u60.A08 != null) {
            if (i != 0) {
                String str2 = "bind_initial_content_start";
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i == 7) {
                                        InterfaceC72008XEw interfaceC72008XEw = u60.A04;
                                        if (interfaceC72008XEw != null) {
                                            interfaceC72008XEw.Cna("bind_initial_content_end");
                                        }
                                        AbstractC69784VvL abstractC69784VvL = u60.A08.A05;
                                        if (abstractC69784VvL != null) {
                                            abstractC69784VvL.A02();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                InterfaceC72008XEw interfaceC72008XEw2 = u60.A04;
                                if (interfaceC72008XEw2 != null) {
                                    interfaceC72008XEw2.Cna("bind_initial_content_start");
                                }
                                FrameLayout frameLayout = u60.A01;
                                if (frameLayout == null) {
                                    return;
                                }
                                frameLayout.setVisibility(0);
                                C126545np c126545np = u60.A05;
                                if (c126545np != null && u60.A0F) {
                                    c126545np.setVisibility(0);
                                }
                                C57012jc c57012jc = u60.A0B;
                                if (c57012jc == null) {
                                    InterfaceC72008XEw interfaceC72008XEw3 = u60.A04;
                                    if (interfaceC72008XEw3 != null) {
                                        interfaceC72008XEw3.Cna("component_missing");
                                    }
                                } else if (c57012jc.A00 != null) {
                                    c57012jc.A01().setVisibility(8);
                                }
                                FrameLayout frameLayout2 = u60.A01;
                                if (frameLayout2 != null && (view2 = u60.A00) != null) {
                                    frameLayout2.removeView(view2);
                                    u60.A00 = null;
                                }
                                u60.A0F = false;
                                C3DN c3dn = u60.A0D;
                                if (c3dn == null) {
                                    return;
                                }
                                c3dn.A0U(C05F.A1I);
                                return;
                            }
                            C66201U3x c66201U3x = u60.A02;
                            c66201U3x.getClass();
                            Throwable A05 = c66201U3x.A05();
                            if (A05 == null) {
                                A05 = new Throwable("Bloks Request Error");
                            }
                            C115095Ie c115095Ie = new C115095Ie(A05);
                            C66273U6s c66273U6s = u60.A03;
                            if (c66273U6s != null && (str = c66273U6s.A09) != null) {
                                F0B.A00(c115095Ie, "AsyncScreen", str);
                            }
                            FrameLayout frameLayout3 = u60.A01;
                            if (frameLayout3 != null && (view = u60.A00) != null) {
                                frameLayout3.removeView(view);
                                u60.A00 = null;
                            }
                            u60.A0F = false;
                            u60.A0B.A01().setVisibility(0);
                            AbstractC69784VvL abstractC69784VvL2 = u60.A08.A05;
                            if (abstractC69784VvL2 == null) {
                                return;
                            }
                            abstractC69784VvL2.A03(c115095Ie);
                            return;
                        }
                        str2 = "receive_additional";
                    } else {
                        InterfaceC72008XEw interfaceC72008XEw4 = u60.A04;
                        if (interfaceC72008XEw4 == null) {
                            return;
                        }
                        interfaceC72008XEw4.Cna("bind_initial_content_end");
                        return;
                    }
                }
                InterfaceC72008XEw interfaceC72008XEw5 = u60.A04;
                if (interfaceC72008XEw5 == null) {
                    return;
                }
                interfaceC72008XEw5.Cna(str2);
                return;
            }
            InterfaceC72008XEw interfaceC72008XEw6 = u60.A04;
            if (interfaceC72008XEw6 != null) {
                interfaceC72008XEw6.Cna("request_start");
            }
            AbstractC69784VvL abstractC69784VvL3 = u60.A08.A05;
            if (abstractC69784VvL3 != null) {
                abstractC69784VvL3.A01();
            }
            FrameLayout frameLayout4 = u60.A01;
            if (frameLayout4 == null || u60.getContext() == null || u60.A00 != null) {
                return;
            }
            u60.A0F = true;
            IgBloksScreenConfig igBloksScreenConfig = u60.A08;
            if (igBloksScreenConfig != null && igBloksScreenConfig.A0N != null) {
                View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(u60.getContext()), frameLayout4, igBloksScreenConfig.A0N.intValue());
                u60.A00 = A0A;
                frameLayout4.addView(A0A);
            } else {
                SpinnerImageView spinnerImageView = new SpinnerImageView(u60.getContext());
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                u60.A00 = spinnerImageView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) AbstractC13880nE.A04(u60.requireContext(), 200));
                layoutParams.gravity = 17;
                frameLayout4.addView(u60.A00, layoutParams);
            }
        }
    }
}
