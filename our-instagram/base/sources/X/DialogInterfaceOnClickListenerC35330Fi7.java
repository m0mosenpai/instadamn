package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.Fi7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35330Fi7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC12990ll A01;

    public DialogInterfaceOnClickListenerC35330Fi7(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
        this.A00 = fragmentActivity;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1P1, X.EjB, X.EUj] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC12990ll abstractC12990ll = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(abstractC12990ll);
        A0c.A0B("security_checkup/start/");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, EDB.class, C34866FYb.class);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity);
        C14360o3.A0C(fragmentActivity, AbstractC58317Pt9.A00(7));
        IgFragmentActivity igFragmentActivity = (IgFragmentActivity) fragmentActivity;
        AbstractC167027dH.A13(A0D, igFragmentActivity, abstractC12990ll);
        ?? abstractC32533EUj = new AbstractC32533EUj(A0D);
        abstractC32533EUj.A00 = A0D;
        abstractC32533EUj.A01 = igFragmentActivity;
        abstractC32533EUj.A02 = abstractC12990ll;
        A0e.A00 = abstractC32533EUj;
        C1GJ.A03(A0e);
    }
}
