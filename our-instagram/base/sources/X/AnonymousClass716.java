package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListAdapter;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.716, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass716 {
    public static final Object A0A = new Object();
    public ListAdapter A00;
    public InterfaceC156076zb A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final ViewGroup A07;
    public final AnonymousClass717 A08 = new AnonymousClass717();
    public final DataSetObserver A06 = new DataSetObserver() { // from class: X.718
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            AnonymousClass716 anonymousClass716 = AnonymousClass716.this;
            anonymousClass716.A02 = true;
            AnonymousClass716.A00(anonymousClass716, "observer_change");
        }
    };
    public final InterfaceC65452xh A09 = new InterfaceC65452xh() { // from class: X.719
        @Override // X.InterfaceC65452xh
        public final void D2j(int i, int i2, Object obj) {
        }

        @Override // X.InterfaceC65452xh
        public final void DMJ(int i, int i2) {
            AnonymousClass716 anonymousClass716 = AnonymousClass716.this;
            if (anonymousClass716.A00 != null) {
                int i3 = i2 + i;
                while (i < i3) {
                    ViewGroup viewGroup = anonymousClass716.A07;
                    ViewStub viewStub = new ViewStub(viewGroup.getContext());
                    viewStub.setTag(AnonymousClass716.A0A);
                    viewGroup.addView(viewStub, i);
                    i++;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // X.InterfaceC65452xh
        public final void DTy(int i, int i2) {
            ViewGroup viewGroup = AnonymousClass716.this.A07;
            View childAt = viewGroup.getChildAt(i);
            viewGroup.removeViewAt(i);
            viewGroup.addView(childAt, i2);
        }

        @Override // X.InterfaceC65452xh
        public final void DfC(int i, int i2) {
            try {
                AnonymousClass716.this.A07.removeViews(i, i2);
            } catch (IndexOutOfBoundsException e) {
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                ViewGroup viewGroup = AnonymousClass716.this.A07;
                C0K8.A0L("AdapterLinearLayout", "failed to remove views - position=%d count=%d childCount=%d", e, valueOf, valueOf2, Integer.valueOf(viewGroup.getChildCount()));
                throw new IndexOutOfBoundsException(StringFormatUtil.formatStrLocaleSafe("Failed to remove views - position=%d count=%d childCount=%d", valueOf, valueOf2, Integer.valueOf(viewGroup.getChildCount())));
            }
        }
    };

    public static final void A00(AnonymousClass716 anonymousClass716, String str) {
        if (!anonymousClass716.A03) {
            InterfaceC156076zb interfaceC156076zb = anonymousClass716.A01;
            if (interfaceC156076zb != null) {
                interfaceC156076zb.DxC(anonymousClass716.A05, str);
                anonymousClass716.A05++;
            }
            AnonymousClass717 anonymousClass717 = anonymousClass716.A08;
            List list = anonymousClass717.A00;
            list.clear();
            ListAdapter listAdapter = anonymousClass716.A00;
            if (listAdapter != null) {
                int count = listAdapter.getCount();
                for (int i = 0; i < count; i++) {
                    list.add(Integer.valueOf(listAdapter.getItemViewType(i)));
                }
            }
            AbstractC66552zX.A00(anonymousClass717).A02(anonymousClass716.A09);
            ListAdapter listAdapter2 = anonymousClass716.A00;
            if (listAdapter2 != null) {
                int count2 = listAdapter2.getCount();
                for (int i2 = 0; i2 < count2; i2++) {
                    ViewGroup viewGroup = anonymousClass716.A07;
                    View childAt = viewGroup.getChildAt(i2);
                    C14360o3.A0A(childAt);
                    if ((childAt instanceof ViewStub) && C14360o3.A0K(childAt.getTag(), A0A)) {
                        View view = listAdapter2.getView(i2, null, viewGroup);
                        C14360o3.A0A(view);
                        viewGroup.removeViewAt(i2);
                        viewGroup.addView(view, i2);
                    } else {
                        listAdapter2.getView(i2, childAt, viewGroup);
                    }
                }
                List list2 = anonymousClass717.A01;
                list2.clear();
                list2.addAll(list);
                anonymousClass716.A02 = false;
                InterfaceC156076zb interfaceC156076zb2 = anonymousClass716.A01;
                if (interfaceC156076zb2 != null) {
                    C14360o3.A0B(((C156066za) interfaceC156076zb2).A00.A0L, 0);
                    C006802i.A0p.markerEnd(18290511, (short) 2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass716(ViewGroup viewGroup) {
        this.A07 = viewGroup;
    }
}
