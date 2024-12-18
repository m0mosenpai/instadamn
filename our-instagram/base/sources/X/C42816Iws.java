package X;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Iws, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42816Iws implements JIB {
    public final /* synthetic */ C38288GsX A00;

    @Override // X.JIB
    public final void AOc() {
    }

    @Override // X.JIB
    public final void EHQ() {
    }

    public C42816Iws(C38288GsX c38288GsX) {
        this.A00 = c38288GsX;
    }

    @Override // X.JIB
    public final SavedCollection Ap1() {
        SavedCollection savedCollection = this.A00.A0C;
        if (savedCollection == null) {
            C14360o3.A0F("collection");
            throw C00O.createAndThrow();
        }
        return savedCollection;
    }

    @Override // X.JIB
    public final void CJ6() {
        HHH A0B = this.A00.A0B();
        INJ inj = A0B.A01;
        if (inj != null) {
            A0B.A02 = true;
            inj.A00.setVisibility(0);
            C41130IIv c41130IIv = A0B.A09;
            IgTextView igTextView = c41130IIv.A01;
            if (igTextView != null && igTextView.getVisibility() == 0) {
                AbstractC167007dF.A0x(c41130IIv.A01);
                IgTextView igTextView2 = c41130IIv.A01;
                if (igTextView2 != null) {
                    igTextView2.clearAnimation();
                }
                IgTextView igTextView3 = c41130IIv.A01;
                if (igTextView3 != null) {
                    C40982IDd c40982IDd = c41130IIv.A04;
                    AnimationSet animationSet = new AnimationSet(true);
                    c40982IDd.A00 = animationSet;
                    animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                    c40982IDd.A00.addAnimation(new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f));
                    c40982IDd.A00.setDuration(200L);
                    igTextView3.startAnimation(c40982IDd.A00);
                }
            }
            A0B.A01.A02(false);
            HHH.A00(A0B);
            A0B.A01();
        }
    }

    @Override // X.JIB
    public final boolean CL7() {
        return this.A00.A0A().A0A();
    }

    @Override // X.JIB
    public final void CJ0() {
        String str;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(AbstractC111324zv.A00(687), EnumC39551HdN.A03);
        C38288GsX c38288GsX = this.A00;
        SavedCollection savedCollection = c38288GsX.A0C;
        if (savedCollection == null) {
            str = "collection";
        } else {
            A0b.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
            UserSession userSession = c38288GsX.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                AbstractC31171DnF.A0L(c38288GsX.requireActivity(), A0b, userSession, ModalActivity.class, "saved_feed").A0C(c38288GsX.requireContext());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIB
    public final void CJ1() {
        String str;
        FB6.A00();
        C38288GsX c38288GsX = this.A00;
        SavedCollection savedCollection = c38288GsX.A0C;
        if (savedCollection == null) {
            str = "collection";
        } else {
            boolean A0A = c38288GsX.A0A().A0A();
            ELY ely = new ELY();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable(AbstractC111324zv.A00(4124), savedCollection);
            A0b.putBoolean(AbstractC111324zv.A00(362), A0A);
            ely.setArguments(A0b);
            FragmentActivity requireActivity = c38288GsX.requireActivity();
            UserSession userSession = c38288GsX.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
                A0r.A0D(ely);
                A0r.A04();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
