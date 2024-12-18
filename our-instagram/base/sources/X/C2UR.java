package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.2UR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2UR extends ContextWrapper {
    public static int A01 = 1;
    public static boolean A02;
    public static boolean A03;
    public final AbstractC215613i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2UR(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        C11X c11x = C11X.A00;
        C18C.A07(c11x, "Must call setInstance() first");
        C14360o3.A07(c11x);
        this.A00 = c11x.A02(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        Context createConfigurationContext = super.createConfigurationContext(configuration);
        if (!(createConfigurationContext instanceof C2UR) && !(createConfigurationContext instanceof IgFragmentActivity)) {
            C14360o3.A0A(createConfigurationContext);
            return new C2UR(createConfigurationContext);
        }
        return createConfigurationContext;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object c99584db;
        C14360o3.A0B(str, 0);
        if ("layout_inflater".equals(str)) {
            ?? obj = new Object();
            obj.A00 = LayoutInflater.from(getBaseContext());
            boolean booleanValue = ((Boolean) AbstractC15930qn.A02.A08.invoke()).booleanValue();
            if (A03 && (((LayoutInflater) obj.A00).getContext() instanceof IgFragmentActivity)) {
                Object obj2 = obj.A00;
                C14360o3.A06(obj2);
                Context context = ((LayoutInflater) obj.A00).getContext();
                C14360o3.A07(context);
                boolean z = A02;
                c99584db = new C99574da(context, (LayoutInflater) obj2, new C9EI(obj, 47), A01, booleanValue, z);
            } else {
                if (booleanValue) {
                    Object obj3 = obj.A00;
                    C14360o3.A06(obj3);
                    Context context2 = ((LayoutInflater) obj.A00).getContext();
                    C14360o3.A07(context2);
                    c99584db = new C99584db(context2, (LayoutInflater) obj3, true, true);
                }
                if (!(((LayoutInflater) obj.A00).getContext() instanceof C2UR) && !(((LayoutInflater) obj.A00).getContext() instanceof IgFragmentActivity)) {
                    LayoutInflater layoutInflater = (LayoutInflater) obj.A00;
                    Context context3 = layoutInflater.getContext();
                    C14360o3.A07(context3);
                    obj.A00 = layoutInflater.cloneInContext(new C2UR(context3));
                }
                Object obj4 = obj.A00;
                C14360o3.A06(obj4);
                return obj4;
            }
            obj.A00 = c99584db;
            if (!(((LayoutInflater) obj.A00).getContext() instanceof C2UR)) {
                LayoutInflater layoutInflater2 = (LayoutInflater) obj.A00;
                Context context32 = layoutInflater2.getContext();
                C14360o3.A07(context32);
                obj.A00 = layoutInflater2.cloneInContext(new C2UR(context32));
            }
            Object obj42 = obj.A00;
            C14360o3.A06(obj42);
            return obj42;
        }
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.A00;
    }
}
