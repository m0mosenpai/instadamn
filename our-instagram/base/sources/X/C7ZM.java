package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

/* renamed from: X.7ZM, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C7ZM {
    void Cws();

    void D81(Bundle bundle, C7U1 c7u1);

    void D8T(C7U0 c7u0);

    void D8i();

    void E0V(View view, RecyclerView recyclerView, C7U0 c7u0, MessageListLayoutManager messageListLayoutManager);

    void onDestroy();

    void onDestroyView();

    void onPause();

    void onResume();

    void onStop();
}
