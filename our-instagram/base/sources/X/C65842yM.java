package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.2yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65842yM extends AbstractC65632xz {
    public final int A00;
    public final Context A01;
    public final C5GV A02;
    public final InterfaceC64472w6 A03;
    public final C64492w8 A04;

    public C65842yM(Context context, C5GV c5gv, InterfaceC64472w6 interfaceC64472w6, C64492w8 c64492w8) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A03 = interfaceC64472w6;
        this.A02 = c5gv == null ? null : c5gv;
        this.A04 = c64492w8;
        this.A00 = R.layout.load_more_empty;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(obj, 1);
        anonymousClass306.A7a(0);
        C64492w8 c64492w8 = this.A04;
        if (c64492w8 != null) {
            String A0O = AnonymousClass001.A0O("load-more:", obj.hashCode());
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(obj, null, A0O);
            c59072n8.A00(c64492w8.A03);
            C64582wH c64582wH = c64492w8.A00;
            if (c64582wH != null) {
                c59072n8.A00(c64582wH);
            }
            c64492w8.A02.A01(c59072n8.A01(), A0O);
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "LoadMore";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        C5GV c5gv = this.A02;
        if (c5gv != null) {
            c5gv.A00(view, obj);
        }
        C64492w8 c64492w8 = this.A04;
        if (c64492w8 != null) {
            C59062n7 A00 = c64492w8.A02.A00(AnonymousClass001.A0O("load-more:", obj.hashCode()));
            if (A00 != C59062n7.A07) {
                c64492w8.A01.A05(view, A00);
            }
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C5GV c5gv = this.A02;
        if (c5gv != null) {
            c5gv.A00.A04(view);
        }
        C64492w8 c64492w8 = this.A04;
        if (c64492w8 != null) {
            c64492w8.A01.A04(view);
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2126278261);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            ((C73223Px) tag).A00.A04((InterfaceC62602sz) obj, this.A03);
            C0f9.A0A(929356912, A03);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            C0f9.A0A(475026030, A03);
            throw illegalStateException;
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(605971569);
        C14360o3.A0B(viewGroup, 1);
        View A00 = LoadMoreButton.A00(this.A01, this.A00, viewGroup);
        A00.setTag(new C73223Px(A00));
        C0f9.A0A(-298061254, A03);
        return A00;
    }

    public C65842yM(Context context, C5GV c5gv) {
        this.A01 = context;
        this.A03 = null;
        this.A02 = c5gv == null ? null : c5gv;
        this.A04 = null;
        this.A00 = R.layout.load_more_empty;
    }

    public C65842yM(Context context, int i) {
        this.A01 = context;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A00 = R.layout.layout_empty_sticker_load_more_view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C65842yM(Context context) {
        this(context, null, null, null);
        C14360o3.A0B(context, 1);
    }
}
