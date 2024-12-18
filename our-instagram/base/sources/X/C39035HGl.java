package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.HGl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39035HGl extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ImageView.ScaleType scaleType;
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) view;
        ImageView imageView = (ImageView) simpleZoomableViewContainer.getChildAt(0);
        String A0G = c102884kP.A0G();
        String A0E = c102884kP.A0E();
        if (A0E == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            try {
                scaleType = C6BE.A0A(A0E);
            } catch (C41M e) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
                AbstractC25241Le.A03("BKBloksComponentsZoomableImageBinderUtil", e);
            }
        }
        AbstractC131765xC.A00(null, scaleType, imageView, c6fg, c102884kP, null, A0G, false);
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = new ViewOnTouchListenerC676833i(simpleZoomableViewContainer, false);
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(imageView.getContext());
        imageView.setOnTouchListener(new ViewOnTouchListenerC70251WNw(0, this, scaleGestureDetectorOnScaleGestureListenerC81153jk));
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(new J12(imageView, this, simpleZoomableViewContainer, viewOnTouchListenerC676833i));
        viewOnTouchListenerC676833i.start();
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        AbstractC131765xC.A01((ImageView) ((ViewGroup) view).getChildAt(0));
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        SimpleZoomableViewContainer simpleZoomableViewContainer = new SimpleZoomableViewContainer(context);
        simpleZoomableViewContainer.addView(new ImageView(context));
        return simpleZoomableViewContainer;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C39035HGl(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
