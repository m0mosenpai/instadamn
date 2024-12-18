package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.facebook.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UGy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66425UGy extends C2UU implements Adapter {
    public C70666Wem A00;
    public ViewOnKeyListenerC67971V4l A01;
    public final C68962Vf0 A02;
    public final Context A03;
    public final ViewOnKeyListenerC67976V4r A04;
    public final InterfaceC11380iw A05;
    public final Map A06 = new HashMap();

    public final C69218Vjl A00(XLM xlm) {
        C14360o3.A0B(xlm, 0);
        Map map = this.A06;
        String id = xlm.getId();
        Object obj = map.get(id);
        if (obj == null) {
            obj = new C69218Vjl();
            map.put(id, obj);
        }
        return (C69218Vjl) obj;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(view, 1);
        return view;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 0;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        VEO veo = (VEO) AbstractC166997dE.A0m(VEO.A02, i);
        if (veo == null) {
            veo = VEO.A0E;
        }
        switch (veo.ordinal()) {
            case 1:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C66452UIc(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_text_block, false));
            case 2:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new UJ0(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_media_block, false));
            case 3:
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new UJ1(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_media_block, false));
            case 4:
            case 5:
            default:
                throw new UnsupportedOperationException("Unsupported Canvas view type");
            case 6:
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C66475UIz(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_button_block, false));
            case 7:
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new UJQ(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_slideshow_block, false));
            case 8:
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new UI0(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_swipe_to_open_block, false));
            case 9:
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C66451UIb(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_composite_block, false));
        }
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A02.A00.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.A00.get(i);
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(this.A02.A00.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0236  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r22, int r23) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66425UGy.onBindViewHolder(X.3OO, int):void");
    }

    public C66425UGy(Context context, ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, C68962Vf0 c68962Vf0, InterfaceC11380iw interfaceC11380iw) {
        this.A02 = c68962Vf0;
        this.A04 = viewOnKeyListenerC67976V4r;
        this.A03 = context;
        this.A05 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(192008025);
        int size = this.A02.A00.size();
        C0f9.A0A(-449786682, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1748680069);
        int i2 = ((XLM) this.A02.A00.get(i)).CBa().A00;
        C0f9.A0A(1169158449, A03);
        return i2;
    }
}
