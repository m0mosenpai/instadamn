package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ENW extends AbstractC60672pq implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37204GaF {
    public static final String __redex_internal_original_name = "BatchManageUserListFragment";
    public int A00;
    public TextView A01;
    public TextView A02;
    public FR5 A03;
    public C18A A04;
    public EQD A05;
    public String A06;
    public String A07;
    public ArrayList A08;
    public boolean A0A;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public HashMap A09 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return true;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        C14360o3.A0B(user, 0);
        EQD eqd = this.A05;
        if (eqd != null) {
            eqd.A00.A00 = false;
            this.A09.put(user, Boolean.valueOf(z));
            int i = this.A00;
            int i2 = i - 1;
            if (z) {
                i2 = i + 1;
            }
            this.A00 = i2;
            A01(this);
            return true;
        }
        C14360o3.A0F("selectableUserListAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131962718);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        interfaceC56362iU.Ehd(new C3LY(A0B));
        FrameLayout frameLayout = ((C56352iT) interfaceC56362iU).A0S;
        Context context = frameLayout.getContext();
        TextView A0N = AbstractC167007dF.A0N(LayoutInflater.from(context).inflate(R.layout.action_bar_button_text, (ViewGroup) frameLayout, false), R.id.action_bar_button_text);
        AbstractC166987dD.A1P(context, A0N, 2131973224);
        AbstractC166987dD.A1O(context, A0N, AbstractC31173DnH.A04(this));
        ViewOnClickListenerC35667Fp2.A00(A0N, 9, this);
        C3LO A0B2 = AbstractC31171DnF.A0B();
        A0B2.A0I = A0N;
        AbstractC31175DnJ.A1G(A0B2, interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView A03;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        String str2 = this.A07;
        if (str2 != null) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.header_text);
            A0T.setText(str2);
            A0T.setVisibility(0);
        }
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.negative_manage_button);
        C14360o3.A0B(A0T2, 0);
        this.A01 = A0T2;
        TextView A0T3 = AbstractC166997dE.A0T(view, R.id.positive_manage_button);
        C14360o3.A0B(A0T3, 0);
        this.A02 = A0T3;
        A00();
        AbstractC31174DnI.A15(A0D.getContext(), A0D);
        EQD eqd = this.A05;
        if (eqd != null) {
            A0D.setAdapter(eqd);
            EQD eqd2 = this.A05;
            if (eqd2 != null) {
                ArrayList arrayList = this.A08;
                if (arrayList != null) {
                    ArrayList arrayList2 = eqd2.A01;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    EQD.A00(eqd2);
                    String str3 = this.A06;
                    if (str3 != null) {
                        int hashCode = str3.hashCode();
                        if (hashCode != -1217778020) {
                            if (hashCode != -1067858906) {
                                if (hashCode == 494700669 && str3.equals("BATCH_MANAGE_FOLLOW_REQUESTS")) {
                                    ViewOnClickListenerC35667Fp2.A00(A04(), 11, this);
                                    A03 = A03();
                                    i = 12;
                                } else {
                                    return;
                                }
                            } else {
                                if (!str3.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                                    return;
                                }
                                ViewOnClickListenerC35667Fp2.A00(A04(), 13, this);
                                A03 = A03();
                                i = 14;
                            }
                        } else {
                            if (!str3.equals("BATCH_MANAGE_FOLLOWING")) {
                                return;
                            }
                            A04().setVisibility(8);
                            A03 = A03();
                            i = 10;
                        }
                        ViewOnClickListenerC35667Fp2.A00(A03, i, this);
                        return;
                    }
                    str = "batchManageGroup";
                } else {
                    str = "users";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "selectableUserListAdapter";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A00() {
        TextView A03;
        Resources A0N;
        int i;
        String string;
        Resources A0N2;
        int i2;
        int i3 = this.A00;
        String str = this.A06;
        if (str != null) {
            int hashCode = str.hashCode();
            if (i3 > 0) {
                if (hashCode != -1217778020) {
                    if (hashCode != -1067858906) {
                        if (hashCode == 494700669 && str.equals("BATCH_MANAGE_FOLLOW_REQUESTS")) {
                            A03().setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), Integer.valueOf(this.A00), 2131957728));
                            A03 = A04();
                            A0N2 = AbstractC166997dE.A0N(this);
                            i2 = 2131956585;
                        } else {
                            return;
                        }
                    } else {
                        if (!str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                            return;
                        }
                        A03().setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), Integer.valueOf(this.A00), 2131972333));
                        A03 = A04();
                        A0N2 = AbstractC166997dE.A0N(this);
                        i2 = 2131962683;
                    }
                } else {
                    if (!str.equals("BATCH_MANAGE_FOLLOWING")) {
                        return;
                    }
                    A03 = A03();
                    A0N2 = AbstractC166997dE.A0N(this);
                    i2 = 2131976086;
                }
                string = AbstractC166997dE.A0r(A0N2, Integer.valueOf(this.A00), i2);
            } else {
                if (hashCode != -1217778020) {
                    if (hashCode != -1067858906) {
                        if (hashCode != 494700669 || !str.equals("BATCH_MANAGE_FOLLOW_REQUESTS")) {
                            return;
                        }
                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A03(), 2131957640);
                        A03 = A04();
                        A0N = AbstractC166997dE.A0N(this);
                        i = 2131956564;
                    } else {
                        if (!str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                            return;
                        }
                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A03(), 2131972171);
                        A03 = A04();
                        A0N = AbstractC166997dE.A0N(this);
                        i = 2131962759;
                    }
                } else {
                    if (!str.equals("BATCH_MANAGE_FOLLOWING")) {
                        return;
                    }
                    A03 = A03();
                    A0N = AbstractC166997dE.A0N(this);
                    i = 2131976069;
                }
                string = A0N.getString(i);
            }
            A03.setText(string);
            return;
        }
        C14360o3.A0F("batchManageGroup");
        throw C00O.createAndThrow();
    }

    public static final void A01(ENW enw) {
        TextView A03;
        float f;
        int i = enw.A00;
        TextView A032 = enw.A03();
        if (i > 0) {
            A032.setEnabled(true);
            enw.A04().setEnabled(true);
            A03 = enw.A03();
            f = 1.0f;
        } else {
            A032.setEnabled(false);
            enw.A04().setEnabled(false);
            A03 = enw.A03();
            f = 0.35f;
        }
        A03.setAlpha(f);
        enw.A04().setAlpha(f);
        enw.A00();
    }

    public final TextView A03() {
        TextView textView = this.A01;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("negativeButton");
        throw C00O.createAndThrow();
    }

    public final TextView A04() {
        TextView textView = this.A02;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("positiveButton");
        throw C00O.createAndThrow();
    }

    public final FR5 A05() {
        FR5 fr5 = this.A03;
        if (fr5 != null) {
            return fr5;
        }
        C14360o3.A0F("batchManageFollowRequestsLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A06;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1217778020) {
                if (hashCode != -1067858906) {
                    if (hashCode == 494700669 && str.equals("BATCH_MANAGE_FOLLOW_REQUESTS")) {
                        return "batch_follow_requests";
                    }
                } else if (str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                    return "user_list_group_non_recip_followers";
                }
            } else if (str.equals("BATCH_MANAGE_FOLLOWING")) {
                return "batch_following";
            }
            throw new RuntimeException("Invalid entry type for BatchManageUserListFragment");
        }
        C14360o3.A0F("batchManageGroup");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    public static final void A02(ENW enw, boolean z) {
        String str;
        FollowStatus followStatus;
        ArrayList<String> A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = enw.A08;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                User A15 = AbstractC25226BEj.A15(it);
                if (AbstractC31177DnL.A1b(enw.A09.get(A15))) {
                    AbstractC31173DnH.A1X(A15, A1E);
                    String str2 = enw.A06;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1217778020) {
                            if (hashCode != -1067858906) {
                                if (hashCode == 494700669 && str2.equals("BATCH_MANAGE_FOLLOW_REQUESTS")) {
                                    UserSession A0r = AbstractC166987dD.A0r(enw.A0B);
                                    String id = A15.getId();
                                    if (z) {
                                        BIM.A00(enw, A0r, id, i);
                                    } else {
                                        BIM.A01(enw, A0r, id, i);
                                    }
                                }
                            } else if (str2.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                                if (z) {
                                    FR5 A05 = enw.A05();
                                    C19260xA c19260xA = new C19260xA();
                                    C19260xA.A00(c19260xA, Integer.valueOf(i), "position");
                                    if (A15.A0M() != C05F.A0C && A15.A0M() != C05F.A00) {
                                        if (A15.A25()) {
                                            followStatus = FollowStatus.A04;
                                        } else {
                                            followStatus = FollowStatus.A05;
                                        }
                                    } else {
                                        followStatus = FollowStatus.A07;
                                    }
                                    AbstractC129875tr.A01(c19260xA, A05.A02, null, null, null, null, EnumC33402EpZ.A06, A15, null, AbstractC37441GeL.A00(followStatus), null, null, null, null, A05.A00.getModuleName(), null, null);
                                } else {
                                    FR5 A052 = enw.A05();
                                    AbstractC31178DnM.A1L(A052.A01, "remove_follower_dialog_confirmed", A15.getId());
                                }
                            }
                        } else if (str2.equals("BATCH_MANAGE_FOLLOWING")) {
                            CKQ.A00(enw, AbstractC166987dD.A0r(enw.A0B), A15);
                        }
                    } else {
                        str = "batchManageGroup";
                    }
                }
                i = i2;
            }
            Intent A04 = AbstractC31171DnF.A04();
            A04.putExtra(AbstractC111324zv.A00(284), z);
            A04.putStringArrayListExtra("ARG_USER_IDS", A1E);
            AbstractC31176DnK.A18(A04, enw);
            AbstractC25227BEk.A1B(enw);
            return;
        }
        str = "users";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A05().A01("cancel", null);
        return false;
    }

    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        Boolean bool;
        Boolean bool2;
        String str;
        Boolean bool3;
        String str2;
        int A02 = C0f9.A02(152848720);
        InterfaceC09390do interfaceC09390do = this.A0B;
        C18A A0h = AbstractC31176DnK.A0h(interfaceC09390do);
        C14360o3.A0B(A0h, 0);
        this.A04 = A0h;
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            arrayList = bundle2.getStringArrayList(MSV.A00(307));
        } else {
            arrayList = null;
        }
        C14360o3.A0C(arrayList, MSV.A00(114));
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            bool = AbstractC31174DnI.A0n(bundle3, MSV.A00(312));
        } else {
            bool = null;
        }
        String A00 = AbstractC111324zv.A00(11);
        C14360o3.A0C(bool, A00);
        boolean booleanValue = bool.booleanValue();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bool2 = AbstractC31174DnI.A0n(bundle4, "ARG_IS_FACEPILE_ENABLED");
        } else {
            bool2 = null;
        }
        C14360o3.A0C(bool2, A00);
        boolean booleanValue2 = bool2.booleanValue();
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str = bundle5.getString(MSV.A00(306));
        } else {
            str = null;
        }
        AbstractC25225BEi.A1S(str);
        C14360o3.A0B(str, 0);
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            bool3 = AbstractC31174DnI.A0n(bundle6, MSV.A00(678));
        } else {
            bool3 = null;
        }
        C14360o3.A0C(bool3, A00);
        this.A0A = bool3.booleanValue();
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str3 = bundle7.getString("ARG_HEADER_TEXT");
        }
        this.A07 = str3;
        Context requireContext = requireContext();
        String str4 = this.A06;
        if (str4 != null) {
            this.A05 = new EQD(requireContext, this, null, this, str4, booleanValue, booleanValue2, true);
            this.A08 = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(arrayList);
            while (A13.hasNext()) {
                String str5 = (String) AbstractC166997dE.A0l(A13);
                C18A c18a = this.A04;
                if (c18a != null) {
                    User A022 = c18a.A02(str5);
                    if (A022 != null) {
                        ArrayList arrayList2 = this.A08;
                        if (arrayList2 != null) {
                            arrayList2.add(A022);
                        } else {
                            str2 = "users";
                        }
                    }
                } else {
                    str2 = "userCache";
                }
            }
            this.A03 = new FR5(this, AbstractC166987dD.A0r(interfaceC09390do));
            super.onCreate(bundle);
            C0f9.A09(916558798, A02);
            return;
        }
        str2 = "batchManageGroup";
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-67097572);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.batch_manage_follow_requests_fragment, false);
        C0f9.A09(2100602898, A02);
        return A0R;
    }
}
