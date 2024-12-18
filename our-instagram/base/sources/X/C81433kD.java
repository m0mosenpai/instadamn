package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81433kD implements InterfaceC81443kE {
    public final ViewGroup A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public C81433kD(View view) {
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.clips_container);
        C14360o3.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.clips_header_title);
        C14360o3.A07(requireViewById2);
        this.A04 = (IgTextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.clips_header_subtitle);
        C14360o3.A07(requireViewById3);
        this.A03 = (IgTextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.clips_header_cta);
        C14360o3.A07(requireViewById4);
        this.A02 = (IgTextView) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.clips_items_view);
        C14360o3.A07(requireViewById5);
        this.A01 = (RecyclerView) requireViewById5;
    }

    @Override // X.InterfaceC81443kE
    public final Object BEG(C38321qM c38321qM) {
        RecyclerView recyclerView = this.A01;
        C2UU c2uu = recyclerView.A0A;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (!(c2uu instanceof C4E2) || abstractC70663Fe == null || !(abstractC70663Fe instanceof LinearLayoutManager)) {
            return null;
        }
        C125625m8 c125625m8 = ((C4E2) c2uu).A02;
        if (c125625m8 == null) {
            C14360o3.A0F("clipsNetegoItemsToRender");
            throw C00O.createAndThrow();
        }
        int i = 0;
        Iterator it = c125625m8.A00.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(((C120985dq) it.next()).A02, c38321qM)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        View A0d = abstractC70663Fe.A0d(i);
        if (A0d == null) {
            return null;
        }
        return A0d.getTag();
    }

    @Override // X.InterfaceC81443kE
    public final Map BRm() {
        Object obj;
        RecyclerView recyclerView = this.A01;
        C2UU c2uu = recyclerView.A0A;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((c2uu instanceof C4E2) && abstractC70663Fe != null && (abstractC70663Fe instanceof LinearLayoutManager)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C4E2 c4e2 = (C4E2) c2uu;
            int itemCount = c4e2.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View A0d = abstractC70663Fe.A0d(i);
                if (A0d != null) {
                    obj = A0d.getTag();
                } else {
                    obj = null;
                }
                C125625m8 c125625m8 = c4e2.A02;
                C38321qM c38321qM = null;
                if (c125625m8 == null) {
                    C14360o3.A0F("clipsNetegoItemsToRender");
                    throw C00O.createAndThrow();
                }
                C120985dq c120985dq = (C120985dq) AbstractC001800i.A0O(c125625m8.A00, i);
                if (c120985dq != null) {
                    c38321qM = c120985dq.A02;
                }
                if (obj != null && c38321qM != null) {
                    linkedHashMap.put(c38321qM, obj);
                }
            }
            return linkedHashMap;
        }
        return new LinkedHashMap();
    }
}
