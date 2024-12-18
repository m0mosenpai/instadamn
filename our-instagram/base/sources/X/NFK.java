package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class NFK extends AbstractC66422zJ {
    public final C34629FNm A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51337Mly(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.activity_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        int i;
        View A0S;
        int i2;
        C51819MvN c51819MvN = (C51819MvN) interfaceC66482zP;
        C51337Mly c51337Mly = (C51337Mly) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c51819MvN, c51337Mly);
        C34629FNm c34629FNm = this.A00;
        EnumC53099NeC enumC53099NeC = c51819MvN.A00;
        C7IK c7ik = c51819MvN.A01;
        boolean z = c51819MvN.A06;
        String str = c51819MvN.A02;
        String str2 = c51819MvN.A03;
        String str3 = c51819MvN.A04;
        boolean z2 = c51819MvN.A05;
        int i3 = 0;
        C14360o3.A0B(c34629FNm, 0);
        C14360o3.A0B(enumC53099NeC, A1R ? 1 : 0);
        if (z) {
            View view2 = c51337Mly.A01;
            view2.setVisibility(0);
            IgTextView igTextView = c51337Mly.A04;
            igTextView.setText(str3);
            igTextView.setSelected(A1R);
            IgTextView igTextView2 = c51337Mly.A02;
            Context context = view2.getContext();
            if (enumC53099NeC instanceof NLT) {
                i = 2131954981;
                if (z2) {
                    i = 2131954985;
                }
            } else if (enumC53099NeC instanceof NLS) {
                i = 2131960150;
            } else if (enumC53099NeC instanceof NLR) {
                i = 2131976228;
            } else {
                i = 2131971100;
                if (z2) {
                    i = 2131971103;
                }
            }
            AbstractC166987dD.A1P(context, igTextView2, i);
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(c34629FNm, enumC53099NeC, str, str2, 4), view2);
            c51337Mly.A00 = c7ik;
            if (c7ik != null) {
                igTextView.setTextColor(c7ik.A0C);
                igTextView2.setTextColor(c7ik.A0A);
            }
            int[] iArr = O08.A00;
            int ordinal = enumC53099NeC.ordinal();
            int i4 = iArr[ordinal];
            IgTextView igTextView3 = c51337Mly.A03;
            int i5 = 8;
            if (i4 == A1R) {
                i5 = 0;
            }
            igTextView3.setVisibility(i5);
            C54639OBo c54639OBo = c51337Mly.A05;
            InterfaceC56392iX interfaceC56392iX = c54639OBo.A01;
            if (interfaceC56392iX.CWW()) {
                interfaceC56392iX.getView().setVisibility(8);
            }
            InterfaceC56392iX interfaceC56392iX2 = c54639OBo.A00;
            AbstractC31178DnM.A1P(interfaceC56392iX2);
            InterfaceC56392iX interfaceC56392iX3 = c54639OBo.A03;
            AbstractC31178DnM.A1P(interfaceC56392iX3);
            InterfaceC56392iX interfaceC56392iX4 = c54639OBo.A02;
            AbstractC31178DnM.A1P(interfaceC56392iX4);
            int i6 = O07.A00[ordinal];
            if (i6 != A1R) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            View view3 = interfaceC56392iX4.getView();
                            view3.setVisibility(0);
                            if (c7ik != null) {
                                View A0S2 = AbstractC166997dE.A0S(view3, R.id.card);
                                View A0S3 = AbstractC166997dE.A0S(view3, R.id.option_1_vote_bar);
                                A0S = AbstractC166997dE.A0S(view3, R.id.option_2_vote_bar);
                                A00(A0S2, c7ik.A07);
                                i2 = c7ik.A0A;
                                A00(A0S3, i2);
                            } else {
                                return;
                            }
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        View view4 = interfaceC56392iX3.getView();
                        view4.setVisibility(0);
                        if (c7ik == null) {
                            return;
                        }
                        View A0R = AbstractC166997dE.A0R(view4, R.id.background_card_1);
                        View A0R2 = AbstractC166997dE.A0R(view4, R.id.center_card);
                        ImageView A0D = AbstractC31176DnK.A0D(view4, R.id.spotlight_icon);
                        int i7 = c7ik.A0A;
                        A00(A0R, i7);
                        A00(A0R2, c7ik.A07);
                        ColorStateList valueOf = ColorStateList.valueOf(i7);
                        C14360o3.A07(valueOf);
                        A0D.setImageTintList(valueOf);
                        return;
                    }
                } else {
                    View view5 = interfaceC56392iX2.getView();
                    view5.setVisibility(0);
                    if (c7ik == null) {
                        return;
                    }
                    View A0S4 = AbstractC166997dE.A0S(view5, R.id.background_card_2);
                    View A0S5 = AbstractC166997dE.A0S(view5, R.id.center_card);
                    A0S = AbstractC166997dE.A0S(view5, R.id.thumbnail_timer);
                    int i8 = c7ik.A07;
                    A00(A0S4, i8);
                    A00(A0S5, i8);
                    i2 = c7ik.A0A;
                }
                A00(A0S, i2);
                return;
            }
            view = interfaceC56392iX.getView();
        } else {
            view = c51337Mly.A01;
            i3 = 8;
        }
        view.setVisibility(i3);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51819MvN.class;
    }

    public NFK(C34629FNm c34629FNm) {
        this.A00 = c34629FNm;
    }

    public static void A00(View view, int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C14360o3.A07(valueOf);
        view.setBackgroundTintList(valueOf);
    }
}
