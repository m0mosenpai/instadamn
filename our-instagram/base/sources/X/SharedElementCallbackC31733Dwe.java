package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dwe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedElementCallbackC31733Dwe extends SharedElementCallback {
    public final C5GL A00;

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        throw AbstractC166987dD.A15("onCaptureSharedElementSnapshot");
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        throw AbstractC166987dD.A15("onCreateSnapshotView");
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        throw AbstractC166987dD.A15("onMapSharedElements");
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list) {
        throw AbstractC166987dD.A15("onRejectSharedElements");
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        throw AbstractC166987dD.A15("onSharedElementEnd");
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        throw AbstractC166987dD.A15("onSharedElementStart");
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        throw AbstractC166987dD.A15("onSharedElementsArrived");
    }

    public SharedElementCallbackC31733Dwe(C5GL c5gl) {
        this.A00 = c5gl;
    }
}
