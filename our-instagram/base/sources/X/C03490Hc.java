package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManagerGlobal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03490Hc {
    public static final C03490Hc A03 = new C03490Hc();
    public C0Hd A00;
    public Class A01;
    public final boolean A02;

    public static void A00(View view, final C03490Hc c03490Hc) {
        final Window.Callback callback;
        if (view != null) {
            if (c03490Hc.A01 == null) {
                Class<?> cls = view.getClass();
                if (cls.getName().contains("DecorView")) {
                    c03490Hc.A01 = cls;
                }
            }
            Class<?> cls2 = c03490Hc.A01;
            if (cls2 != null && view.getClass() != cls2) {
                return;
            }
            try {
                Field declaredField = view.getClass().getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                final Window window = (Window) declaredField.get(view);
                if (window != null && (callback = window.getCallback()) != null && !Proxy.isProxyClass(callback.getClass())) {
                    window.setCallback((Window.Callback) Proxy.newProxyInstance(C03490Hc.class.getClassLoader(), new Class[]{Window.Callback.class}, new InvocationHandler(callback, window, c03490Hc) { // from class: X.0Hb
                        public final Window.Callback A00;
                        public final Window A01;
                        public final /* synthetic */ C03490Hc A02;

                        {
                            this.A02 = c03490Hc;
                            this.A01 = window;
                            this.A00 = callback;
                        }

                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr) {
                            C03490Hc c03490Hc2 = this.A02;
                            C03490Hc c03490Hc3 = C03490Hc.A03;
                            C0Hd c0Hd = c03490Hc2.A00;
                            if (c0Hd != null && objArr != null && objArr.length == 1) {
                                Object obj2 = objArr[0];
                                if (obj2 instanceof MotionEvent) {
                                    c0Hd.Du9((MotionEvent) obj2, this.A01);
                                } else if (obj2 instanceof KeyEvent) {
                                    c0Hd.DOE((KeyEvent) obj2, this.A01);
                                }
                            }
                            return method.invoke(this.A00, objArr);
                        }
                    }));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C03490Hc() {
        boolean z;
        WindowManagerGlobal windowManagerGlobal;
        Field declaredField;
        Class<?> cls;
        Field declaredField2;
        Object obj;
        try {
            windowManagerGlobal = WindowManagerGlobal.getInstance();
            declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            cls = windowManagerGlobal.getClass();
            declaredField2 = cls.getDeclaredField("mRoots");
            declaredField2.setAccessible(true);
            declaredField.setInt(declaredField2, declaredField2.getModifiers() & (-17));
            obj = declaredField2.get(windowManagerGlobal);
        } catch (Throwable unused) {
            z = false;
        }
        if (obj != null) {
            final ArrayList arrayList = (ArrayList) obj;
            declaredField2.set(windowManagerGlobal, new ArrayList(arrayList) { // from class: X.0Ha
                @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
                    C03490Hc c03490Hc = C03490Hc.A03;
                    return super.add(obj2);
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
                    Object remove = super.remove(i);
                    C03490Hc c03490Hc = C03490Hc.A03;
                    return remove;
                }
            });
            Field declaredField3 = cls.getDeclaredField("mViews");
            declaredField3.setAccessible(true);
            declaredField.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            Object obj2 = declaredField3.get(windowManagerGlobal);
            if (obj2 != null) {
                final ArrayList arrayList2 = (ArrayList) obj2;
                declaredField3.set(windowManagerGlobal, new ArrayList<T>(arrayList2) { // from class: X.0HZ
                    {
                        super(arrayList2);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C03490Hc.A00((View) it.next(), C03490Hc.this);
                        }
                    }

                    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final /* bridge */ /* synthetic */ boolean add(Object obj3) {
                        View view = (View) obj3;
                        C03490Hc.A00(view, C03490Hc.this);
                        return super.add(view);
                    }

                    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                    public final /* bridge */ /* synthetic */ Object remove(int i) {
                        return super.remove(i);
                    }
                });
                z = true;
                this.A02 = z;
            }
        }
        z = false;
        this.A02 = z;
    }
}
