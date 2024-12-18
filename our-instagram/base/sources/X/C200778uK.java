package X;

import android.content.ContentProviderClient;
import android.database.Cursor;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200778uK {
    public static final Map A00 = Collections.unmodifiableMap(new HashMap<EnumC200798uM, EnumC200808uN>() { // from class: X.8uL
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj != null && !(obj instanceof EnumC200798uM)) {
                return false;
            }
            return super.containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof EnumC200808uN)) {
                return false;
            }
            return super.containsValue(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj != null && !(obj instanceof EnumC200798uM)) {
                return null;
            }
            return super.get(obj);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof EnumC200798uM)) {
                return obj2;
            }
            return super.getOrDefault(obj, obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj != null && !(obj instanceof EnumC200798uM)) {
                return null;
            }
            return super.remove(obj);
        }

        {
            put(EnumC200798uM.FACEBOOK, EnumC200808uN.A03);
            put(EnumC200798uM.MESSENGER, EnumC200808uN.A08);
            put(EnumC200798uM.FACEBOOK_LITE, EnumC200808uN.A05);
            put(EnumC200798uM.INSTAGRAM, EnumC200808uN.A06);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set entrySet() {
            return super.entrySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set keySet() {
            return super.keySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return super.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return super.values();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = obj instanceof EnumC200798uM;
            }
            if (!z || (obj2 != null && !(obj2 instanceof EnumC200808uN))) {
                return false;
            }
            return super.remove(obj, obj2);
        }
    });

    public final ArrayList A01(ContentProviderClient contentProviderClient, String str, String str2, AbstractC200848uR abstractC200848uR, EnumC200938ua enumC200938ua, AbstractC200888uV abstractC200888uV) {
        C14360o3.A0B(str2, 5);
        Cursor A002 = A00(contentProviderClient, enumC200938ua, C05F.A00, str, str2, abstractC200848uR, abstractC200888uV);
        if (A002 != null) {
            ArrayList arrayList = new ArrayList();
            EnumC200798uM enumC200798uM = abstractC200848uR.A04;
            InterfaceC203078yP interfaceC203078yP = (InterfaceC203078yP) AbstractC203048yM.A00.get(enumC200798uM);
            try {
                if (interfaceC203078yP == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't find corresponding transformer for SsoSource =");
                    sb.append(enumC200798uM);
                    throw new RuntimeException(sb.toString());
                }
                while (A002.moveToNext()) {
                    C203128yU F8J = interfaceC203078yP.F8J(A002);
                    if (F8J != null) {
                        arrayList.add(new C203148yW(abstractC200848uR, F8J));
                    }
                }
                return arrayList;
            } catch (C200998ug e) {
                abstractC200888uV.A03(C05F.A1I, AbstractC200928uZ.A00(enumC200798uM).name(), enumC200938ua.name(), abstractC200888uV.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", str2));
            } finally {
                A002.close();
            }
        }
        return new ArrayList();
    }

    public final ArrayList A02(ContentProviderClient contentProviderClient, String str, AbstractC200848uR abstractC200848uR, EnumC200938ua enumC200938ua, AbstractC200888uV abstractC200888uV) {
        C14360o3.A0B(str, 5);
        Cursor A002 = A00(contentProviderClient, enumC200938ua, C05F.A00, null, str, abstractC200848uR, abstractC200888uV);
        if (A002 != null) {
            ArrayList arrayList = new ArrayList();
            EnumC200798uM enumC200798uM = abstractC200848uR.A04;
            InterfaceC203078yP interfaceC203078yP = (InterfaceC203078yP) AbstractC203048yM.A00.get(enumC200798uM);
            try {
                if (interfaceC203078yP == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't find corresponding transformer for SsoSource =");
                    sb.append(enumC200798uM);
                    throw new RuntimeException(sb.toString());
                }
                while (A002.moveToNext()) {
                    ACJ F8N = interfaceC203078yP.F8N(A002, enumC200938ua);
                    if (F8N != null) {
                        arrayList.add(F8N);
                    }
                }
                return arrayList;
            } catch (C200998ug e) {
                abstractC200888uV.A03(C05F.A1I, AbstractC200928uZ.A00(enumC200798uM).name(), enumC200938ua.name(), abstractC200888uV.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", str));
            } finally {
                A002.close();
            }
        }
        return new ArrayList();
    }

    public static final Cursor A00(ContentProviderClient contentProviderClient, Enum r15, Integer num, String str, String str2, AbstractC200848uR abstractC200848uR, AbstractC200888uV abstractC200888uV) {
        String str3;
        C200828uP c200828uP = abstractC200848uR.A03;
        Cursor cursor = null;
        if (c200828uP != null) {
            try {
                cursor = contentProviderClient.query(abstractC200848uR.A00, c200828uP.A02, c200828uP.A01, new String[]{str, str2}, null);
                return cursor;
            } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
                if (r15 instanceof EnumC200938ua) {
                    String name = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
                    String name2 = ((EnumC200938ua) r15).name();
                    Integer num2 = C05F.A02;
                    if (num.intValue() != 0) {
                        str3 = "LITE_PROVIDER";
                    } else {
                        str3 = "LEGACY_PROVIDER";
                    }
                    abstractC200888uV.A03(num2, name, name2, abstractC200888uV.A01("resolver_name", str3, TraceFieldType.FailureReason, e.getMessage(), "instance_key", str2));
                    return cursor;
                }
            }
        }
        return cursor;
    }
}
