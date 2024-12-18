package X;

import android.database.Cursor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.8yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203048yM {
    public static final Map A00 = Collections.unmodifiableMap(new HashMap<EnumC200798uM, InterfaceC203078yP>() { // from class: X.8yN
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj != null && !(obj instanceof EnumC200798uM)) {
                return false;
            }
            return super.containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof InterfaceC203078yP)) {
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
            put(EnumC200798uM.FACEBOOK, new Object());
            put(EnumC200798uM.MESSENGER, new Object());
            put(EnumC200798uM.MESSENGER_WITH_LITE_PROVIDER, new Object());
            put(EnumC200798uM.FACEBOOK_LITE, new Object());
            put(EnumC200798uM.INSTAGRAM, new Object());
            put(EnumC200798uM.INSTAGRAM_WITH_V2_PROVIDER, new Object());
            EnumC200798uM enumC200798uM = EnumC200798uM.OCULUS;
            final EnumC200808uN enumC200808uN = EnumC200808uN.A0D;
            put(enumC200798uM, new InterfaceC203078yP(enumC200808uN) { // from class: X.8yS
                public final EnumC200808uN A00;

                @Override // X.InterfaceC203078yP
                public final ACJ F8N(Cursor cursor, EnumC200938ua enumC200938ua) {
                    C14360o3.A0B(enumC200938ua, 1);
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string != null && string2 != null) {
                            return new ACJ(string, string2, "FRL", new C25017B4t(), this.A00, enumC200938ua);
                        }
                        return null;
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM2) {
                    return null;
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8J(Cursor cursor) {
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string == null || string2 == null) {
                            return null;
                        }
                        return new C203128yU(string2, new C203118yT(string, null, null));
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN2, EnumC200938ua enumC200938ua) {
                    throw new RuntimeException("LiteProvider not used in Frl.");
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8M(Cursor cursor) {
                    throw new RuntimeException("LiteProvider not used in Frl");
                }

                {
                    this.A00 = enumC200808uN;
                }
            });
            EnumC200798uM enumC200798uM2 = EnumC200798uM.MWA;
            final EnumC200808uN enumC200808uN2 = EnumC200808uN.A0B;
            put(enumC200798uM2, new InterfaceC203078yP(enumC200808uN2) { // from class: X.8yS
                public final EnumC200808uN A00;

                @Override // X.InterfaceC203078yP
                public final ACJ F8N(Cursor cursor, EnumC200938ua enumC200938ua) {
                    C14360o3.A0B(enumC200938ua, 1);
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string != null && string2 != null) {
                            return new ACJ(string, string2, "FRL", new C25017B4t(), this.A00, enumC200938ua);
                        }
                        return null;
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM22) {
                    return null;
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8J(Cursor cursor) {
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string == null || string2 == null) {
                            return null;
                        }
                        return new C203128yU(string2, new C203118yT(string, null, null));
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN22, EnumC200938ua enumC200938ua) {
                    throw new RuntimeException("LiteProvider not used in Frl.");
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8M(Cursor cursor) {
                    throw new RuntimeException("LiteProvider not used in Frl");
                }

                {
                    this.A00 = enumC200808uN2;
                }
            });
            EnumC200798uM enumC200798uM3 = EnumC200798uM.MWA_DEBUG;
            final EnumC200808uN enumC200808uN3 = EnumC200808uN.A0C;
            put(enumC200798uM3, new InterfaceC203078yP(enumC200808uN3) { // from class: X.8yS
                public final EnumC200808uN A00;

                @Override // X.InterfaceC203078yP
                public final ACJ F8N(Cursor cursor, EnumC200938ua enumC200938ua) {
                    C14360o3.A0B(enumC200938ua, 1);
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string != null && string2 != null) {
                            return new ACJ(string, string2, "FRL", new C25017B4t(), this.A00, enumC200938ua);
                        }
                        return null;
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final FXDeviceItem F8O(Cursor cursor, EnumC46133KbX enumC46133KbX, EnumC200798uM enumC200798uM22) {
                    return null;
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8J(Cursor cursor) {
                    int columnIndex = cursor.getColumnIndex("uid");
                    int columnIndex2 = cursor.getColumnIndex("access_token");
                    if (columnIndex != -1 && columnIndex2 != -1) {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string == null || string2 == null) {
                            return null;
                        }
                        return new C203128yU(string2, new C203118yT(string, null, null));
                    }
                    throw new RuntimeException("Column not found.");
                }

                @Override // X.InterfaceC203078yP
                public final ACJ F8L(Cursor cursor, EnumC200808uN enumC200808uN22, EnumC200938ua enumC200938ua) {
                    throw new RuntimeException("LiteProvider not used in Frl.");
                }

                @Override // X.InterfaceC203078yP
                public final C203128yU F8M(Cursor cursor) {
                    throw new RuntimeException("LiteProvider not used in Frl");
                }

                {
                    this.A00 = enumC200808uN3;
                }
            });
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
            if (!z || (obj2 != null && !(obj2 instanceof InterfaceC203078yP))) {
                return false;
            }
            return super.remove(obj, obj2);
        }
    });
}
