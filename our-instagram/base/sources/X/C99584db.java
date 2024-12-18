package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.4db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C99584db extends LayoutInflater {
    public static final String[] A04 = {"android.widget.", "android.webkit.", "android.app."};
    public final LayoutInflater A00;
    public final boolean A01;
    public final C99594dc A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99584db(Context context, LayoutInflater layoutInflater, boolean z, boolean z2) {
        super(layoutInflater, context);
        C14360o3.A0B(layoutInflater, 1);
        this.A00 = layoutInflater;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = new C99594dc();
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        C14360o3.A0B(context, 0);
        LayoutInflater cloneInContext = this.A00.cloneInContext(context);
        C14360o3.A07(cloneInContext);
        return new C99584db(context, cloneInContext, this.A01, this.A03);
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) {
        View view;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(attributeSet, 1);
        String[] strArr = A04;
        int i = 0;
        while (true) {
            view = null;
            if (i >= 3) {
                break;
            }
            try {
                view = createView(str, strArr[i], attributeSet);
            } catch (ClassNotFoundException unused) {
            }
            if (view != null) {
                break;
            }
            i++;
        }
        if (view == null) {
            View onCreateView = super.onCreateView(str, attributeSet);
            C14360o3.A07(onCreateView);
            return onCreateView;
        }
        return view;
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate;
        LayoutInflater cloneInContext;
        View inflate2;
        if (!this.A03) {
            if (this.A01) {
                inflate2 = super.inflate(i, viewGroup, z);
                C14360o3.A0A(inflate2);
                return inflate2;
            }
            cloneInContext = this.A00;
        } else {
            C99594dc c99594dc = this.A02;
            if (!c99594dc.tryLock()) {
                C0K8.A0D("IgLayoutInflater", AnonymousClass001.A0u("Thread conflict, cloning to avoid locking thisThread = ", Thread.currentThread().getName(), " holderThread=", c99594dc.A00()));
                Context context = getContext();
                C14360o3.A07(context);
                cloneInContext = cloneInContext(context);
            } else {
                try {
                    if (this.A01) {
                        inflate = super.inflate(i, viewGroup, z);
                    } else {
                        inflate = this.A00.inflate(i, viewGroup, z);
                    }
                    C14360o3.A0A(inflate);
                    return inflate;
                } finally {
                    c99594dc.unlock();
                }
            }
        }
        inflate2 = cloneInContext.inflate(i, viewGroup, z);
        C14360o3.A0A(inflate2);
        return inflate2;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        View inflate;
        if (!this.A03) {
            inflate = super.inflate(xmlPullParser, viewGroup, z);
        } else {
            C99594dc c99594dc = this.A02;
            if (c99594dc.tryLock()) {
                try {
                    inflate = super.inflate(xmlPullParser, viewGroup, z);
                } finally {
                    c99594dc.unlock();
                }
            } else {
                C0K8.A0D("IgLayoutInflater", AnonymousClass001.A0u("Thread conflict, cloning to avoid locking thisThread = ", Thread.currentThread().getName(), " holderThread=", c99594dc.A00()));
                Context context = getContext();
                C14360o3.A07(context);
                inflate = cloneInContext(context).inflate(xmlPullParser, viewGroup, z);
            }
        }
        C14360o3.A0A(inflate);
        return inflate;
    }
}
