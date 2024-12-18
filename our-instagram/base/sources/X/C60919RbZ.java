package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.RbZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60919RbZ extends AbstractC65806TuP {
    public final /* synthetic */ C102884kP A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60919RbZ(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        super(c6fg, c102884kP);
        this.A00 = c102884kP2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RrU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Q1e, android.content.BroadcastReceiver] */
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        SUT.A01 = (Q5A) view;
        ?? broadcastReceiver = new BroadcastReceiver();
        Context context = c6fg.A00;
        C0DJ.A03(broadcastReceiver, context, new IntentFilter("crop_action_crop_completed"), false);
        broadcastReceiver.A00 = new Object();
        C63181Seg.A06.A04 = c102884kP.A0U(false);
        SUT.A01(context, "LOAD_PROPIC_FOR_PREVIEW");
        SUT.A01(context, "LOAD_FRAME");
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C63181Seg c63181Seg = C63181Seg.A06;
        c63181Seg.A00 = null;
        c63181Seg.A01 = null;
        ((ImageView) view).setImageBitmap(null);
        SUT.A00 = null;
        AbstractC63326Sha.A00 = 0;
        AbstractC63326Sha.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.ImageView, X.Q5A, java.lang.Object] */
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        float f = Q5A.A01;
        int A03 = this.A00.A03(54, 280);
        ?? imageView = new ImageView(context);
        imageView.A00 = AbstractC61775RtV.A00(280);
        imageView.A00 = AbstractC61775RtV.A00(A03);
        return imageView;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
