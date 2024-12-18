package X;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08150bd {
    public InterfaceC08100bW A08;
    public ComponentName A03 = null;
    public String A0B = null;
    public String A0A = null;
    public android.net.Uri A06 = null;
    public String A0C = null;
    public Rect A05 = null;
    public Intent A04 = null;
    public ClipData A02 = null;
    public Bundle A07 = null;
    public final java.util.Set A0E = new HashSet();
    public AbstractC08800ci A09 = null;
    public int A00 = 0;
    public long A01 = 0;
    public boolean A0D = false;

    public final int A00(int i) {
        int i2;
        boolean z = false;
        if ((8 & this.A01) != 0) {
            z = true;
        }
        if (!z) {
            if (Build.VERSION.SDK_INT > 30) {
                i &= -33554433;
            }
            i2 = 67108864;
        } else {
            i &= -67108865;
            if (Build.VERSION.SDK_INT <= 30) {
                return i;
            }
            i2 = 33554432;
        }
        return i | i2;
    }

    public Intent A04(Context context) {
        String packageName;
        Intent intent = new Intent();
        intent.setComponent(this.A03);
        intent.setFlags(this.A00);
        if (this.A0D) {
            intent.setComponent(new ComponentName(context, "com.facebook.invalid_class.f4c3b00c"));
            packageName = context.getPackageName();
        } else {
            intent.setAction(this.A0A);
            intent.setDataAndType(this.A06, this.A0C);
            intent.setSourceBounds(this.A05);
            intent.setSelector(this.A04);
            intent.setClipData(this.A02);
            Iterator it = this.A0E.iterator();
            while (it.hasNext()) {
                intent.addCategory((String) it.next());
            }
            if (this.A07 != null) {
                intent.setExtrasClassLoader(context.getClassLoader());
                intent.putExtras(this.A07);
            }
            AbstractC08800ci abstractC08800ci = this.A09;
            if (abstractC08800ci != null && !abstractC08800ci.A01(this.A06)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SecurePendingIntent UriFilter fails. Data: ");
                sb.append(this.A06);
                String obj = sb.toString();
                InterfaceC08100bW interfaceC08100bW = this.A08;
                if (interfaceC08100bW != null) {
                    interfaceC08100bW.EH9(obj);
                } else {
                    throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                }
            }
            long j = this.A01;
            if ((1 & j) != 0) {
                if ((4 & j) == 0) {
                    String str = this.A0B;
                    if (str == null) {
                        str = context.getPackageName();
                        this.A0B = str;
                    }
                    intent.setPackage(str);
                    if ((2 & this.A01) != 0) {
                        if (!this.A0B.equals(context.getPackageName())) {
                            InterfaceC08100bW interfaceC08100bW2 = this.A08;
                            if (interfaceC08100bW2 != null) {
                                interfaceC08100bW2.EH9("SecurePendingIntent is configured to allow only implicit intent going to the same app, but detected intent for a different app.");
                            } else {
                                throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                            }
                        }
                    }
                    if (intent.getAction() != null && !intent.getAction().startsWith("android")) {
                        return intent;
                    }
                    if (intent.getCategories() != null && !intent.getCategories().isEmpty()) {
                        return intent;
                    }
                    InterfaceC08100bW interfaceC08100bW3 = this.A08;
                    if (interfaceC08100bW3 != null) {
                        interfaceC08100bW3.EH9("SecurePendingIntent is configured to allow implicit intent with either customized action or categories");
                        return intent;
                    }
                    throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
                }
                return intent;
            }
            if (intent.getComponent() != null) {
                packageName = intent.getComponent().getPackageName();
            } else {
                throw new SecurityException("Must generate PendingIntent based on an explicit intent.");
            }
        }
        intent.setPackage(packageName);
        return intent;
    }

    public C08150bd A06(Bundle bundle, ClassLoader classLoader) {
        Bundle bundle2 = this.A07;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            this.A07 = bundle2;
        }
        if (classLoader != null) {
            bundle2.setClassLoader(classLoader);
        }
        this.A07.putAll(bundle);
        return this;
    }

    public C08150bd A07(AbstractC08800ci abstractC08800ci) {
        if (abstractC08800ci != null && !abstractC08800ci.A00()) {
            this.A09 = abstractC08800ci;
            return this;
        }
        throw new IllegalArgumentException("SecurePendingIntent is configured to allow UNSAFE implicit intent and needs to define NON-EMPTY UriFilter for data.");
    }

    public final PendingIntent A01(Context context, int i, int i2) {
        return PendingIntent.getActivity(context, i, A04(context), A00(i2));
    }

    public final PendingIntent A02(Context context, int i, int i2) {
        return PendingIntent.getBroadcast(context, i, A04(context), A00(i2));
    }

    public final PendingIntent A03(Context context, int i, int i2) {
        return PendingIntent.getService(context, i, A04(context), A00(i2));
    }

    public C08150bd A05(Intent intent, ClassLoader classLoader) {
        this.A03 = intent.getComponent();
        this.A0A = intent.getAction();
        this.A06 = intent.getData();
        this.A0C = intent.getType();
        this.A05 = intent.getSourceBounds();
        this.A04 = intent.getSelector();
        this.A02 = intent.getClipData();
        java.util.Set<String> categories = intent.getCategories();
        if (categories != null) {
            this.A0E.addAll(categories);
        }
        this.A00 = intent.getFlags();
        if (intent.getExtras() != null) {
            if (classLoader != null) {
                intent.setExtrasClassLoader(classLoader);
            }
            A06(intent.getExtras(), classLoader);
        }
        return this;
    }
}
