package X;

import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class G0V implements InterfaceC13380mO {
    public final int A00;
    public final Object A01;

    public G0V(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        User user;
        FragmentActivity activity;
        AtomicBoolean atomicBoolean;
        Context requireContext;
        int i;
        Object[] objArr;
        Object valueOf;
        String string;
        switch (this.A00) {
            case 0:
                Pair pair = (Pair) obj;
                C14360o3.A0B(pair, 0);
                FQW fqw = (FQW) this.A01;
                Number number = (Number) pair.first;
                Number number2 = (Number) pair.second;
                int intValue = number.intValue();
                if (intValue >= fqw.A00 && number2.intValue() <= fqw.A01) {
                    return;
                }
                C14360o3.A0A(number2);
                int intValue2 = number2.intValue();
                if (intValue <= intValue2) {
                    while (true) {
                        if (intValue < fqw.A00 || intValue > fqw.A01) {
                            SuggestBusinessFragment suggestBusinessFragment = fqw.A05;
                            if (intValue >= 0 && suggestBusinessFragment.A01 != null) {
                                C67919V2j c67919V2j = suggestBusinessFragment.A00;
                                c67919V2j.getClass();
                                VJF vjf = (VJF) c67919V2j.getItem(intValue);
                                if (vjf != null && (user = vjf.A01) != null) {
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    A1G.put("target_id", user.getId());
                                    A1G.put("index", String.valueOf(intValue - 1));
                                    suggestBusinessFragment.A01.CmQ(new Y7A("pro_account_suggestions", suggestBusinessFragment.A05, "suggested_pro_account", null, null, null, A1G, null));
                                }
                            }
                        }
                        if (intValue != intValue2) {
                            intValue++;
                        }
                    }
                }
                fqw.A00 = number.intValue();
                fqw.A01 = intValue2;
                return;
            case 1:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                if (shareLaterFragment.mView == null || (activity = shareLaterFragment.getActivity()) == null || !shareLaterFragment.isAdded() || shareLaterFragment.mRemoving || shareLaterFragment.mDetached) {
                    return;
                }
                C14360o3.A0A(activity);
                if (activity.isFinishing() || (atomicBoolean = shareLaterFragment.A09) == null || atomicBoolean.getAndSet(true)) {
                    return;
                }
                C13400mQ c13400mQ = shareLaterFragment.A01;
                if (c13400mQ != null) {
                    c13400mQ.A00();
                    C56352iT.A0t.A03(shareLaterFragment.requireActivity()).setIsLoading(false);
                    C14360o3.A0A(shareLaterFragment.A04);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C0w9.A03("configure_share_media", "XPosting Configure Targets are not set up correctly");
                    if (A1E.size() < 1) {
                        string = shareLaterFragment.requireContext().getString(2131972429);
                    } else {
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            UserSession userSession = shareLaterFragment.A00;
                            if (userSession == null) {
                                AbstractC31171DnF.A0y();
                                throw C00O.createAndThrow();
                            }
                            HashSet A02 = C84613qA.A00(userSession).A02();
                            InterfaceC02900Bo A00 = C0BQ.A00(userSession);
                            String str = userSession.userId;
                            C14360o3.A0B(str, 0);
                            List A04 = ((C17110t6) A00).A02.A04(str);
                            ArrayList A1E3 = AbstractC166987dD.A1E();
                            for (Object obj2 : A04) {
                                if (obj2 != null) {
                                    A1E3.add(obj2);
                                }
                            }
                            ArrayList A1E4 = AbstractC166987dD.A1E();
                            Iterator it2 = A1E3.iterator();
                            while (it2.hasNext()) {
                                User A15 = AbstractC25226BEj.A15(it2);
                                if (!A02.contains(A15.getId())) {
                                    A1E4.add(A15);
                                }
                            }
                            Iterator it3 = A1E4.iterator();
                            while (it3.hasNext()) {
                                User A152 = AbstractC25226BEj.A15(it3);
                                if (AbstractC31174DnI.A1Y(A152, next)) {
                                    A1E2.add(A152.getUsername());
                                }
                            }
                        }
                        if (A1E2.size() == 1) {
                            requireContext = shareLaterFragment.requireContext();
                            i = 2131973874;
                            objArr = new Object[]{A1E2.get(0)};
                        } else if (A1E2.size() == 2) {
                            requireContext = shareLaterFragment.requireContext();
                            i = 2131973877;
                            objArr = new Object[]{A1E2.get(0), A1E2.get(1)};
                        } else {
                            if (A1E2.size() == 3) {
                                requireContext = shareLaterFragment.requireContext();
                                i = 2131973875;
                                objArr = new Object[3];
                                objArr[0] = A1E2.get(0);
                                objArr[1] = A1E2.get(1);
                                valueOf = A1E2.get(2);
                            } else {
                                int size = A1E2.size() - 2;
                                requireContext = shareLaterFragment.requireContext();
                                i = 2131973873;
                                objArr = new Object[3];
                                objArr[0] = A1E2.get(0);
                                objArr[1] = A1E2.get(1);
                                valueOf = Integer.valueOf(size);
                            }
                            objArr[2] = valueOf;
                        }
                        string = requireContext.getString(i, objArr);
                        C14360o3.A0A(string);
                    }
                    C14360o3.A0A(string);
                    C193328hC A0O = AbstractC31175DnJ.A0O(shareLaterFragment);
                    A0O.A0A(2131973876);
                    A0O.A0r(string);
                    AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35395FjA.A00, A0O);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C32372ENy c32372ENy = (C32372ENy) this.A01;
                String str2 = (String) obj;
                InterfaceC37194Ga5 interfaceC37194Ga5 = c32372ENy.A04;
                if (interfaceC37194Ga5 != null && !str2.isEmpty()) {
                    interfaceC37194Ga5.EJs(str2);
                    c32372ENy.A0E.clear();
                    ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                    c32372ENy.A02 = A0E;
                    c32372ENy.A01.A05(A0E);
                    AbstractC31557Dth.A01(c32372ENy, true);
                    AbstractC31178DnM.A1Q(c32372ENy);
                    return;
                }
                return;
        }
    }
}
