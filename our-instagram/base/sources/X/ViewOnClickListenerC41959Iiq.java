package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iiq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41959Iiq implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public ViewOnClickListenerC41959Iiq(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        EnumC77213d7 enumC77213d7;
        int A052;
        int i2;
        IllegalStateException A14;
        int i3;
        EnumC189548aZ enumC189548aZ;
        C22P c22p;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1238764645);
                C38211GrG c38211GrG = (C38211GrG) this.A01;
                C14360o3.A0A(view);
                C37931GmT c37931GmT = (C37931GmT) this.A02;
                boolean z = this.A03;
                C14360o3.A0B(view, 0);
                C38208GrD c38208GrD = c38211GrG.A03;
                InterfaceC60442pS interfaceC60442pS = c38211GrG.A04;
                UserSession userSession = c38208GrD.A00;
                AbstractC37301Gc2.A07(userSession).A0B(view, new String[0]);
                C37931GmT c37931GmT2 = c38208GrD.A01;
                C38321qM BQN = c37931GmT2.BQN();
                User A142 = AbstractC25226BEj.A14(BQN);
                if (A142 != null) {
                    C32U.A0J(userSession, new C42541IsK(userSession, c37931GmT2), C65.BRAND, BQN, interfaceC60442pS, null, null, null, null, null, AbstractC111324zv.A00(3126), null, null, null, 0, A142.A2N(), z);
                }
                C38321qM BQN2 = c37931GmT.BQN();
                User A143 = AbstractC25226BEj.A14(BQN2);
                if (A143 != null) {
                    String id = BQN2.getId();
                    if (id != null) {
                        SourceModelInfoParams sourceModelInfoParams = new SourceModelInfoParams(id, 0, 0);
                        if (A143.A2N()) {
                            UserSession userSession2 = c38211GrG.A02;
                            String A07 = AbstractC41071vF.A07(userSession2, BQN2);
                            if (A07 == null) {
                                C0w9.A03("GridAdsDelegateHandler", "Grid Ad cannot navigate to PBIA due to null adId");
                            } else {
                                C140966Yy A0P = AbstractC31173DnH.A0P(c38211GrG.A01.requireActivity(), userSession2);
                                A0P.A0D(AbstractC86593tX.A0A(sourceModelInfoParams, A07, z));
                                A0P.A04();
                            }
                        } else {
                            UserSession userSession3 = c38211GrG.A02;
                            C28431Ze A02 = AbstractC31364DqT.A02();
                            C31368DqX A01 = AbstractC31402Dr6.A01(userSession3, A143.getId(), "ad_cta_profile_link", interfaceC60442pS.getModuleName());
                            A01.A04 = sourceModelInfoParams;
                            A01.A0U = z;
                            Bundle A04 = AbstractC37301Gc2.A04(userSession3, A02, A01);
                            Context context = c38211GrG.A00;
                            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                            AbstractC31174DnI.A0a((Activity) context, A04, userSession3, ModalActivity.class, "profile").A0C(context);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                i = -353390738;
                break;
            case 1:
                A05 = C0f9.A05(372226781);
                Venue venue = (Venue) this.A02;
                if (this.A03) {
                    enumC77213d7 = EnumC77213d7.A03;
                } else {
                    enumC77213d7 = EnumC77213d7.A04;
                }
                V1B v1b = (V1B) this.A01;
                SaveApiUtil.A07(v1b.getContext(), v1b.A02, enumC77213d7, venue, AbstractC111324zv.A00(2366));
                i = 1684212976;
                break;
            case 2:
                A052 = C0f9.A05(-1857556041);
                C42276Io0 c42276Io0 = (C42276Io0) this.A02;
                UserSession userSession4 = c42276Io0.A0R;
                C189448aO A0y = AbstractC25225BEi.A0y(userSession4);
                C38929HCc c38929HCc = c42276Io0.A0V;
                AbstractC25226BEj.A1M(c38929HCc.requireContext(), A0y, 2131953317);
                C189478aR A00 = A0y.A00();
                FragmentActivity requireActivity = c38929HCc.requireActivity();
                Parcelable parcelable = (Parcelable) ((List) this.A01).get(0);
                C14360o3.A0B(parcelable, 0);
                C38942HCr c38942HCr = new C38942HCr();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable("audio_part_metadata", parcelable);
                c38942HCr.setArguments(A0b);
                A00.A02(requireActivity, c38942HCr);
                EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0X;
                long j = c42276Io0.A0M;
                boolean z2 = this.A03;
                C153756vk c153756vk = c42276Io0.A0Q;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc, userSession4), "instagram_organic_partial_attribution_ufi_tap");
                if (A0f.isSampled()) {
                    AbstractC37303Gc4.A0n(A0f, "audio_page", j);
                    AbstractC25225BEi.A1M(enumC39652Hih, A0f);
                    A0f.A9K("is_trending_label", Long.valueOf(AbstractC37302Gc3.A03(z2 ? 1 : 0)));
                    AbstractC37302Gc3.A0t(A0f);
                    AbstractC37303Gc4.A0e(A0f, c153756vk);
                    A0f.Cht();
                }
                i2 = 1148276281;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A052 = C0f9.A05(1048504287);
                C3DO c3do = C3DN.A00;
                C38922HBu c38922HBu = (C38922HBu) this.A02;
                Context context2 = c38922HBu.getContext();
                if (context2 != null) {
                    C3DN A012 = c3do.A01(context2);
                    if (A012 != null) {
                        A012.A0B();
                    }
                    C38321qM c38321qM = (C38321qM) this.A01;
                    if (c38321qM != null) {
                        boolean z3 = this.A03;
                        if (z3) {
                            enumC189548aZ = EnumC189548aZ.A07;
                        } else {
                            enumC189548aZ = EnumC189548aZ.A06;
                        }
                        InterfaceC09390do interfaceC09390do = c38922HBu.A0B;
                        interfaceC09390do.getValue();
                        if (c38922HBu.A05 == null) {
                            str = "containerModuleName";
                        } else {
                            C37855Gl9 c37855Gl9 = C37855Gl9.A00;
                            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                            FragmentActivity activity = c38922HBu.getActivity();
                            if (activity != null) {
                                Fragment fragment = c38922HBu.mParentFragment;
                                if (fragment != null) {
                                    if (z3) {
                                        c22p = C22P.A1P;
                                    } else {
                                        c22p = c38922HBu.A02;
                                        if (c22p == null) {
                                            str = "entrypoint";
                                        }
                                    }
                                    String str2 = c38922HBu.A07;
                                    String str3 = c38922HBu.A08;
                                    String str4 = c38922HBu.A06;
                                    c37855Gl9.A0F(activity, fragment, c22p, A0r, c38922HBu.A03, enumC189548aZ, c38321qM, null, c38922HBu.A04, str2, str3, str4, c38922HBu.A09);
                                } else {
                                    A14 = AbstractC166987dD.A14("Required value was null.");
                                    i3 = -2009561592;
                                }
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i3 = 1788458883;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    i2 = -1315102968;
                    C0f9.A0C(i2, A052);
                    return;
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i3 = -2128258385;
                C0f9.A0C(i3, A052);
                throw A14;
            default:
                A052 = C0f9.A05(98193819);
                C25448BNn c25448BNn = (C25448BNn) this.A02;
                InterfaceC31137Dmc interfaceC31137Dmc = c25448BNn.A07;
                C38321qM c38321qM2 = (C38321qM) this.A01;
                interfaceC31137Dmc.DCc(c38321qM2);
                UserSession userSession5 = c25448BNn.A04;
                InterfaceC60442pS interfaceC60442pS2 = c25448BNn.A06;
                AbstractC37670Gi3.A0D(BQL.A1Q, userSession5, c38321qM2, interfaceC60442pS2, AbstractC111324zv.A00(399), this.A03);
                i2 = -1144186145;
                C0f9.A0C(i2, A052);
                return;
        }
        C0f9.A0C(i, A05);
    }
}
