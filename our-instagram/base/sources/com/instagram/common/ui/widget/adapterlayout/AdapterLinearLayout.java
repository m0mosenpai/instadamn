package com.instagram.common.ui.widget.adapterlayout;

import X.AnonymousClass716;
import X.AnonymousClass717;
import X.C0f9;
import X.C14360o3;
import X.C152816u9;
import X.C2UU;
import X.InterfaceC156076zb;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

/* loaded from: classes3.dex */
public final class AdapterLinearLayout extends LinearLayout {
    public AnonymousClass716 A00;
    public C152816u9 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterLinearLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    public final void setAdapter(ListAdapter listAdapter, InterfaceC156076zb interfaceC156076zb) {
        C14360o3.A0B(listAdapter, 0);
        AnonymousClass716 anonymousClass716 = this.A00;
        if (anonymousClass716 == null) {
            anonymousClass716 = new AnonymousClass716(this);
            this.A00 = anonymousClass716;
        }
        ListAdapter listAdapter2 = anonymousClass716.A00;
        if (listAdapter2 != null && anonymousClass716.A04) {
            anonymousClass716.A04 = false;
            listAdapter2.unregisterDataSetObserver(anonymousClass716.A06);
        }
        anonymousClass716.A07.removeAllViews();
        anonymousClass716.A00 = listAdapter;
        if (!anonymousClass716.A04) {
            anonymousClass716.A04 = true;
            listAdapter.registerDataSetObserver(anonymousClass716.A06);
        }
        anonymousClass716.A01 = interfaceC156076zb;
        AnonymousClass716.A00(anonymousClass716, "adapter_set");
    }

    public final void setRecyclerViewAdapter(C2UU c2uu, InterfaceC156076zb interfaceC156076zb) {
        C14360o3.A0B(c2uu, 0);
        C152816u9 c152816u9 = this.A01;
        if (c152816u9 == null) {
            c152816u9 = new C152816u9(this, interfaceC156076zb);
            this.A01 = c152816u9;
        }
        try {
            C2UU c2uu2 = c152816u9.A00;
            if (c2uu2 != null) {
                c2uu2.unregisterAdapterDataObserver(c152816u9.A05);
            }
        } catch (Exception unused) {
        }
        c152816u9.A00 = c2uu;
        c2uu.registerAdapterDataObserver(c152816u9.A05);
        C152816u9.A00(c152816u9);
    }

    public final void setIgnoreAdapterUpdates(boolean z) {
        AnonymousClass716 anonymousClass716 = this.A00;
        if (anonymousClass716 != null) {
            anonymousClass716.A03 = z;
            if (anonymousClass716.A02 && !z) {
                AnonymousClass716.A00(anonymousClass716, "process_pending_updates");
            }
        }
        C152816u9 c152816u9 = this.A01;
        if (c152816u9 != null) {
            c152816u9.A02 = z;
            if (!z && c152816u9.A01) {
                C152816u9.A00(c152816u9);
                c152816u9.A01 = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1508010855);
        super.onAttachedToWindow();
        AnonymousClass716 anonymousClass716 = this.A00;
        if (anonymousClass716 != null) {
            ListAdapter listAdapter = anonymousClass716.A00;
            if (listAdapter != null && !anonymousClass716.A04) {
                anonymousClass716.A04 = true;
                listAdapter.registerDataSetObserver(anonymousClass716.A06);
            }
            if (anonymousClass716.A07.getChildCount() == 0) {
                AnonymousClass716.A00(anonymousClass716, "attached_to_window");
            }
        }
        C0f9.A0D(-799287230, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-571349493);
        super.onDetachedFromWindow();
        AnonymousClass716 anonymousClass716 = this.A00;
        if (anonymousClass716 != null) {
            ListAdapter listAdapter = anonymousClass716.A00;
            if (listAdapter != null && anonymousClass716.A04) {
                anonymousClass716.A04 = false;
                listAdapter.unregisterDataSetObserver(anonymousClass716.A06);
            }
            anonymousClass716.A07.removeAllViews();
            AnonymousClass717 anonymousClass717 = anonymousClass716.A08;
            anonymousClass717.A01.clear();
            anonymousClass717.A00.clear();
        }
        C152816u9 c152816u9 = this.A01;
        if (c152816u9 != null) {
            try {
                C2UU c2uu = c152816u9.A00;
                if (c2uu != null) {
                    c2uu.unregisterAdapterDataObserver(c152816u9.A05);
                }
            } catch (Exception unused) {
            }
            c152816u9.A04.removeAllViews();
        }
        this.A01 = null;
        C0f9.A0D(-1466344005, A06);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
