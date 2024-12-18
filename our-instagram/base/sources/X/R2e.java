package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.intent.IntentModule;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class R2e extends AbstractC62966SZj {
    public final C63347Si4 A00;
    public final T0G A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0018. Please report as an issue. */
    private final T0F A00(ReadableArray readableArray) {
        List list;
        Object valueOf;
        double d;
        Object string;
        int A05;
        if (readableArray == null) {
            return null;
        }
        T0F t0f = new T0F();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    t0f.A00.add(null);
                case 1:
                    boolean z = readableArray.getBoolean(i);
                    list = t0f.A00;
                    valueOf = Boolean.valueOf(z);
                    list.add(valueOf);
                case 2:
                    d = readableArray.getDouble(i);
                    list = t0f.A00;
                    valueOf = Double.valueOf(d);
                    list.add(valueOf);
                case 3:
                    string = readableArray.getString(i);
                    t0f.A00.add(string);
                case 4:
                    ReadableMap map = readableArray.getMap(i);
                    if (map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        AbstractC62966SZj A00 = C63347Si4.A00(this.A00, map.getInt("nodeTag"));
                        if (A00 != null) {
                            if (A00 instanceof R2f) {
                                R2f r2f = (R2f) A00;
                                if (r2f instanceof R2y) {
                                    string = ((R2y) r2f).A02;
                                } else {
                                    string = null;
                                }
                                if (string instanceof Integer) {
                                    A05 = AbstractC166987dD.A0H(string);
                                } else if (!(string instanceof String)) {
                                    d = r2f.A05();
                                    list = t0f.A00;
                                    valueOf = Double.valueOf(d);
                                    list.add(valueOf);
                                }
                            } else if (A00 instanceof R2d) {
                                A05 = ((R2d) A00).A05();
                            }
                            t0f.pushInt(A05);
                        } else {
                            throw AbstractC166987dD.A12("Mapped value node does not exist");
                        }
                    } else {
                        string = A01(readableArray.getMap(i));
                    }
                    t0f.A00.add(string);
                    break;
                case 5:
                    string = A00(readableArray.getArray(i));
                    t0f.A00.add(string);
                default:
            }
        }
        return t0f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001f. Please report as an issue. */
    private final T0G A01(ReadableMap readableMap) {
        Map map;
        Boolean valueOf;
        double d;
        String string;
        Object obj;
        int A0H;
        if (readableMap == null) {
            return null;
        }
        T0G t0g = new T0G();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            switch (readableMap.getType(Csu).ordinal()) {
                case 0:
                    map = t0g.A00;
                    valueOf = null;
                    map.put(Csu, valueOf);
                case 1:
                    boolean z = readableMap.getBoolean(Csu);
                    map = t0g.A00;
                    valueOf = Boolean.valueOf(z);
                    map.put(Csu, valueOf);
                case 2:
                    d = readableMap.getDouble(Csu);
                    t0g.putDouble(Csu, d);
                case 3:
                    string = readableMap.getString(Csu);
                    t0g.putString(Csu, string);
                case 4:
                    ReadableMap map2 = readableMap.getMap(Csu);
                    if (map2 != null && map2.hasKey("nodeTag") && map2.getType("nodeTag") == ReadableType.Number) {
                        AbstractC62966SZj A00 = C63347Si4.A00(this.A00, map2.getInt("nodeTag"));
                        if (A00 != null) {
                            if (A00 instanceof R2f) {
                                R2f r2f = (R2f) A00;
                                if (r2f instanceof R2y) {
                                    obj = ((R2y) r2f).A02;
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof Integer) {
                                    A0H = AbstractC166987dD.A0H(obj);
                                } else if (obj instanceof String) {
                                    string = (String) obj;
                                    t0g.putString(Csu, string);
                                } else {
                                    d = r2f.A05();
                                    t0g.putDouble(Csu, d);
                                }
                            } else if (A00 instanceof R2d) {
                                A0H = ((R2d) A00).A05();
                            }
                            t0g.A01(Csu, A0H);
                        } else {
                            throw AbstractC166987dD.A12("Mapped value node does not exist");
                        }
                    } else {
                        t0g.putMap(Csu, A01(map2));
                    }
                    break;
                case 5:
                    t0g.putArray(Csu, A00(readableMap.getArray(Csu)));
            }
        }
        return t0g;
    }

    public R2e(C63347Si4 c63347Si4, ReadableMap readableMap) {
        this.A00 = c63347Si4;
        this.A01 = T0G.A00(readableMap);
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "ObjectAnimatedNode[", A1C);
        A1C.append("]: mConfig: ");
        return AbstractC166997dE.A0v(this.A01, A1C);
    }

    public final void A05(T0G t0g, String str) {
        AbstractC167017dG.A1N(str, t0g);
        T0G t0g2 = this.A01;
        ReadableType type = t0g2.getType(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        C14360o3.A07(type);
        if (type == ReadableType.Map) {
            t0g.putMap(str, A01(t0g2.getMap(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
        } else {
            if (type == ReadableType.Array) {
                t0g.putArray(str, A00(t0g2.getArray(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                return;
            }
            throw AbstractC166987dD.A12("Invalid value type for ObjectAnimatedNode");
        }
    }
}
