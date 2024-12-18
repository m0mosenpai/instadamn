package X;

import android.content.Context;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190588cG extends AbstractC190598cH implements InterfaceC169507hQ {
    public InterfaceC190578cF A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC169517hR A05;
    public final List A06;

    public C190588cG(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC190578cF interfaceC190578cF, InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC169517hR;
        this.A00 = interfaceC190578cF;
        this.A06 = new ArrayList();
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EYJ(this);
        }
    }

    @Override // X.AbstractC190598cH
    public final void A02(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        super.A02(charSequence);
        this.A02 = true;
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        if (!super.A01) {
            super.A00 = AbstractC001800i.A0U((Collection) interfaceC169517hR.Bov());
            notifyDataSetChanged();
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        B5r b5r = new B5r(this);
                        UserSession userSession = this.A04;
                        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_create_mention_invite_upsell, viewGroup, false);
                        C14360o3.A07(inflate);
                        return new C218539lP(inflate, userSession, b5r);
                    }
                    throw new IllegalStateException(AnonymousClass001.A0O(MSV.A00(AbstractC62862SUj.MAX_FACTORIAL), i));
                }
                B5t b5t = new B5t(this.A00);
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_group_mention_suggestion, viewGroup, false);
                C14360o3.A07(inflate2);
                return new C218519lN(inflate2, b5t);
            }
            C25025B5k c25025B5k = new C25025B5k(this.A00);
            int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_create_group_mention, viewGroup, false);
            C14360o3.A07(inflate3);
            return new C218509lM(inflate3, c25025B5k);
        }
        B5s b5s = new B5s(this);
        int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_reel_tagging, viewGroup, false);
        C14360o3.A07(inflate4);
        return new C218529lO(inflate4, b5s);
    }

    private final boolean A00() {
        if (this.A02) {
            if (C18U.A06(C06090Tz.A05, this.A04, 36325197007041391L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        ViewGroup A00;
        C6RB c6rb;
        ArrayList arrayList;
        int i3 = i;
        C9UT c9ut = (C9UT) c3oo;
        C14360o3.A0B(c9ut, 0);
        int itemViewType = getItemViewType(i3);
        boolean z = true;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    C218539lP c218539lP = (C218539lP) c9ut;
                    UserSession userSession = this.A04;
                    C14360o3.A0B(c218539lP, 0);
                    IgSimpleImageView igSimpleImageView = c218539lP.A01;
                    Context context = igSimpleImageView.getContext();
                    c218539lP.A02.addOnAttachStateChangeListener(new AQ6(userSession, c218539lP));
                    c218539lP.A00.setText(2131966286);
                    igSimpleImageView.setColorFilter(context.getColor(R.color.design_dark_default_color_on_background));
                    return;
                }
                C218519lN c218519lN = (C218519lN) c9ut;
                C217859kI c217859kI = (C217859kI) this.A06.get(i - 1);
                InterfaceC11380iw interfaceC11380iw = this.A03;
                C14360o3.A0B(c218519lN, 0);
                C14360o3.A0B(c217859kI, 1);
                c218519lN.A01 = c217859kI;
                ArrayList A0S = AbstractC001800i.A0S(c217859kI.A06, c217859kI.A05);
                IgTextView igTextView = c218519lN.A03;
                String str = c217859kI.A00.A03;
                if (str == null || str.length() == 0) {
                    str = c218519lN.itemView.getContext().getString(2131963357, Integer.valueOf(A0S.size()));
                }
                igTextView.setText(str);
                c218519lN.A00.A02();
                IgSimpleImageView igSimpleImageView2 = c218519lN.A02;
                Context context2 = igSimpleImageView2.getContext();
                if (A0S.size() > 3) {
                    int size = A0S.size() - 2;
                    ?? subList = A0S.subList(0, 2);
                    Spannable spannable = C6RB.A0d;
                    c6rb = new C6RB(context2, context2.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height));
                    c6rb.A0G(1, "");
                    c6rb.A0M(AnonymousClass001.A00('+', size));
                    c6rb.A0A(context2.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
                    c6rb.A0F(context2.getColor(AbstractC53242c7.A07(context2)));
                    c6rb.A0J(null, 1);
                    arrayList = subList;
                } else {
                    c6rb = null;
                    arrayList = A0S;
                }
                C14360o3.A0A(context2);
                igSimpleImageView2.setImageDrawable(AbstractC89513yr.A00(context2, c6rb, Float.valueOf(0.5f), C05F.A00, null, Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material)), null, null, interfaceC11380iw.getModuleName(), arrayList, context2.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height), false, false, false, true, false));
                return;
            }
            C218509lM c218509lM = (C218509lM) c9ut;
            InterfaceC11380iw interfaceC11380iw2 = this.A03;
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession2 = this.A04;
            User A01 = c08730cb.A01(userSession2);
            C14360o3.A0B(c218509lM, 0);
            IgTextView igTextView2 = c218509lM.A02;
            Context context3 = igTextView2.getContext();
            igTextView2.setText(context3.getString(2131963348));
            c218509lM.A00.A02();
            IgSimpleImageView igSimpleImageView3 = c218509lM.A01;
            Context context4 = igSimpleImageView3.getContext();
            C14360o3.A07(context4);
            String moduleName = interfaceC11380iw2.getModuleName();
            List singletonList = Collections.singletonList(A01);
            C14360o3.A07(singletonList);
            igSimpleImageView3.setImageDrawable(AbstractC89513yr.A04(context4, context3.getDrawable(R.drawable.instagram_add_pano_outline_16), Float.valueOf(0.5f), C05F.A00, null, 0, null, null, Integer.valueOf(context3.getColor(AbstractC53242c7.A07(context3))), null, moduleName, singletonList, context4.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height), false, false, false, true, false));
            C23031Ai A002 = AbstractC23021Ah.A00(userSession2);
            InterfaceC16530ry interfaceC16530ry = A002.A3U;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (((Boolean) interfaceC16530ry.CES(A002, c0yrArr[398])).booleanValue() || (A00 = AbstractC226669zO.A00(igTextView2.getRootView())) == null) {
                return;
            }
            igSimpleImageView3.postDelayed(new RunnableC24841Az1(context3, A00, userSession2, c218509lM), 1500L);
            interfaceC16530ry.Egi(A002, true, c0yrArr[398]);
            return;
        }
        List list = super.A00;
        if (this.A01) {
            i3 = i - (this.A06.size() + 1);
        } else if (A00()) {
            i3 = i - 1;
        }
        User user = (User) list.get(i3);
        C218529lO c218529lO = (C218529lO) c9ut;
        if (user.A2D() && super.A03.size() < 20) {
            z = false;
        }
        InterfaceC11380iw interfaceC11380iw3 = this.A03;
        C14360o3.A0B(c218529lO, 0);
        IgImageView igImageView = c218529lO.A01;
        Context context5 = igImageView.getContext();
        igImageView.setPlaceHolderColor(context5.getColor(R.color.grey_1));
        igImageView.setUrl(user.Bhu(), interfaceC11380iw3);
        TextView textView = c218529lO.A00;
        textView.setText(user.getUsername());
        c218529lO.A02 = user;
        c218529lO.A03.A02();
        if (z) {
            igImageView.setColorFilter(context5.getColor(R.color.black_50_transparent));
            i2 = R.color.bright_foreground_disabled_material_dark;
        } else {
            igImageView.clearColorFilter();
            i2 = R.color.design_dark_default_color_on_background;
        }
        textView.setTextColor(context5.getColor(i2));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C3OO c3oo) {
        C3PF c3pf;
        C9UT c9ut = (C9UT) c3oo;
        C14360o3.A0B(c9ut, 0);
        if (c9ut instanceof C218529lO) {
            c3pf = ((C218529lO) c9ut).A03;
        } else if (c9ut instanceof C218539lP) {
            c3pf = ((C218539lP) c9ut).A04;
        } else if (c9ut instanceof C218519lN) {
            c3pf = ((C218519lN) c9ut).A00;
        } else {
            c3pf = ((C218509lM) c9ut).A00;
        }
        c3pf.A02();
    }

    @Override // X.AbstractC190598cH
    public final void A01() {
        super.A01();
        this.A06.clear();
        this.A02 = false;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC190598cH
    public final void A03(List list) {
        super.A03(list);
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(349821768);
        int size = super.A00.size();
        if (this.A01) {
            i = this.A06.size() + 1;
        } else {
            i = 0;
        }
        int i2 = size + i + (A00() ? 1 : 0);
        C0f9.A0A(288144014, A03);
        return i2;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long A00;
        int A03 = C0f9.A03(-1779471878);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1 && itemViewType == 2) {
                A00 = this.A06.get(i - 1).hashCode();
            } else {
                A00 = 0;
            }
        } else {
            C8SI c8si = super.A02;
            List list = super.A00;
            if (this.A01) {
                i -= this.A06.size() + 1;
            } else if (A00()) {
                i--;
            }
            A00 = c8si.A00(((User) list.get(i)).getId());
        }
        C0f9.A0A(1467238564, A03);
        return A00;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(632641533);
        int i3 = 0;
        if (this.A01) {
            if (i == 0) {
                i3 = 1;
            } else if (1 <= i && i <= this.A06.size()) {
                i3 = 2;
            }
            i2 = -1755507586;
        } else if (A00()) {
            if (i == 0) {
                i3 = 3;
            }
            i2 = -1826740918;
        } else {
            i2 = -240674866;
        }
        C0f9.A0A(i2, A03);
        return i3;
    }
}
