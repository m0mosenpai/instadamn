package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HFY extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C42590It8 A01;
    public final C42590It8 A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        TextView textView;
        Resources resources;
        int i2;
        Object[] objArr;
        String str2;
        C38321qM c38321qM;
        UserSession userSession;
        User A2E;
        String CAl;
        int A03 = C0f9.A03(1740745851);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        IKY iky = (IKY) obj;
        if (i != 0) {
            if (i != 1) {
                if (i == A06) {
                    Object tag = view.getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileBioRowViewBinder.Holder");
                    IKI iki = (IKI) tag;
                    C42590It8 c42590It8 = this.A01;
                    Context A0L = AbstractC166997dE.A0L(view);
                    boolean A1T = AbstractC31175DnJ.A1T(1, iki, iky);
                    C14360o3.A0B(c42590It8, A06);
                    TextView textView2 = iki.A01;
                    String str3 = iky.A05;
                    if (str3 != null) {
                        textView2.setText(str3);
                        if (iky.A0A) {
                            InterfaceC09390do interfaceC09390do = iki.A06;
                            A00(interfaceC09390do, A1T ? 1 : 0).setText(iky.A07);
                            ViewOnClickListenerC42032Ik1.A01(AbstractC166987dD.A0d(interfaceC09390do), 43, c42590It8);
                            C38321qM c38321qM2 = c42590It8.A01;
                            if (c38321qM2 != null && (A2E = c38321qM2.A2E((userSession = c42590It8.A08))) != null && (CAl = A2E.A03.CAl()) != null) {
                                Context context = c42590It8.A05;
                                String id = A2E.getId();
                                Rie rie = Rie.PBIA_PROXY_PROFILE;
                                AbstractC76693cH.A02(context, rie, userSession, id, CAl);
                                new AnonymousClass730(userSession).A00(rie, A2E.getId(), A2E.A03.CAl(), null, A1T);
                            }
                        }
                        List list = iky.A09;
                        if (list != null && !list.isEmpty()) {
                            A00(iki.A04, A1T ? 1 : 0).setText(AbstractC13670mt.A05(" · ", iky.A09));
                        }
                        String str4 = iky.A03;
                        if (str4 != null && str4.length() != 0) {
                            A00(iki.A02, A1T ? 1 : 0).setText(iky.A03);
                        }
                        String str5 = iky.A06;
                        if (str5 != null && str5.length() != 0) {
                            A00(iki.A05, A1T ? 1 : 0).setText(iky.A06);
                        }
                        String str6 = iky.A08;
                        if (str6 != null && str6.length() != 0 && URLUtil.isValidUrl(str6)) {
                            InterfaceC09390do interfaceC09390do2 = iki.A07;
                            A00(interfaceC09390do2, A1T ? 1 : 0).setText(iky.A08);
                            C0fQ.A00(new ViewOnClickListenerC35671Fp6(str6, c42590It8, 13), AbstractC166987dD.A0d(interfaceC09390do2));
                            View A0d = AbstractC166987dD.A0d(interfaceC09390do2);
                            C14360o3.A0B(A0d, A1T ? 1 : 0);
                            UserSession userSession2 = c42590It8.A08;
                            if (C18U.A06(C06090Tz.A05, userSession2, 36321898472286082L) && (c38321qM = c42590It8.A01) != null) {
                                AbstractC99834e5.A01(A0d, userSession2, c38321qM, c42590It8.A0A, A1T);
                            }
                        }
                        FL0 fl0 = iky.A01;
                        if (fl0 != null && (str2 = fl0.A00) != null && str2.length() != 0) {
                            InterfaceC09390do interfaceC09390do3 = iki.A03;
                            A00(interfaceC09390do3, A1T ? 1 : 0).setText(AbstractC1567472a.A05(A0L, fl0.A01, fl0.A02, fl0.A00));
                            C0fQ.A00(new ViewOnClickListenerC35687FpM(7, c42590It8, fl0), AbstractC166987dD.A0d(interfaceC09390do3));
                        }
                    }
                    str = "pageName";
                }
            } else {
                Object tag2 = view.getTag();
                C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileHeaderRowViewBinder.Holder");
                IJ1 ij1 = (IJ1) tag2;
                Context A0L2 = AbstractC166997dE.A0L(view);
                InterfaceC11380iw interfaceC11380iw = this.A00;
                C14360o3.A0B(ij1, 0);
                AbstractC167007dF.A1E(iky, 1, interfaceC11380iw);
                ImageUrl imageUrl = iky.A00;
                if (imageUrl != null) {
                    ij1.A03.setUrl(imageUrl, interfaceC11380iw);
                } else {
                    AbstractC166997dE.A19(A0L2, ij1.A03, R.drawable.profile_anonymous_user);
                }
                String str7 = iky.A05;
                if (str7 != null) {
                    if (str7.length() > 0) {
                        ij1.A02.setText(str7);
                    }
                    List list2 = iky.A09;
                    if (list2 != null && !list2.isEmpty()) {
                        A00(ij1.A04, 0).setText(AbstractC13670mt.A05(" · ", iky.A09));
                    }
                    Integer num = iky.A02;
                    String str8 = iky.A04;
                    if (str8 != null) {
                        if (num != null) {
                            textView = ij1.A01;
                            resources = A0L2.getResources();
                            i2 = 2131969446;
                            objArr = new Object[]{C84963qk.A04(AbstractC166997dE.A0M(A0L2), num, 10000, false, false)};
                        } else if (str8.length() > 0) {
                            textView = ij1.A01;
                            resources = A0L2.getResources();
                            i2 = 2131969446;
                            objArr = new Object[]{str8};
                        }
                        textView.setText(resources.getString(i2, objArr));
                    } else {
                        str = "pageFanCount";
                    }
                }
                str = "pageName";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        Object tag3 = view.getTag();
        C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.pbiaproxyprofile.adapter.PBIAProxyProfileInfoRowViewBinder.Holder");
        ICX icx = (ICX) tag3;
        C42590It8 c42590It82 = this.A02;
        AbstractC25230BEn.A15(1, icx, c42590It82);
        TextView textView3 = icx.A00;
        ViewOnClickListenerC42032Ik1.A01(textView3, 44, c42590It82);
        AbstractC37302Gc3.A0o(textView3.getContext(), textView3, textView3.getText(), 2131954439);
        C0f9.A0A(366384640, A03);
    }

    public HFY(InterfaceC11380iw interfaceC11380iw, C42590It8 c42590It8, C42590It8 c42590It82) {
        this.A00 = interfaceC11380iw;
        this.A02 = c42590It8;
        this.A01 = c42590It82;
    }

    public static TextView A00(InterfaceC09390do interfaceC09390do, int i) {
        ((View) interfaceC09390do.getValue()).setVisibility(i);
        return (TextView) interfaceC09390do.getValue();
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
        anonymousClass306.A7a(1);
        anonymousClass306.A7a(2);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        Object icx;
        int A03 = C0f9.A03(-645935482);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.pbia_proxy_profile_bio, false);
                    icx = new IKI(A0C);
                } else {
                    IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
                    C0f9.A0A(-1245499894, A03);
                    throw A14;
                }
            } else {
                A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.pbia_proxy_profile_image_scoreboard, false);
                icx = new IJ1(A0C);
            }
        } else {
            A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.pbia_proxy_profile_info_row, false);
            icx = new ICX(A0C);
        }
        A0C.setTag(icx);
        C0f9.A0A(1361893742, A03);
        return A0C;
    }
}
