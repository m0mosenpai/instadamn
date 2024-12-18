package X;

import com.facebook.graphservice.interfaces.FromStringAble;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2JS, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2JS extends TreeJNI {
    public static final C4OF Companion = new Object();
    public static final Map cachedASTs = new LinkedHashMap();
    public final InterfaceC09390do indexAccessorCache$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean coerceBoolean(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInt(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Integer) && !(obj instanceof Number)) {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        }
        return ((Number) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesFulfillSpread(String str, String str2, String str3, String str4, String str5) {
        if ((str2 != null && C14360o3.A0K(getBooleanVariable(str2), true)) || (str3 != null && !C14360o3.A0K(getBooleanVariable(str3), true))) {
            return false;
        }
        if (str != null && !isFulfilled(str)) {
            return false;
        }
        if (str4 != null) {
            return (str5 != null && C14360o3.A0K(getBooleanVariable(str5), false)) || isFieldSet(AnonymousClass001.A0g("is_defer_fulfilled(fragment_name:\"", str4, "\")"));
        }
        return true;
    }

    public final int A00(String str) {
        return getCoercedIntField(2, str);
    }

    public final C2JS A01(Class cls, int i) {
        return reinterpretRequired(0, cls, i);
    }

    public final C2JS A02(Class cls, String str, int i) {
        return getOptionalTreeField(1, str, cls, i);
    }

    public final C2JS A03(Class cls, String str, int i) {
        return getOptionalTreeField(0, str, cls, i);
    }

    public final C2JS A04(Class cls, String str, int i) {
        return getOptionalTreeField(2, str, cls, i);
    }

    public final C2JS A05(Class cls, String str, int i) {
        return getOptionalTreeField(0, str, cls, i);
    }

    public final ImmutableList A06(Class cls, String str, int i) {
        return getRequiredCompactedTreeListField(0, str, cls, i);
    }

    public final String A07(String str) {
        return getOptionalStringField(0, str);
    }

    public final String A08(String str) {
        return getOptionalStringField(1, str);
    }

    public final String A09(String str) {
        return getOptionalStringField(2, str);
    }

    public final String A0A(String str) {
        return getOptionalStringField(3, str);
    }

    public final String A0B(String str) {
        return getOptionalStringField(4, str);
    }

    public final String A0C(String str) {
        return getOptionalStringField(5, str);
    }

    public final List bubbledNullPaths(String str) {
        C14360o3.A0B(str, 0);
        C4OM[] c4omArr = cachedSelectionSet().A00;
        ArrayList<C4OM> arrayList = new ArrayList();
        int length = c4omArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C4OM c4om = c4omArr[i];
            int i3 = i2 + 1;
            if (!isSelectionOptionalOrNonnull(i2, c4om)) {
                arrayList.add(c4om);
            }
            i++;
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (C4OM c4om2 : arrayList) {
            arrayList2.add(bubbledNullPathsForNullSelection(AnonymousClass001.A0T(str, c4om2.AGi(), '.'), c4om2));
        }
        return AbstractC06950Ym.A1F(arrayList2);
    }

    public final boolean getCoercedBooleanField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Boolean) intoWithCache(i, new C207429Fv(str, this, 1), new C206999Ee(this, 22))).booleanValue();
    }

    public final ImmutableList getCoercedCompactedBooleanListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 3), new C65075Td4(this, 35));
    }

    public final ImmutableList getCoercedCompactedDoubleListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 4), new C65075Td4(this, 36));
    }

    public final ImmutableList getCoercedCompactedEnumListField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 5), new C65076Td9(30, this, r6));
    }

    public final ImmutableList getCoercedCompactedIntListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 6), new C65075Td4(this, 37));
    }

    public final ImmutableList getCoercedCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 7), new C50371MLy(this, fromStringAble, str2, str3, 0));
    }

    public final ImmutableList getCoercedCompactedStringListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 8), new C65075Td4(this, 38));
    }

    public final ImmutableList getCoercedCompactedTimeListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 9), new C65075Td4(this, 39));
    }

    public final ImmutableList getCoercedCompactedTreeListField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        Object intoWithCache = intoWithCache(i, new C50253MHi(cls, this, str, 1), C25100B8w.A00);
        C14360o3.A07(intoWithCache);
        return (ImmutableList) intoWithCache;
    }

    public final double getCoercedDoubleField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) intoWithCache(i, new C207429Fv(str, this, 2), new C206999Ee(this, 23))).doubleValue();
    }

    public final Enum getCoercedEnumField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        Object intoWithCache = intoWithCache(i, new C57258Pbg(str, this, 10), new C65075Td4(r6, 40));
        C14360o3.A07(intoWithCache);
        return (Enum) intoWithCache;
    }

    public final int getCoercedIntField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) intoWithCache(i, new C207429Fv(str, this, 3), new C206999Ee(this, 24))).intValue();
    }

    public final String getCoercedStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        Object intoWithCache = intoWithCache(i, new C57258Pbg(str, this, 11), new MI9(fromStringAble, str2, str3, 1));
        C14360o3.A07(intoWithCache);
        return (String) intoWithCache;
    }

    public final long getCoercedTimeField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) intoWithCache(i, new C207429Fv(str, this, 4), new C206999Ee(this, 25))).longValue();
    }

    public final Boolean getOptionalBooleanField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (Boolean) withCache(i, new C57258Pbg(str, this, 12));
    }

    public final ImmutableList getOptionalCompactedBooleanListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) withCache(i, new C57258Pbg(str, this, 13));
    }

    public final ImmutableList getOptionalCompactedDoubleListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) withCache(i, new C57258Pbg(str, this, 14));
    }

    public final ImmutableList getOptionalCompactedEnumListField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        return (ImmutableList) intoWithCache(i, new C207429Fv(str, this, 5), new C9F3(25, this, r6));
    }

    public final ImmutableList getOptionalCompactedIntListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) withCache(i, new C57258Pbg(str, this, 15));
    }

    public final ODZ getOptionalCompactedPaginableListEdgesField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return (ODZ) withCache(i, new C9G2(this, cls, str, 0));
    }

    public final ImmutableList getOptionalCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 16), new C50371MLy(this, fromStringAble, str2, str3, 1));
    }

    public final ImmutableList getOptionalCompactedStringListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) withCache(i, new C207429Fv(str, this, 6));
    }

    public final ImmutableList getOptionalCompactedTimeListField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (ImmutableList) withCache(i, new C57258Pbg(str, this, 17));
    }

    public final ImmutableList getOptionalCompactedTreeListField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return (ImmutableList) withCache(i, new C9G2(this, cls, str, 1));
    }

    public final Double getOptionalDoubleField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (Double) withCache(i, new C57258Pbg(str, this, 18));
    }

    public final Enum getOptionalEnumField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        return (Enum) intoWithCache(i, new C207429Fv(str, this, 7), new C206999Ee(r6, 26));
    }

    public final Integer getOptionalIntField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (Integer) withCache(i, new C57258Pbg(str, this, 19));
    }

    public final ODZ getOptionalPaginableListEdges(String str, Class cls) {
        ImmutableList optionalTreeList;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(cls, 1);
        TreeJNI treeValue = getTreeValue("page_info", TreeJNI.class);
        if (treeValue == null || (optionalTreeList = getOptionalTreeList(str, cls)) == null) {
            return null;
        }
        String stringValue = getStringValue("*connection_state_key");
        if (stringValue == null) {
            stringValue = "";
        }
        treeValue.getBooleanValue("has_previous_page");
        boolean booleanValue = treeValue.getBooleanValue("has_next_page");
        getBooleanValue("*pending_prev_edge");
        boolean booleanValue2 = getBooleanValue("*pending_next_edge");
        getStringValue("*prev_page_uuid");
        String stringValue2 = getStringValue("*next_page_uuid");
        String stringValue3 = getStringValue("*query_schema");
        getBooleanValue("*had_error");
        getStringValue("*error_message");
        return new ODZ(optionalTreeList, stringValue, stringValue2, stringValue3, booleanValue, booleanValue2);
    }

    public final String getOptionalStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        return (String) intoWithCache(i, new C57258Pbg(str, this, 20), new MI9(fromStringAble, str2, str3, 2));
    }

    public final String getOptionalStringField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (String) withCache(i, new C207429Fv(str, this, 8));
    }

    public final Long getOptionalTimeField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (Long) withCache(i, new C57258Pbg(str, this, 21));
    }

    public final C2JS getOptionalTreeField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return (C2JS) withCache(i, new C9G2(this, cls, str, 2));
    }

    public final ODZ getPaginableListEdges(String str, Class cls) {
        boolean z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(cls, 1);
        TreeJNI treeValue = getTreeValue("page_info", TreeJNI.class);
        String stringValue = getStringValue("*connection_state_key");
        if (stringValue == null) {
            stringValue = "";
        }
        ImmutableList treeList = getTreeList(str, cls);
        C14360o3.A07(treeList);
        if (treeValue != null) {
            treeValue.getBooleanValue("has_previous_page");
            z = treeValue.getBooleanValue("has_next_page");
        } else {
            z = false;
        }
        getBooleanValue("*pending_prev_edge");
        boolean booleanValue = getBooleanValue("*pending_next_edge");
        getStringValue("*prev_page_uuid");
        String stringValue2 = getStringValue("*next_page_uuid");
        String stringValue3 = getStringValue("*query_schema");
        getBooleanValue("*had_error");
        getStringValue("*error_message");
        return new ODZ(treeList, stringValue, stringValue2, stringValue3, z, booleanValue);
    }

    public final boolean getRequiredBooleanField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Boolean) withCache(i, new C207429Fv(str, this, 9))).booleanValue();
    }

    public final ImmutableList getRequiredCompactedBooleanListField(int i, String str) {
        C14360o3.A0B(str, 1);
        Object withCache = withCache(i, new C57258Pbg(str, this, 22));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedDoubleListField(int i, String str) {
        C14360o3.A0B(str, 1);
        Object withCache = withCache(i, new C57258Pbg(str, this, 23));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedEnumListField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        return (ImmutableList) intoWithCache(i, new C207429Fv(str, this, 10), new C9F3(26, this, r6));
    }

    public final ImmutableList getRequiredCompactedIntListField(int i, String str) {
        C14360o3.A0B(str, 1);
        Object withCache = withCache(i, new C57258Pbg(str, this, 24));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ODZ getRequiredCompactedPaginableListEdgesField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return (ODZ) withCache(i, new C9G2(this, cls, str, 3));
    }

    public final ImmutableList getRequiredCompactedStringDefListField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        return (ImmutableList) intoWithCache(i, new C57258Pbg(str, this, 25), new C50371MLy(this, fromStringAble, str2, str3, 2));
    }

    public final ImmutableList getRequiredCompactedStringListField(int i, String str) {
        C14360o3.A0B(str, 1);
        Object withCache = withCache(i, new C207429Fv(str, this, 11));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedTimeListField(int i, String str) {
        C14360o3.A0B(str, 1);
        Object withCache = withCache(i, new C57258Pbg(str, this, 26));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final ImmutableList getRequiredCompactedTreeListField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        Object withCache = withCache(i, new C9G2(this, cls, str, 4));
        C14360o3.A07(withCache);
        return (ImmutableList) withCache;
    }

    public final double getRequiredDoubleField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) withCache(i, new C207429Fv(str, this, 12))).doubleValue();
    }

    public final Enum getRequiredEnumField(int i, String str, Enum r6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(r6, 2);
        Object intoWithCache = intoWithCache(i, new C207429Fv(str, this, 13), new C206999Ee(r6, 27));
        C14360o3.A07(intoWithCache);
        return (Enum) intoWithCache;
    }

    public final int getRequiredIntField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) withCache(i, new C207429Fv(str, this, 14))).intValue();
    }

    public final String getRequiredStringDefField(int i, String str, String str2, String str3, FromStringAble fromStringAble) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(fromStringAble, 4);
        Object intoWithCache = intoWithCache(i, new C57258Pbg(str, this, 27), new MI9(fromStringAble, str2, str3, 3));
        C14360o3.A07(intoWithCache);
        return (String) intoWithCache;
    }

    public final String getRequiredStringField(int i, String str) {
        C14360o3.A0B(str, 1);
        return (String) withCache(i, new C207429Fv(str, this, 15));
    }

    public final long getRequiredTimeField(int i, String str) {
        C14360o3.A0B(str, 1);
        return ((Number) withCache(i, new C207429Fv(str, this, 16))).longValue();
    }

    public final C2JS getRequiredTreeField(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return getOptionalTreeField(i, str, cls, i2);
    }

    public abstract C4OU modelSelectionSet();

    public final C2JS reinterpretIfFulfills(int i, Class cls, int i2, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(cls, 1);
        return (C2JS) withCache(i, new C9GH(this, cls, str, str2, str3, str4, str5, 0));
    }

    public final C2JS reinterpretIfFulfillsType(int i, String str, Class cls, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(cls, 2);
        return reinterpretIfFulfills(i, cls, i2, str, null, null, null, null);
    }

    public final C2JS reinterpretOptional(int i, Class cls, int i2) {
        C14360o3.A0B(cls, 1);
        return (C2JS) intoWithCache(i, new C9F8(18, cls, this), C5N4.A00);
    }

    public final C2JS reinterpretPlugin(Class cls, int i) {
        C14360o3.A0B(cls, 0);
        C2JS c2js = (C2JS) reinterpret(cls);
        if (AbstractC40541uN.A00 && c2js != null && !c2js.areAllSelectionsOptionalOrNonnull()) {
            return null;
        }
        return c2js;
    }

    public final C2JS reinterpretRequired(int i, Class cls, int i2) {
        C14360o3.A0B(cls, 1);
        Object withCache = withCache(i, new C9F8(19, cls, this));
        C14360o3.A07(withCache);
        return (C2JS) withCache;
    }

    private final List bubbledNullPathsForInlineSpread(String str, C126315nS c126315nS) {
        C2JS c2js = (C2JS) reinterpret(c126315nS.A01);
        if (c2js == null) {
            List singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return c2js.bubbledNullPaths(str);
    }

    private final List bubbledNullPathsForNullLinkedField(String str, C4OK c4ok) {
        C4OR A00 = C5SO.A00(c4ok.A01);
        if (A00 instanceof C4OO) {
            C2JS c2js = (C2JS) getTreeValue(((C4OL) c4ok).A00, c4ok.A02);
            if (c2js == null) {
                List singletonList = Collections.singletonList(str);
                C14360o3.A07(singletonList);
                return singletonList;
            }
            return c2js.bubbledNullPaths(str);
        }
        if (!(A00 instanceof C5SN) && !(A00 instanceof C23471Aai)) {
            throw new RuntimeException();
        }
        return bubbledNullPathsForNullLinkedListField(str, c4ok);
    }

    private final List bubbledNullPathsForNullLinkedListField(String str, C4OK c4ok) {
        ImmutableList treeList = getTreeList(((C4OL) c4ok).A00, c4ok.A02);
        if (treeList == null) {
            List singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(treeList, 10));
        int i = 0;
        Iterator<E> it = treeList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('[');
            sb.append(i);
            sb.append(']');
            arrayList.add(((C2JS) next).bubbledNullPaths(sb.toString()));
            i = i2;
        }
        return AbstractC06950Ym.A1F(arrayList);
    }

    private final List bubbledNullPathsForNullSelection(String str, C4OM c4om) {
        C4OM c4om2;
        if (c4om instanceof C4OW) {
            List singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        if (c4om instanceof C4OK) {
            return bubbledNullPathsForNullLinkedField(str, (C4OK) c4om);
        }
        if (c4om instanceof C126315nS) {
            return bubbledNullPathsForInlineSpread(str, (C126315nS) c4om);
        }
        if (c4om instanceof C126885oS) {
            c4om2 = ((C126885oS) c4om).A00;
        } else if (c4om instanceof C126895oT) {
            c4om2 = ((C126895oT) c4om).A00;
        } else if (c4om instanceof C126845oO) {
            c4om2 = ((C126845oO) c4om).A00;
        } else if (c4om instanceof C65928TwZ) {
            c4om2 = ((C65928TwZ) c4om).A00;
        } else {
            throw new RuntimeException();
        }
        return bubbledNullPathsForNullSelection(str, c4om2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4OU cachedSelectionSet() {
        int i = this.typeTag;
        if (i == 0) {
            return modelSelectionSet();
        }
        Map map = cachedASTs;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = modelSelectionSet();
            map.put(valueOf, obj);
        }
        return (C4OU) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double coerceDouble(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (!(obj instanceof Double) && !(obj instanceof Number)) {
            if (obj instanceof String) {
                return Double.parseDouble((String) obj);
            }
            return 0.0d;
        }
        return ((Number) obj).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmutableList coerceList(Object obj) {
        ImmutableList immutableList;
        if (!(obj instanceof ImmutableList) || (immutableList = (ImmutableList) obj) == null) {
            ImmutableList of = ImmutableList.of();
            C14360o3.A07(of);
            return of;
        }
        return immutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long coerceTime(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (!(obj instanceof Long) && !(obj instanceof Number)) {
            if (obj instanceof String) {
                return Long.parseLong((String) obj);
            }
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private final Object[] getIndexAccessorCache() {
        return (Object[]) this.indexAccessorCache$delegate.getValue();
    }

    private final boolean isRequiredFulfilledInlineSpreadNonnull(int i, C126315nS c126315nS) {
        if (reinterpretOptional(i, c126315nS.A01, c126315nS.A00) == null) {
            return false;
        }
        return true;
    }

    private final boolean isRequiredLinkedFieldNonnull(int i, C4OK c4ok, C4OR c4or) {
        Object optionalCompactedPaginableListEdgesField;
        String str = ((C4OL) c4ok).A00;
        if (c4or instanceof C4OO) {
            optionalCompactedPaginableListEdgesField = getOptionalTreeField(i, str, c4ok.A02, c4ok.A00);
        } else if (c4or instanceof C5SN) {
            optionalCompactedPaginableListEdgesField = getOptionalCompactedTreeListField(i, str, c4ok.A02, c4ok.A00);
        } else if (c4or instanceof C23471Aai) {
            optionalCompactedPaginableListEdgesField = getOptionalCompactedPaginableListEdgesField(i, str, c4ok.A02, c4ok.A00);
        } else {
            throw new RuntimeException();
        }
        if (optionalCompactedPaginableListEdgesField == null) {
            return false;
        }
        return true;
    }

    private final boolean isRequiredScalarFieldNonnull(C4OW c4ow, InterfaceC94764Of interfaceC94764Of) {
        if (!(interfaceC94764Of instanceof C4Oh) && !(interfaceC94764Of instanceof C94784Oj)) {
            throw new RuntimeException();
        }
        return hasFieldValue(((C4OL) c4ow).A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isSelectionExpectedToBeFulfilled(X.C4OM r6) {
        /*
            r5 = this;
            boolean r2 = r6 instanceof X.InterfaceC126865oQ
            r4 = 0
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r2 == 0) goto L2d
            boolean r0 = r6 instanceof X.InterfaceC126855oP
            if (r0 == 0) goto L7d
            r3 = r6
            X.5oP r3 = (X.InterfaceC126855oP) r3
            boolean r0 = r3 instanceof X.C126885oS
            if (r0 == 0) goto L2f
            X.5oS r6 = (X.C126885oS) r6
            java.lang.String r0 = r6.A01
            java.lang.Boolean r0 = r5.getBooleanVariable(r0)
            boolean r0 = X.C14360o3.A0K(r0, r1)
        L21:
            if (r0 == 0) goto L2e
        L23:
            X.4OM r0 = r3.BHt()
            boolean r0 = r5.isSelectionExpectedToBeFulfilled(r0)
            if (r0 == 0) goto L2e
        L2d:
            r4 = 1
        L2e:
            return r4
        L2f:
            boolean r0 = r3 instanceof X.C126895oT
            if (r0 == 0) goto L42
            X.5oT r6 = (X.C126895oT) r6
            java.lang.String r0 = r6.A01
            java.lang.Boolean r0 = r5.getBooleanVariable(r0)
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 != 0) goto L2e
            goto L23
        L42:
            boolean r0 = r3 instanceof X.C126845oO
            if (r0 == 0) goto L4f
            X.5oO r6 = (X.C126845oO) r6
            java.lang.String r0 = r6.A01
            boolean r0 = r5.isFulfilled(r0)
            goto L21
        L4f:
            boolean r0 = r3 instanceof X.C65928TwZ
            if (r0 == 0) goto L77
            X.TwZ r6 = (X.C65928TwZ) r6
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L67
            java.lang.Boolean r1 = r5.getBooleanVariable(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L23
        L67:
            java.lang.String r2 = "is_defer_fulfilled(fragment_name:\""
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "\")"
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            boolean r0 = r5.isFieldSet(r0)
            goto L21
        L77:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L7d:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JS.isSelectionExpectedToBeFulfilled(X.4OM):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isSelectionOptionalOrNonnull(int r4, X.C4OM r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof X.C4OW
            r2 = 0
            if (r0 == 0) goto L1b
            X.4OW r5 = (X.C4OW) r5
            X.4Og r1 = r5.A00
            boolean r0 = r1 instanceof X.C4OX
            r0 = r0 ^ 1
            if (r0 != 0) goto L19
            X.4Of r0 = X.AbstractC94864Or.A00(r1)
            boolean r0 = r3.isRequiredScalarFieldNonnull(r5, r0)
        L17:
            if (r0 == 0) goto L1a
        L19:
            r2 = 1
        L1a:
            return r2
        L1b:
            boolean r0 = r5 instanceof X.C4OK
            if (r0 == 0) goto L32
            X.4OK r5 = (X.C4OK) r5
            X.4OS r1 = r5.A01
            boolean r0 = r1 instanceof X.C4OX
            r0 = r0 ^ 1
            if (r0 != 0) goto L19
            X.4OR r0 = X.C5SO.A00(r1)
            boolean r0 = r3.isRequiredLinkedFieldNonnull(r4, r5, r0)
            goto L17
        L32:
            boolean r0 = r5 instanceof X.C126315nS
            if (r0 == 0) goto L3d
            X.5nS r5 = (X.C126315nS) r5
            boolean r2 = r3.isRequiredFulfilledInlineSpreadNonnull(r4, r5)
            return r2
        L3d:
            boolean r0 = r5 instanceof X.C126885oS
            if (r0 == 0) goto L50
            boolean r0 = r3.isSelectionExpectedToBeFulfilled(r5)
            if (r0 == 0) goto L19
            X.5oS r5 = (X.C126885oS) r5
            X.4OM r0 = r5.A00
        L4b:
            boolean r0 = r3.isSelectionOptionalOrNonnull(r4, r0)
            goto L17
        L50:
            boolean r0 = r5 instanceof X.C126895oT
            if (r0 == 0) goto L5f
            boolean r0 = r3.isSelectionExpectedToBeFulfilled(r5)
            if (r0 == 0) goto L19
            X.5oT r5 = (X.C126895oT) r5
            X.4OM r0 = r5.A00
            goto L4b
        L5f:
            boolean r0 = r5 instanceof X.C126845oO
            if (r0 == 0) goto L6e
            boolean r0 = r3.isSelectionExpectedToBeFulfilled(r5)
            if (r0 == 0) goto L19
            X.5oO r5 = (X.C126845oO) r5
            X.5nT r0 = r5.A00
            goto L4b
        L6e:
            boolean r0 = r5 instanceof X.C65928TwZ
            if (r0 == 0) goto L7d
            boolean r0 = r3.isSelectionExpectedToBeFulfilled(r5)
            if (r0 == 0) goto L19
            X.TwZ r5 = (X.C65928TwZ) r5
            X.5nT r0 = r5.A00
            goto L4b
        L7d:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JS.isSelectionOptionalOrNonnull(int, X.4OM):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmutableList parseEnumList(ImmutableList immutableList, Enum r5) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C1LC it = immutableList.iterator();
        while (it.hasNext()) {
            Enum parseEnum = TreeJNI.parseEnum((String) it.next(), r5);
            C14360o3.A07(parseEnum);
            builder.add((Object) parseEnum);
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmutableList parseStringDefList(ImmutableList immutableList, String str, String str2, FromStringAble fromStringAble) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        C1LC it = immutableList.iterator();
        while (it.hasNext()) {
            TreeJNI.parseStringDef((String) it.next(), str, str2, fromStringAble);
            C14360o3.A07(str2);
            builder.add((Object) str2);
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    private final Object withCache(int i, InterfaceC16820sZ interfaceC16820sZ) {
        return intoWithCache(i, interfaceC16820sZ, C94734Oa.A00);
    }

    public final String A0D(String str) {
        return getOptionalStringField(8, str);
    }

    public C2JS(int i) {
        super(i);
        this.indexAccessorCache$delegate = AbstractC09440dt.A00(EnumC09460dv.A03, new C206979Ec(this, 22));
    }

    private final Object intoWithCache(int i, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        if (C14360o3.A0K(getIndexAccessorCache()[i], C4Ob.A00)) {
            getIndexAccessorCache()[i] = interfaceC16660sJ.invoke(interfaceC16820sZ.invoke());
        }
        return getIndexAccessorCache()[i];
    }

    public final boolean areAllSelectionsOptionalOrNonnull() {
        Iterator it = AbstractC009903n.A0L(cachedSelectionSet().A00).iterator();
        while (it.hasNext()) {
            C0eP c0eP = (C0eP) it.next();
            if (!isSelectionOptionalOrNonnull(c0eP.A00, (C4OM) c0eP.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.pando.TreeJNI$Edge, java.lang.Object] */
    @Override // com.facebook.pando.TreeJNI
    public TreeJNI.Edge[] getEdgeFields() {
        C4OM[] c4omArr = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (C4OM c4om : c4omArr) {
            C4OK A00 = W6P.A00(c4om);
            if (A00 != null) {
                String str = ((C4OL) A00).A00;
                Class cls = A00.A02;
                C14360o3.A0C(cls, "null cannot be cast to non-null type java.lang.Class<out com.facebook.pando.TreeWithGraphQL>");
                boolean z = A00.A01.ACg() instanceof InterfaceC94794Ok;
                ?? obj = new Object();
                obj.field = str;
                obj.treeClass = cls;
                obj.isPlural = z;
                arrayList.add(obj);
            }
        }
        return (TreeJNI.Edge[]) arrayList.toArray(new TreeJNI.Edge[0]);
    }

    @Override // com.facebook.pando.TreeJNI
    public String[] getScalarFields() {
        C4OM[] c4omArr = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (C4OM c4om : c4omArr) {
            C4OW A01 = W6P.A01(c4om);
            if (A01 != null) {
                arrayList.add(((C4OL) A01).A00);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.pando.TreeJNI$Spread, java.lang.Object] */
    @Override // com.facebook.pando.TreeJNI
    public TreeJNI.Spread[] getSpreads() {
        C4OM[] c4omArr = cachedSelectionSet().A00;
        ArrayList arrayList = new ArrayList();
        for (C4OM c4om : c4omArr) {
            InterfaceC126325nT A02 = W6P.A02(c4om);
            if (A02 != null) {
                Class Cpm = A02.Cpm();
                ?? obj = new Object();
                obj.treeClass = Cpm;
                arrayList.add(obj);
            }
        }
        return (TreeJNI.Spread[]) arrayList.toArray(new TreeJNI.Spread[0]);
    }
}
