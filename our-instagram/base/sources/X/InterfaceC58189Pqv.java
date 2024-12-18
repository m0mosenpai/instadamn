package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Pqv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC58189Pqv {
    View Aa0(Context context);

    boolean CJr(View view, MotionEvent motionEvent);

    boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter);

    boolean COQ(C44428Jkf c44428Jkf, FilterGroupModel filterGroupModel);

    void Cvt(boolean z);

    boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel);

    String getTitle();

    void onPause();

    void onResume();
}
