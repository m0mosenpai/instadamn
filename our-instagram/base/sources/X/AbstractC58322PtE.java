package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.json.FbJsonField;
import com.facebook.systrace.SystraceMessage;
import com.facebookpay.logging.FBPayLoggerData;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.base.IgNativeColorsModule;
import java.io.File;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.ProtocolException;
import java.text.BreakIterator;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;

/* renamed from: X.PtE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58322PtE {
    public static int A03(int i) {
        PointF pointF = AbstractC63251Sg7.A00;
        return Math.max(0, Math.min(255, i));
    }

    public static int A05(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
        return parcel2.readInt();
    }

    public static String A0n(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return parcel.readString();
        }
        return null;
    }

    public static void A1A(IBinder iBinder, Parcel parcel) {
        iBinder.transact(1, parcel, null, 1);
    }

    public static void A1B(Parcel parcel, int i, int i2) {
        AbstractC128825rw.A07(parcel, 4, i);
        AbstractC128825rw.A06(parcel, i2);
    }

    public static void A1D(Parcel parcel, String str) {
        AbstractC128825rw.A0C(parcel, str, 1, false);
    }

    public static void A1F(Parcel parcel, String str, int i, boolean z) {
        AbstractC128825rw.A0C(parcel, str, 4, z);
        AbstractC128825rw.A06(parcel, i);
    }

    public static void A1G(Parcel parcel, List list, int i, int i2) {
        AbstractC128825rw.A0E(parcel, list, i, false);
        AbstractC128825rw.A06(parcel, i2);
    }

    public static boolean A1U(Parcel parcel, Parcelable parcelable, int i) {
        AbstractC128825rw.A0A(parcel, parcelable, 2, i, false);
        return false;
    }

    public static double A00(Parcel parcel, int i) {
        AbstractC125725mK.A0F(parcel, i, 8);
        return parcel.readDouble();
    }

    public static int A02(int i) {
        return i != 0 ? 1231 : 1237;
    }

    public static int A04(int i, int i2) {
        return ((i << 28) + (i2 + 112)) >> 30;
    }

    public static int A06(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A05(parcel, i);
        return A01;
    }

    public static long A0D(Parcel parcel, int i) {
        AbstractC125725mK.A0F(parcel, i, 8);
        return parcel.readLong();
    }

    public static Intent A0F(String str, String str2) {
        return new Intent().putExtra(str, str2);
    }

    public static LayoutInflater A0I(Context context, int i) {
        return LayoutInflater.from(new ContextThemeWrapper(context, i));
    }

    public static QWW A0L(C2JS c2js) {
        return (QWW) c2js.A01(QWW.class, 736683160);
    }

    public static C4OK A0M(Class cls, int i) {
        return new C4OK(cls, "friendship_status", i);
    }

    public static C4OW A0N() {
        return new C4OW(C94894Ou.A00, "count");
    }

    public static C4OW A0O() {
        return new C4OW(C95124Py.A00, "success");
    }

    public static C4OW A0P() {
        return new C4OW(C94754Oe.A00, "text");
    }

    public static C4OW A0Q() {
        return new C4OW(C67A.A00, "latest_reel_media");
    }

    public static C4OW A0T(C4Og c4Og) {
        return new C4OW(c4Og, "has_onboarded_to_text_post_app");
    }

    public static C4OW A0U(C4Og c4Og) {
        return new C4OW(c4Og, "length");
    }

    public static C4OW A0V(C4Og c4Og) {
        return new C4OW(c4Og, "offset");
    }

    public static C4OW A0W(C4Og c4Og) {
        return new C4OW(c4Og, "is_bestie");
    }

    public static C4OW A0Y(C4Og c4Og) {
        return new C4OW(c4Og, DevServerEntity.COLUMN_DESCRIPTION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JsonSerializer A0b(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC913345m abstractC913345m, int i) {
        if (i != 0) {
            return ((C46K) jsonSerializer).ALs(interfaceC65620ToB, abstractC913345m);
        }
        return jsonSerializer;
    }

    public static C60570R8k A0c(C914146b c914146b) {
        C60570R8k A12 = c914146b.A12(c914146b.A01);
        A12.A1J();
        return A12;
    }

    public static C66237U5h A0e(Object obj, int i) {
        return new C66237U5h(new C57560PgY(obj, i));
    }

    public static ArrayIndexOutOfBoundsException A0g(int i) {
        return new ArrayIndexOutOfBoundsException(AnonymousClass001.A0O("Index < 0: ", i));
    }

    public static Enum A0h(C2JS c2js) {
        return c2js.getOptionalEnumField(1, "error_step", EnumC61204Rh4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public static NullPointerException A0k(int i) {
        return new NullPointerException(AnonymousClass001.A0O("at index ", i));
    }

    public static Object A0l(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static String A0o(Parcel parcel, String str, int i, int i2, int i3) {
        if (i != i2) {
            AbstractC125725mK.A0C(parcel, i3);
            return str;
        }
        return AbstractC125725mK.A08(parcel, i3);
    }

    public static String A0r(String str) {
        return AbstractC002300n.A0d(str, " ", "", false);
    }

    public static String A0s(String str) {
        return str.replace('$', '.');
    }

    public static StringBuilder A0t() {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        return sb;
    }

    public static List A0z() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static List A10(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static java.util.Set A11() {
        return Collections.synchronizedSet(new HashSet());
    }

    public static InterfaceC09390do A13(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57238PbM(obj, i));
    }

    public static C09530e4 A14(Object obj, String str, String str2) {
        return new C09530e4(obj, new O77(str, str2));
    }

    public static void A15() {
        SystraceMessage.A00(SystraceMessage.A01, "", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
    }

    public static void A16(int i, int i2, char[] cArr, int i3) {
        cArr[i3] = (char) (((i & 31) << 6) | (i2 & 63));
    }

    public static void A17(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (((int) (j >> 56)) & 255);
    }

    public static void A18(BaseBundle baseBundle, String str, String str2, int i) {
        baseBundle.putString(AnonymousClass001.A0b(str, "#", i), str2);
    }

    public static void A19(Bundle bundle, C62697SMl c62697SMl) {
        bundle.putParcelable("logger_data", new FBPayLoggerData(c62697SMl));
    }

    public static void A1E(Parcel parcel, String str, int i, int i2) {
        if (str == null) {
            parcel.writeInt(i);
        } else {
            parcel.writeInt(i2);
            parcel.writeString(str);
        }
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, Map map) {
        c0Zx.A08("checkout_info", map);
        interfaceC02590Ai.AAQ(c0Zx, "event_payload");
    }

    public static void A1K(AnonymousClass182 anonymousClass182, JsonSerializer jsonSerializer, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        if (abstractC63023Sar == null) {
            jsonSerializer.A0A(anonymousClass182, abstractC913345m, obj);
        } else {
            jsonSerializer.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
        }
    }

    public static void A1L(BeanDeserializerBase beanDeserializerBase, BeanDeserializerBase beanDeserializerBase2) {
        beanDeserializerBase2.A01 = beanDeserializerBase.A01;
        beanDeserializerBase2.A00 = beanDeserializerBase.A00;
        beanDeserializerBase2.A04 = beanDeserializerBase.A04;
    }

    public static boolean A1T(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i != i2) {
            AbstractC125725mK.A0C(parcel, i3);
            return z;
        }
        return AbstractC125725mK.A0G(parcel, i3);
    }

    public static boolean A1V(InterfaceC28041Xi interfaceC28041Xi, Object obj, Object obj2) {
        return interfaceC28041Xi.apply(new ImmutableEntry(obj, obj2));
    }

    public static boolean A1W(Object obj, boolean z) {
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public static byte[] A1Y(Parcel parcel, byte[] bArr, int i, int i2, int i3) {
        if (i != i2) {
            AbstractC125725mK.A0C(parcel, i3);
            return bArr;
        }
        return AbstractC125725mK.A0H(parcel, i3);
    }

    public static byte[] A1Z(AbstractC64537TIt abstractC64537TIt) {
        if (abstractC64537TIt == null) {
            return null;
        }
        return abstractC64537TIt.A03();
    }

    public static Object[] A1a(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        return objArr;
    }

    public static Object[] A1b(Object[] objArr, int i) {
        Object obj = objArr[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) obj;
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static int A07(Parcel parcel, Object obj) {
        obj.getClass().getClassLoader();
        return parcel.readInt();
    }

    public static int A08(Object obj) {
        return Arrays.hashCode(new Object[]{obj});
    }

    public static int A09(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4, obj5});
    }

    public static int A0A(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.last();
    }

    public static int A0B(String str, StringBuilder sb, Object[] objArr, int i) {
        sb.append(str);
        int i2 = i + 1;
        sb.append(objArr[i]);
        return i2;
    }

    public static int A0C(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(jSONArray.getString(i));
        return i + 1;
    }

    public static long A0E(Matcher matcher, int i) {
        String group = matcher.group(i);
        group.getClass();
        return Long.parseLong(group);
    }

    public static SharedPreferences A0G(Context context, int i) {
        return C63289Sgo.A00(context, Integer.valueOf(i));
    }

    public static Bundle A0H(C2GC c2gc, String str, Map map) {
        c2gc.Chz(str, map);
        return new Bundle();
    }

    public static C58252li A0J(C62735SOb c62735SOb, T2N t2n) {
        C58252li A05 = t2n.A05(c62735SOb);
        C14360o3.A0C(A05, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.paymentmethod.model.PaymentMethodComponentData>>");
        return A05;
    }

    public static FbJsonField A0K(Class cls, String str) {
        return FbJsonField.jsonField(cls.getDeclaredField(str), (Class) null, (TIZ) null);
    }

    public static C4OW A0R(C4Og c4Og) {
        return new C4OW(c4Og, AbstractC65709Tsi.A01());
    }

    public static C4OW A0S(C4Og c4Og) {
        return new C4OW(c4Og, AbstractC50635MWw.A00());
    }

    public static C4OW A0X(C4Og c4Og) {
        return new C4OW(c4Og, AbstractC31188DnX.A01());
    }

    public static C05290Qb A0Z() {
        return C0b3.A00().A07();
    }

    public static AbstractC910944l A0a(AbstractC910944l abstractC910944l, int i) {
        AbstractC910944l A07 = abstractC910944l.A07(i);
        if (A07 == null) {
            return C910844k.A07;
        }
        return A07;
    }

    public static C1LC A0d(Parcel parcel, ImmutableCollection immutableCollection) {
        parcel.writeInt(immutableCollection.size());
        return immutableCollection.iterator();
    }

    public static File A0f(String str, String str2, File file) {
        return new File(file, AnonymousClass001.A0R(str, str2));
    }

    public static Integer A0i(Parcel parcel, int i) {
        return C05F.A00(i)[parcel.readInt()];
    }

    public static Long A0j(Parcel parcel) {
        return Long.valueOf(parcel.readLong());
    }

    public static String A0m(Context context, int i) {
        return IgNativeColorsModule.parseColorInteger(context.getColor(i));
    }

    public static String A0p(SK8 sk8, AbstractC64537TIt abstractC64537TIt) {
        byte[] A03 = abstractC64537TIt.A03();
        return sk8.A00(A03, A03.length);
    }

    public static String A0q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Method A0u(String str, String str2, AbstractMap abstractMap) {
        return (Method) abstractMap.get(AnonymousClass001.A0R(str, str2));
    }

    public static ProtocolException A0v(String str, String str2) {
        return new ProtocolException(AnonymousClass001.A0R(str, str2));
    }

    public static ArrayList A0w(List list, int i) {
        return new ArrayList(list.size() + i);
    }

    public static HashSet A0x(C63152Se0 c63152Se0) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, c63152Se0);
        return hashSet;
    }

    public static Iterator A0y(Collection collection) {
        return C63375Sim.A03(collection).iterator();
    }

    public static java.util.Set A12(ImmutableMap.Builder builder, Object obj, Object obj2, InterfaceC09390do interfaceC09390do) {
        builder.put(obj, obj2);
        return (java.util.Set) interfaceC09390do.getValue();
    }

    public static void A1C(Parcel parcel, Number number, int i) {
        parcel.writeInt(i);
        parcel.writeDouble(number.doubleValue());
    }

    public static void A1I(AbstractC02600Aj abstractC02600Aj, C0Zx c0Zx, String str) {
        c0Zx.A06("view_name", str);
        abstractC02600Aj.A0N(c0Zx, "event_payload");
    }

    public static void A1J(C0CA c0ca, boolean z) {
        C0CA.A00(c0ca, Boolean.valueOf(z), "is_default");
    }

    public static void A1M(C6FG c6fg, C102884kP c102884kP, C6FX c6fx, InterfaceC103384lE interfaceC103384lE, Object obj) {
        c6fx.A02(obj);
        C6FP.A03(c6fg, c102884kP, c6fx.A00(), interfaceC103384lE);
    }

    public static void A1N(Object obj, Object obj2, BitSet bitSet, Map map) {
        map.put(obj, obj2);
        bitSet.set(2);
    }

    public static void A1O(Object obj, Object obj2, BitSet bitSet, Map map) {
        map.put(obj, obj2);
        bitSet.set(3);
    }

    public static void A1P(String str, int i) {
        C0I2.A04("ReactNative", AnonymousClass001.A0O(str, i));
    }

    public static void A1Q(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1R(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", ");
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('=');
    }

    public static boolean A1X(Executable executable) {
        return Modifier.isPublic(executable.getModifiers());
    }
}
