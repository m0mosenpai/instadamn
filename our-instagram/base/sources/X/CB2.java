package X;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes5.dex */
public abstract class CB2 {
    public static final void A00(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC16960so.A1Q(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        Class[] clsArr = {SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class};
        C14360o3.A0B(clsArr, 0);
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC009903n.A0K(clsArr));
    }
}
