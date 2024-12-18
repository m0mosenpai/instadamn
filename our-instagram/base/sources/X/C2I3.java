package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.2I3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2I3 {
    public final String A00;
    public final String A01;
    public final Field A02;
    public final boolean A03;
    public final boolean A04;
    public final /* synthetic */ Gson A05;
    public final /* synthetic */ TypeAdapter A06;
    public final /* synthetic */ C47812Hm A07;
    public final /* synthetic */ TypeToken A08;
    public final /* synthetic */ Method A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public C2I3(Gson gson, TypeAdapter typeAdapter, C47812Hm c47812Hm, TypeToken typeToken, String str, Field field, Method method, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = c47812Hm;
        this.A09 = method;
        this.A0C = z3;
        this.A06 = typeAdapter;
        this.A05 = gson;
        this.A08 = typeToken;
        this.A0A = z4;
        this.A0B = z5;
        this.A01 = str;
        this.A02 = field;
        this.A00 = field.getName();
        this.A04 = z;
        this.A03 = z2;
    }
}
