package X;

import android.app.Activity;
import android.graphics.RectF;
import android.widget.BaseAdapter;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.model.reels.Reel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.IwS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42790IwS implements InterfaceC63982vJ {
    public final int A00;
    public final Object A01;

    public C42790IwS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Activity activity, RectF rectF, C38E c38e, Object obj, int i) {
        c38e.A05 = new C31559Dtj(activity, rectF, new C42790IwS(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        BaseAdapter baseAdapter;
        int i;
        switch (this.A00) {
            case 0:
                C38976HEe c38976HEe = ((C38925HBx) this.A01).A01;
                if (c38976HEe != null) {
                    c38976HEe.notifyDataSetChanged();
                    return;
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 1:
                baseAdapter = ((GenericSurveyFragment) this.A01).A05;
                if (baseAdapter != null) {
                    i = 421440318;
                    C0fA.A00(baseAdapter, i);
                    return;
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 2:
            case 3:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return;
                }
                return;
            case 4:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                if (!reelDashboardFragment.isAdded()) {
                    return;
                }
                baseAdapter = reelDashboardFragment.mListAdapter;
                i = -1833318706;
                C0fA.A00(baseAdapter, i);
                return;
            case 5:
                baseAdapter = ((HDC) this.A01).A05;
                if (baseAdapter != null) {
                    i = 776050553;
                    C0fA.A00(baseAdapter, i);
                    return;
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 6:
                baseAdapter = ((HDE) this.A01).A06;
                if (baseAdapter != null) {
                    i = -200687730;
                    C0fA.A00(baseAdapter, i);
                    return;
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 7:
                baseAdapter = ((HDD) this.A01).A06;
                if (baseAdapter != null) {
                    i = -56017134;
                    C0fA.A00(baseAdapter, i);
                    return;
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 8:
                baseAdapter = ((HDB) this.A01).A00;
                i = 836368774;
                C0fA.A00(baseAdapter, i);
                return;
        }
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }
}
