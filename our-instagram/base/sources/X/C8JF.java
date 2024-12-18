package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8JF, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8JF extends C2UU {
    public final Context A01;
    public final C8FJ A03;
    public final List A02 = new ArrayList();
    public int A00 = -1;

    public void A02(int i) {
        A04(null, false, false, i);
    }

    public final int A00(String str) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC50102Ry.A00(((InterfaceC120325cX) list.get(i)).getId(), str)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public final InterfaceC120325cX A01(int i) {
        if (i >= 0) {
            List list = this.A02;
            if (i < list.size()) {
                return (InterfaceC120325cX) list.get(i);
            }
            return null;
        }
        return null;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        this.A00 = i;
        if (A06(i2) && A06(i)) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
        }
    }

    public final void A04(String str, boolean z, boolean z2, int i) {
        if (!z2 && i == this.A00) {
            return;
        }
        int i2 = this.A00;
        this.A00 = i;
        if (A06(i2)) {
            notifyItemChanged(i2);
        }
        if (A06(i)) {
            notifyItemChanged(this.A00);
            this.A03.DDC((InterfaceC120325cX) this.A02.get(i), str, i, z);
        } else {
            AbstractC12120kG.A01("SelectableEffectAdapter", AnonymousClass001.A0O("New selected position is invalid newPosition=", i));
        }
    }

    public final void A05(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public final boolean A06(int i) {
        if (this instanceof C8JC) {
            PickerConfiguration pickerConfiguration = ((C8JC) this).A00;
            if (pickerConfiguration == null || i < 0 || i >= pickerConfiguration.mItems.length) {
                return false;
            }
            return true;
        }
        if (i != Integer.MIN_VALUE && i >= 0 && i < this.A02.size()) {
            return true;
        }
        return false;
    }

    public C8JF(Context context, C8FJ c8fj) {
        this.A03 = c8fj;
        this.A01 = context;
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(1639645817);
        int size = this.A02.size();
        C0f9.A0A(-1545536640, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-538096919);
        long parseLong = Long.parseLong(((InterfaceC120325cX) this.A02.get(i)).getId());
        C0f9.A0A(-587696357, A03);
        return parseLong;
    }
}
