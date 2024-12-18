package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class EKQ extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectChallengeCreationBlockedFragment";
    public C2EC A00;
    public DirectThreadKey A01;
    public final InterfaceC60122ou A03 = C35892FtC.A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Object obj;
        ImmutableList of;
        String str;
        KT2 kt2;
        C9CP c9cp;
        String str2;
        Long l;
        Long l2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(ViewOnClickListenerC35691FpR.A00(this, 1), AbstractC31176DnK.A0C(view, R.id.direct_challenge_action_bar)).A0X(this.A03);
        InterfaceC09390do interfaceC09390do = this.A02;
        C49124Lo3 c49124Lo3 = new C49124Lo3(this, AbstractC166987dD.A0r(interfaceC09390do), null, null, null, null, null, null, null);
        C44781Js2 c44781Js2 = new C44781Js2(view);
        AnonymousClass988 A0A = AbstractC31181DnP.A0A(interfaceC09390do);
        Context requireContext = requireContext();
        Integer num = C05F.A00;
        C2EC c2ec = this.A00;
        String str3 = "thread";
        if (c2ec != null) {
            C7IM A01 = C7ID.A00.A01(requireContext, A0A, c2ec.C72(), num);
            C2EY c2ey = C2EY.A0z;
            List list = null;
            C7QL c7ql = new C7QL(A0A, A01, c2ey, AbstractC09440dt.A01(C37024GTg.A00), false, false, false, false, false, false);
            C7QX c7qx = new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C7P3.A0S, C2EY.A1i, new MessageIdentifier("fakeMessageId", null), null, null, System.currentTimeMillis(), false, false, false, true, false);
            C2EC c2ec2 = this.A00;
            if (c2ec2 != null) {
                E6W e6w = ((C81663kb) c2ec2).A01.A12;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (e6w != null && (l2 = e6w.A01) != null) {
                    j = l2.longValue();
                } else {
                    j = 0;
                }
                long millis = timeUnit.toMillis(j);
                DirectThreadKey directThreadKey = this.A01;
                str3 = "threadKey";
                if (directThreadKey != null) {
                    String str4 = directThreadKey.A00;
                    if (e6w != null && millis > System.currentTimeMillis()) {
                        kt2 = new KT2(null, c7qx, c7ql, null, Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24), Long.valueOf(millis), e6w.A05, getString(2131973639), null, getString(2131954946), e6w.A04, AbstractC167017dG.A0k(AbstractC166997dE.A0N(this), AbstractC167017dG.A0K(e6w.A00), R.plurals.challenges_blocked_submission_count), null);
                    } else {
                        if (str4 == null || (obj = ((C36270FzN) AbstractC25230BEn.A0k(interfaceC09390do, 0).A01(C36270FzN.class, C37039GTv.A00)).A00.get(str4)) == null) {
                            return;
                        }
                        C2DS A0O = AbstractC31180DnO.A0O(interfaceC09390do);
                        DirectThreadKey directThreadKey2 = this.A01;
                        if (directThreadKey2 != null) {
                            ArrayList Ab7 = A0O.Ab7(directThreadKey2, true);
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator it = Ab7.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                C83403nh c83403nh = (C83403nh) next;
                                ImmutableList A0H = c83403nh.A0H();
                                if (c83403nh.A10 == c2ey && A0H != null && !A0H.isEmpty()) {
                                    C910143t c910143t = (C910143t) AbstractC001800i.A0J(A0H);
                                    if (c910143t != null && (l = c910143t.A0o) != null) {
                                        str2 = l.toString();
                                    } else {
                                        str2 = null;
                                    }
                                    if (C14360o3.A0K(str2, obj)) {
                                        A1E.add(next);
                                    }
                                }
                            }
                            if (!AbstractC166987dD.A1b(A1E)) {
                                return;
                            }
                            C83403nh c83403nh2 = (C83403nh) AbstractC001800i.A0J(A1E);
                            if (c83403nh2 == null || (of = c83403nh2.A0H()) == null) {
                                of = ImmutableList.of();
                                C14360o3.A07(of);
                            }
                            if (of.size() != 2) {
                                return;
                            }
                            C910143t c910143t2 = (C910143t) AbstractC001800i.A0O(of, 0);
                            C910143t c910143t3 = (C910143t) AbstractC001800i.A0O(of, 1);
                            if (c910143t2 == null || c910143t3 == null) {
                                return;
                            }
                            Long l3 = c910143t2.A0p;
                            String str5 = c910143t2.A1Q;
                            ImmutableList A012 = c910143t2.A01();
                            if (A012 != null && (c9cp = (C9CP) A012.get(0)) != null) {
                                str = c9cp.A04;
                            } else {
                                str = null;
                            }
                            ImmutableList A013 = c910143t2.A01();
                            if (A013 != null) {
                                A013.get(0);
                            }
                            String str6 = c910143t2.A0w;
                            Integer valueOf = Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24);
                            String str7 = c910143t3.A13;
                            String str8 = c910143t3.A1Q;
                            String str9 = c910143t3.A0v;
                            C51755Mte c51755Mte = c910143t3.A0M;
                            if (c51755Mte != null) {
                                list = (List) c51755Mte.A00;
                            }
                            kt2 = new KT2(null, c7qx, c7ql, null, valueOf, l3, str5, str, str6, str7, str8, str9, list);
                        }
                    }
                    c49124Lo3.ADy(kt2, c44781Js2);
                    return;
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        DirectThreadKey directThreadKey;
        int A02 = C0f9.A02(-1388701455);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (directThreadKey = (DirectThreadKey) bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY)) != null) {
            this.A01 = directThreadKey;
            C2DS A0O = AbstractC31180DnO.A0O(this.A02);
            DirectThreadKey directThreadKey2 = this.A01;
            if (directThreadKey2 == null) {
                C14360o3.A0F("threadKey");
                throw C00O.createAndThrow();
            }
            C81663kb A03 = C2DU.A03((C2DU) A0O, directThreadKey2);
            if (A03 == null) {
                i = 1994210932;
            } else {
                this.A00 = A03;
                i = 1585724999;
            }
        } else {
            i = 1694663851;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-911181974);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_challenges_creation_blocked, false);
        C0f9.A09(-1926859350, A02);
        return A0R;
    }
}
