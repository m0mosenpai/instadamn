package X;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.7VL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VL extends C7VI implements InterfaceC65626Tpm, C7VM {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public C66362zD A05;
    public InterfaceC56392iX A06;
    public IgdsButton A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public IgdsButton A0A;
    public final AbstractC59962oe A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;
    public final InterfaceC16660sJ A0F;
    public final InterfaceC16660sJ A0G;
    public final InterfaceC09390do A0H;

    @Override // X.C7VM
    public final void D6n(C7DC c7dc) {
        C14360o3.A0B(c7dc, 0);
        A00(this).updateThread(c7dc);
    }

    @Override // X.C7VM
    public final void DAP(C7IM c7im) {
        C14360o3.A0B(c7im, 0);
        A00(this).updateTheme(c7im);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final CreatorAgentSuggestedRepliesViewModel A00(C7VL c7vl) {
        return (CreatorAgentSuggestedRepliesViewModel) c7vl.A0H.getValue();
    }

    public static final void A01(C7VL c7vl) {
        String str;
        IgdsButton igdsButton = c7vl.A08;
        if (igdsButton == null) {
            str = "edit";
        } else {
            igdsButton.setVisibility(8);
            IgdsButton igdsButton2 = c7vl.A0A;
            if (igdsButton2 == null) {
                str = "send";
            } else {
                igdsButton2.setVisibility(8);
                IgdsButton igdsButton3 = c7vl.A09;
                if (igdsButton3 == null) {
                    str = "refresh";
                } else {
                    igdsButton3.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C7VM
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 108) {
            A00(this).checkIfNuxAccepted();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        InterfaceC16820sZ interfaceC16820sZ = this.A0D;
        C3I9 c3i9 = (C3I9) interfaceC16820sZ.invoke();
        if (c3i9 != null) {
            c3i9.EFx((InterfaceC60152ox) this.A0C.getValue());
        }
        C3I9 c3i92 = (C3I9) interfaceC16820sZ.invoke();
        if (c3i92 != null) {
            c3i92.onDestroy();
        }
        A00(this).updateThread(null);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C3I9 c3i9 = (C3I9) this.A0D.invoke();
        if (c3i9 != null) {
            c3i9.onStop();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C3I9 c3i9 = (C3I9) this.A0D.invoke();
        if (c3i9 != null) {
            c3i9.Dnr(this.A0B.requireActivity());
        }
    }

    public C7VL(AbstractC59962oe abstractC59962oe, C7VG c7vg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(c7vg);
        this.A0B = abstractC59962oe;
        this.A0D = interfaceC16820sZ;
        this.A0F = interfaceC16660sJ;
        this.A0G = interfaceC16660sJ2;
        this.A0E = interfaceC16820sZ2;
        this.A0H = new C60842q8(new C206959Ea(this, 20), new C206959Ea(c7vg, 21), C149636oG.A00, new C0YZ(CreatorAgentSuggestedRepliesViewModel.class));
        this.A0C = C1XM.A00(new C206959Ea(this, 19));
    }
}
