package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Z9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Z9 extends BroadcastReceiver {
    public final AbstractC59962oe A00;
    public final Map A01 = AbstractC06930Yk.A06(new C09530e4(C7ZA.A00, new AtomicReference()), new C09530e4(C7ZA.A01, new AtomicReference()), new C09530e4(C7ZA.A02, new AtomicReference()), new C09530e4(C7ZA.A03, new AtomicReference()), new C09530e4(C7ZA.A04, new AtomicReference()), new C09530e4(C7ZA.A05, new AtomicReference()), new C09530e4(C7ZA.A06, new AtomicReference()), new C09530e4(C7ZA.A07, new AtomicReference()));

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    public static final void A00(C3LX c3lx, C7Z9 c7z9, InterfaceC16660sJ interfaceC16660sJ) {
        ?? obj = new Object();
        C58632mM c58632mM = C58632mM.A00;
        Object obj2 = c7z9.A01.get(c3lx);
        if (obj2 != null) {
            File A02 = c58632mM.A02(c3lx, new C48127LSc(interfaceC16660sJ, obj), (AtomicReference) obj2);
            if (A02 != null) {
                interfaceC16660sJ.invoke(A02);
                obj.A00 = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7Z9(AbstractC59962oe abstractC59962oe) {
        this.A00 = abstractC59962oe;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        View view;
        View findViewById;
        ViewStub viewStub;
        RecyclerView recyclerView;
        View findViewById2;
        int A01 = C0f9.A01(1404814151);
        C0fM.A01(this, context, intent);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        AbstractC59962oe abstractC59962oe = this.A00;
        FragmentActivity activity = abstractC59962oe.getActivity();
        Object obj = null;
        if (activity != null && (findViewById2 = activity.findViewById(R.id.thread_toggle_child_fragment_container)) != null) {
            obj = findViewById2.getParent();
        }
        if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
            FragmentActivity activity2 = abstractC59962oe.getActivity();
            if (activity2 != null && (findViewById = activity2.findViewById(R.id.direct_debug_options)) != null) {
                if ((findViewById instanceof ViewStub) && (viewStub = (ViewStub) findViewById) != null && viewStub.getVisibility() != 0) {
                    View inflate = viewStub.inflate();
                    if ((inflate instanceof RecyclerView) && (recyclerView = (RecyclerView) inflate) != null) {
                        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
                        recyclerView.setAdapter(new C44554Jna(AbstractC16960so.A1Q(new C47558KzT("text", new C50249MHe(this, 38)), new C47558KzT("photo", new C50249MHe(this, 37)), new C47558KzT("close", new C50249MHe(this, 36)))));
                    } else {
                        i = 1892678508;
                    }
                } else if (findViewById instanceof RecyclerView) {
                    findViewById.setVisibility(0);
                }
                Context context2 = view.getContext();
                C14360o3.A07(context2);
                AbstractC13880nE.A0Y(view, C1H4.A01(AbstractC13880nE.A04(context2, 80)));
                Iterator it = this.A01.keySet().iterator();
                while (it.hasNext()) {
                    A00((C3LX) it.next(), this, B9Y.A00);
                }
                i = 474505652;
            } else {
                i = 1986391154;
            }
        } else {
            i = -1341547793;
        }
        C0f9.A0E(i, A01, intent);
    }
}
