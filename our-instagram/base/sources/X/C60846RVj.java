package X;

import com.google.gson.stream.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.RVj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60846RVj extends C2IB {
    public static final Map A03;
    public final Constructor A00;
    public final Map A01;
    public final Object[] A02;

    @Override // X.C2IB
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A02.clone();
    }

    @Override // X.C2IB
    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        Object[] objArr = (Object[]) obj;
        try {
            return this.A00.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
            throw AbstractC58318PtA.A0e("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0u("Failed to invoke constructor '", AbstractC47872Hw.A01(this.A00), "' with args ", Arrays.toString(objArr)), e2);
        } catch (InvocationTargetException e3) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0u("Failed to invoke constructor '", AbstractC47872Hw.A01(this.A00), "' with args ", Arrays.toString(objArr)), e3.getCause());
        }
    }

    @Override // X.C2IB
    public final /* bridge */ /* synthetic */ void A02(C2I3 c2i3, JsonReader jsonReader, Object obj) {
        Object[] objArr = (Object[]) obj;
        Map map = this.A01;
        String str = c2i3.A00;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        if (A0Q != null) {
            int intValue = A0Q.intValue();
            Object read = c2i3.A06.read(jsonReader);
            if (read == null && c2i3.A0A) {
                throw new RuntimeException(AnonymousClass001.A0u("null is not allowed as value for record component '", str, "' of primitive type; at path ", jsonReader.A0H()));
            }
            objArr[intValue] = read;
            return;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A11("Could not find the index in the constructor '", AbstractC47872Hw.A01(this.A00), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(Byte.TYPE, (byte) 0);
        A1G.put(Short.TYPE, (short) 0);
        AbstractC166997dE.A1U(Integer.TYPE, A1G, 0);
        A1G.put(Long.TYPE, AbstractC167007dF.A0d());
        A1G.put(Float.TYPE, AbstractC25227BEk.A0l());
        A1G.put(Double.TYPE, MSY.A0Y());
        A1G.put(Character.TYPE, (char) 0);
        AbstractC31173DnH.A1Y(Boolean.TYPE, A1G, false);
        A03 = A1G;
    }

    public C60846RVj(Class cls, Map map) {
        super(map);
        this.A01 = AbstractC166987dD.A1G();
        AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
        Constructor A00 = abstractC47892Hy.A00(cls);
        this.A00 = A00;
        AbstractC47872Hw.A03(A00);
        String[] A032 = abstractC47892Hy.A03(cls);
        for (int i = 0; i < A032.length; i++) {
            AbstractC37301Gc2.A1T(A032[i], this.A01, i);
        }
        Class<?>[] parameterTypes = this.A00.getParameterTypes();
        int length = parameterTypes.length;
        this.A02 = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            this.A02[i2] = A03.get(parameterTypes[i2]);
        }
    }
}
