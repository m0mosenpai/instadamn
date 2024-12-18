package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* renamed from: X.Okp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55496Okp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public ViewTreeObserverOnGlobalLayoutListenerC55496Okp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK;
        int indexOf;
        String str;
        View childAt;
        Runnable pqm;
        switch (this.A00) {
            case 0:
                C52171N7a c52171N7a = (C52171N7a) this.A01;
                AbstractC166997dE.A1K(c52171N7a.getRecyclerView(), this);
                C3M4 A05 = C1OU.A05(c52171N7a.requireActivity());
                if (A05 == null) {
                    return;
                }
                GAJ gaj = c52171N7a.A01;
                if (gaj == null) {
                    str = "delegate";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A05.A0X(null, gaj.A00, c52171N7a, new P8V(1));
                return;
            case 1:
                C56206OxF c56206OxF = (C56206OxF) this.A01;
                RecyclerView recyclerView = c56206OxF.A04;
                AbstractC166997dE.A1K(recyclerView, this);
                int A1c = AbstractC31177DnL.A0J(recyclerView).A1c();
                c56206OxF.A00 = A1c;
                C51202Mjm c51202Mjm = c56206OxF.A01;
                if (c51202Mjm == null) {
                    return;
                }
                c51202Mjm.A00.A01 = A1c;
                return;
            case 2:
                AlbumEditFragment albumEditFragment = (AlbumEditFragment) this.A01;
                RecyclerView recyclerView2 = albumEditFragment.A0A;
                str = "audioList";
                if (recyclerView2 != null) {
                    AbstractC166997dE.A1K(recyclerView2, this);
                    RecyclerView recyclerView3 = albumEditFragment.A0A;
                    if (recyclerView3 != null) {
                        childAt = recyclerView3.getChildAt(1);
                        if (childAt == null || AbstractC167007dF.A1Z(albumEditFragment.A0e)) {
                            return;
                        }
                        C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(albumEditFragment.A0d));
                        if (AbstractC167017dG.A1b(A00, A00.A47, C23031Ai.A8c, 481)) {
                            return;
                        }
                        pqm = new PQF(childAt, albumEditFragment);
                        childAt.postDelayed(pqm, 1000L);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C50724MaP c50724MaP = (C50724MaP) this.A01;
                RecyclerView recyclerView4 = c50724MaP.A08;
                str = "audioList";
                if (recyclerView4 != null) {
                    AbstractC166997dE.A1K(recyclerView4, this);
                    RecyclerView recyclerView5 = c50724MaP.A08;
                    if (recyclerView5 != null) {
                        childAt = recyclerView5.getChildAt(1);
                        if (childAt == null) {
                            return;
                        }
                        C23031Ai A002 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(c50724MaP.A0i));
                        if (AbstractC167017dG.A1b(A002, A002.A47, C23031Ai.A8c, 481)) {
                            return;
                        }
                        pqm = new PQM(childAt, c50724MaP);
                        childAt.postDelayed(pqm, 1000L);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                C50724MaP c50724MaP2 = (C50724MaP) this.A01;
                ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK2 = c50724MaP2.A0A;
                if (viewOnClickListenerC44797JsK2 != null) {
                    MSZ.A15(viewOnClickListenerC44797JsK2, this);
                }
                if (C2J9.A02(AbstractC166987dD.A0r(c50724MaP2.A0i))) {
                    InterfaceC50490MQs interfaceC50490MQs = C50724MaP.A01(c50724MaP2).A01;
                    if (interfaceC50490MQs == null || (viewOnClickListenerC44797JsK = c50724MaP2.A0A) == null || (indexOf = viewOnClickListenerC44797JsK.A03.indexOf(interfaceC50490MQs)) <= -1) {
                        return;
                    }
                    viewOnClickListenerC44797JsK.A1H(indexOf);
                    return;
                }
                ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK3 = c50724MaP2.A0A;
                if (viewOnClickListenerC44797JsK3 == null) {
                    return;
                }
                viewOnClickListenerC44797JsK3.A1H(0);
                return;
            default:
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                if (followersShareFragment.mViewHolder != null) {
                    FollowersShareFragment.A0L(followersShareFragment, true);
                    AbstractC166997dE.A1K(followersShareFragment.A0S().A03, this);
                    return;
                }
                return;
        }
    }
}
