package X;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13270mD {
    public static Integer A05;
    public static boolean A06;
    public final Context A00;
    public final Handler A01;
    public final LayoutInflater A02;
    public final C13240mA A03;
    public final Handler.Callback A04;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(InterfaceC13250mB interfaceC13250mB, int i) {
        C13240mA c13240mA = this.A03;
        C13220m8 c13220m8 = (C13220m8) c13240mA.A00.A7H();
        C13220m8 c13220m82 = c13220m8;
        if (c13220m8 == null) {
            c13220m82 = new Object();
        }
        c13220m82.A03 = this;
        c13220m82.A00 = i;
        c13220m82.A02 = interfaceC13250mB;
        try {
            c13240mA.A01.put(c13220m82);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }

    public C13270mD(Context context, int i) {
        final C52182aJ c52182aJ;
        C13240mA c13240mA = C13240mA.A02;
        this.A03 = c13240mA;
        Handler.Callback callback = new Handler.Callback() { // from class: X.0mC
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                Object obj = message.obj;
                if (obj != null) {
                    C13220m8 c13220m8 = (C13220m8) obj;
                    View view = c13220m8.A01;
                    if (view != null) {
                        InterfaceC13250mB interfaceC13250mB = c13220m8.A02;
                        if (interfaceC13250mB != null) {
                            interfaceC13250mB.DLv(null, view, c13220m8.A00);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C13240mA c13240mA2 = C13270mD.this.A03;
                    c13220m8.A02 = null;
                    c13220m8.A03 = null;
                    c13220m8.A00 = 0;
                    c13220m8.A01 = null;
                    c13240mA2.A00.EE6(c13220m8);
                    return true;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        this.A04 = callback;
        if (i != 0) {
            c52182aJ = new C52182aJ(context.getApplicationContext(), i);
        } else {
            c52182aJ = new C52182aJ(context.getApplicationContext(), context.getTheme());
        }
        this.A00 = c52182aJ;
        this.A02 = new LayoutInflater(c52182aJ) { // from class: X.0m6
            public static final String[] A00 = {"android.widget.", "android.webkit.", "android.app."};

            @Override // android.view.LayoutInflater
            public final LayoutInflater cloneInContext(Context context2) {
                C14360o3.A0B(context2, 0);
                return new LayoutInflater(context2);
            }

            @Override // android.view.LayoutInflater
            public final View onCreateView(String str, AttributeSet attributeSet) {
                View createView;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(attributeSet, 1);
                String[] strArr = A00;
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        createView = createView(str, strArr[i2], attributeSet);
                    } catch (ClassNotFoundException unused) {
                    }
                    if (createView != null) {
                        return createView;
                    }
                }
                return super.onCreateView(str, attributeSet);
            }

            @Override // android.view.LayoutInflater
            public final View inflate(int i2, ViewGroup viewGroup, boolean z) {
                View inflate;
                if (C13270mD.A06) {
                    Object obj = null;
                    try {
                        XmlResourceParser layout = getContext().getResources().getLayout(i2);
                        do {
                        } while (!AbstractC009903n.A0O(Integer.valueOf(layout.next()), new Integer[]{2, 1}));
                        layout.next();
                        obj = layout;
                    } catch (XmlPullParserException e) {
                        android.util.Log.w("AsyncLayoutInflater", "Failed to cache xml params!", e);
                    }
                    inflate = super.inflate(i2, viewGroup, z);
                    inflate.setTag(obj);
                } else {
                    inflate = super.inflate(i2, viewGroup, z);
                }
                C14360o3.A0A(inflate);
                return inflate;
            }
        };
        this.A01 = new Handler(Looper.getMainLooper(), callback);
        Integer num = A05;
        if (num != null) {
            int priority = c13240mA.getPriority();
            int intValue = num.intValue();
            if (priority != intValue) {
                c13240mA.setPriority(intValue);
            }
        }
    }
}
