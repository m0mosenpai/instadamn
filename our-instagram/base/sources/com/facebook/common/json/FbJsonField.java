package com.facebook.common.json;

import X.AbstractC166987dD;
import X.AbstractC63327Shb;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C102274j2;
import X.C16L;
import X.C16R;
import X.TID;
import X.TIZ;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class FbJsonField {
    public final Field A00;
    public final Method A01;

    /* loaded from: classes10.dex */
    public class BeanJsonField extends FbJsonField {
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:2:0x0000, B:4:0x0005, B:5:0x000b, B:7:0x0013, B:9:0x0017, B:11:0x002c, B:13:0x0039, B:15:0x004a, B:17:0x004e, B:18:0x0052, B:22:0x0060, B:23:0x006f, B:25:0x0075, B:29:0x008a, B:32:0x0095, B:35:0x005e, B:36:0x0059, B:37:0x0069, B:38:0x009e, B:40:0x002e), top: B:1:0x0000 }] */
        @Override // com.facebook.common.json.FbJsonField
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void deserialize(java.lang.Object r14, X.C16L r15, X.AnonymousClass469 r16) {
            /*
                r13 = this;
                java.lang.reflect.Method r3 = r13.A01     // Catch: java.lang.Exception -> La2
                r12 = 0
                if (r3 == 0) goto L2e
                java.lang.reflect.Type[] r0 = r3.getGenericParameterTypes()     // Catch: java.lang.Exception -> La2
                r2 = r0[r12]     // Catch: java.lang.Exception -> La2
            Lb:
                X.16R r0 = r15.A11()     // Catch: java.lang.Exception -> La2
                X.16R r1 = X.C16R.A0G     // Catch: java.lang.Exception -> La2
                if (r0 == r1) goto L9e
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Exception -> La2
                if (r0 == 0) goto L69
                r0 = r2
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0     // Catch: java.lang.Exception -> La2
                java.lang.reflect.Type r8 = r0.getRawType()     // Catch: java.lang.Exception -> La2
                java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> La2
                java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()     // Catch: java.lang.Exception -> La2
                java.lang.Class<com.google.common.collect.ImmutableList> r0 = com.google.common.collect.ImmutableList.class
                boolean r0 = r0.isAssignableFrom(r8)     // Catch: java.lang.Exception -> La2
                if (r0 == 0) goto L69
                int r0 = r4.length     // Catch: java.lang.Exception -> La2
                goto L35
            L2e:
                java.lang.reflect.Field r0 = r13.A00     // Catch: java.lang.Exception -> La2
                java.lang.reflect.Type r2 = r0.getGenericType()     // Catch: java.lang.Exception -> La2
                goto Lb
            L35:
                boolean r0 = X.AbstractC43593JPy.A1Y(r0)
                X.C18C.A0F(r0)     // Catch: java.lang.Exception -> La2
                X.44k r2 = X.C910844k.A0A     // Catch: java.lang.Exception -> La2
                r0 = r4[r12]     // Catch: java.lang.Exception -> La2
                X.44l r6 = r2.A09(r0)     // Catch: java.lang.Exception -> La2
                java.lang.reflect.TypeVariable[] r0 = r8.getTypeParameters()     // Catch: java.lang.Exception -> La2
                if (r0 == 0) goto L59
                int r2 = r0.length     // Catch: java.lang.Exception -> La2
                r0 = 1
                if (r2 != r0) goto L59
                X.44o r7 = X.C911244o.A01(r6, r8)     // Catch: java.lang.Exception -> La2
            L52:
                java.lang.Class r0 = r8.getSuperclass()     // Catch: java.lang.Exception -> La2
                if (r0 != 0) goto L5e
                goto L5c
            L59:
                X.44o r7 = X.C911244o.A04     // Catch: java.lang.Exception -> La2
                goto L52
            L5c:
                r5 = 0
                goto L60
            L5e:
                X.44s r5 = X.C910844k.A07     // Catch: java.lang.Exception -> La2
            L60:
                r9 = 0
                X.RD4 r4 = new X.RD4     // Catch: java.lang.Exception -> La2
                r10 = r9
                r11 = r9
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La2
                goto L6f
            L69:
                X.44k r0 = X.C910844k.A0A     // Catch: java.lang.Exception -> La2
                X.44l r4 = r0.A09(r2)     // Catch: java.lang.Exception -> La2
            L6f:
                X.16R r0 = r15.A11()     // Catch: java.lang.Exception -> La2
                if (r0 == r1) goto L9e
                X.44T r0 = r15.A1K()     // Catch: java.lang.Exception -> La2
                X.4j2 r0 = (X.C102274j2) r0     // Catch: java.lang.Exception -> La2
                r1 = r16
                com.fasterxml.jackson.databind.JsonDeserializer r0 = r0.A0K(r1, r4)     // Catch: java.lang.Exception -> La2
                java.lang.Object r2 = r0.A0D(r15, r1)     // Catch: java.lang.Exception -> La2
                if (r2 == 0) goto La1
                r1 = 1
                if (r3 == 0) goto L95
                r3.setAccessible(r1)     // Catch: java.lang.Exception -> La2
                java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> La2
                r3.invoke(r14, r0)     // Catch: java.lang.Exception -> La2
                return
            L95:
                java.lang.reflect.Field r0 = r13.A00     // Catch: java.lang.Exception -> La2
                r0.setAccessible(r1)     // Catch: java.lang.Exception -> La2
                r0.set(r14, r2)     // Catch: java.lang.Exception -> La2
                return
            L9e:
                r15.A0z()     // Catch: java.lang.Exception -> La2
            La1:
                return
            La2:
                r0 = move-exception
                X.AbstractC63327Shb.A03(r0)
                X.AbstractC63327Shb.A02(r0)
                X.00O r0 = X.C00O.createAndThrow()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.json.FbJsonField.BeanJsonField.deserialize(java.lang.Object, X.16L, X.469):void");
        }
    }

    /* loaded from: classes10.dex */
    public final class DoubleJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            double d = 0.0d;
            try {
                C16R A11 = c16l.A11();
                if (A11 == C16R.A0G) {
                    c16l.A0z();
                } else if (A11 == C16R.A0J && "NaN".equals(c16l.A1Q())) {
                    d = Double.NaN;
                } else {
                    d = c16l.A0U();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Double.valueOf(d));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setDouble(obj, d);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class FloatJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            float f = 0.0f;
            try {
                C16R A11 = c16l.A11();
                if (A11 == C16R.A0G) {
                    c16l.A0z();
                } else if (A11 == C16R.A0J && "NaN".equals(c16l.A1Q())) {
                    f = Float.NaN;
                } else {
                    f = c16l.A0h();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Float.valueOf(f));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setFloat(obj, f);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class ImmutableListJsonField extends FbJsonField {
        public TIZ A00;
        public Class A01;

        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            ImmutableListDeserializer immutableListDeserializer;
            ImmutableList immutableList;
            try {
                Class cls = this.A01;
                TIZ tiz = this.A00;
                if (c16l.A11() == C16R.A0G) {
                    immutableList = ImmutableList.of();
                } else {
                    if (cls == null) {
                        if (tiz != null) {
                            immutableListDeserializer = new ImmutableListDeserializer(((C102274j2) c16l.A1K()).A0M(anonymousClass469, tiz.A00));
                        } else {
                            throw AbstractC166987dD.A12("Need to set simple or generic inner list type!");
                        }
                    } else {
                        immutableListDeserializer = new ImmutableListDeserializer(cls);
                    }
                    immutableList = (ImmutableList) immutableListDeserializer.A0D(c16l, anonymousClass469);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, immutableList);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, immutableList);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    public static FbJsonField jsonField(Field field, TIZ tiz) {
        return jsonField(field, (Class) null, tiz);
    }

    public static FbJsonField jsonFieldWithCreator(Field field) {
        return new FbJsonField(field, null);
    }

    public abstract void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469);

    /* loaded from: classes10.dex */
    public final class BoolJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            try {
                boolean A0d = c16l.A0d();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Boolean.valueOf(A0d));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setBoolean(obj, A0d);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class IntJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            try {
                int A1D = c16l.A1D();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Integer.valueOf(A1D));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setInt(obj, A1D);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class ListJsonField extends FbJsonField {
        public TIZ A00;
        public Class A01;
        public JsonDeserializer A02;

        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            Object obj2;
            try {
                if (c16l.A11() == C16R.A0G) {
                    obj2 = AbstractC166987dD.A1E();
                } else {
                    JsonDeserializer jsonDeserializer = this.A02;
                    if (jsonDeserializer == null) {
                        Class cls = this.A01;
                        if (cls != null) {
                            jsonDeserializer = new ArrayListDeserializer(cls);
                        } else {
                            TIZ tiz = this.A00;
                            if (tiz != null) {
                                jsonDeserializer = new ArrayListDeserializer(((C102274j2) c16l.A1K()).A0M(anonymousClass469, tiz.A00));
                            } else {
                                throw AbstractC166987dD.A12("Need to set simple or generic inner list type!");
                            }
                        }
                        this.A02 = jsonDeserializer;
                    }
                    obj2 = (List) jsonDeserializer.A0D(c16l, anonymousClass469);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, obj2);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, obj2);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class LongJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            try {
                long A0y = c16l.A0y();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Long.valueOf(A0y));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setLong(obj, A0y);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class StringJsonField extends FbJsonField {
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, X.400, java.io.IOException] */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
            String A1P;
            try {
                if (c16l.A11() == C16R.A0G) {
                    c16l.A0z();
                    A1P = null;
                } else {
                    A1P = c16l.A1P();
                    if (A1P == null) {
                        TID A1H = c16l.A1H();
                        ?? iOException = new IOException("Failed to read text from Json stream", null);
                        iOException.A00 = A1H;
                        throw iOException;
                    }
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, A1P);
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.set(obj, A1P);
                }
            } catch (Exception e) {
                AbstractC63327Shb.A03(e);
                AbstractC63327Shb.A02(e);
                throw C00O.createAndThrow();
            }
        }
    }

    public FbJsonField(Field field, Method method) {
        this.A00 = field;
        this.A01 = method;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    public static FbJsonField jsonField(Field field, Class cls, TIZ tiz) {
        Class<?> type = field.getType();
        if (type == String.class) {
            return new FbJsonField(field, null);
        }
        if (type == Integer.TYPE) {
            return new FbJsonField(field, null);
        }
        if (type == Long.TYPE) {
            return new FbJsonField(field, null);
        }
        if (type == Boolean.TYPE) {
            return new FbJsonField(field, null);
        }
        if (type == Float.TYPE) {
            return new FbJsonField(field, null);
        }
        if (type == Double.TYPE) {
            return new FbJsonField(field, null);
        }
        if (type == ImmutableList.class) {
            ?? fbJsonField = new FbJsonField(field, null);
            fbJsonField.A01 = cls;
            fbJsonField.A00 = tiz;
            return fbJsonField;
        }
        if (type != List.class && type != ArrayList.class) {
            return new FbJsonField(field, null);
        }
        ?? fbJsonField2 = new FbJsonField(field, null);
        fbJsonField2.A01 = cls;
        fbJsonField2.A00 = tiz;
        return fbJsonField2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    public static FbJsonField jsonField(Method method, Class cls, TIZ tiz) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            Class<?> cls2 = parameterTypes[0];
            if (cls2 == String.class) {
                return new FbJsonField(null, method);
            }
            if (cls2 == Integer.TYPE) {
                return new FbJsonField(null, method);
            }
            if (cls2 == Long.TYPE) {
                return new FbJsonField(null, method);
            }
            if (cls2 == Boolean.TYPE) {
                return new FbJsonField(null, method);
            }
            if (cls2 == Float.TYPE) {
                return new FbJsonField(null, method);
            }
            if (cls2 == Double.TYPE) {
                return new FbJsonField(null, method);
            }
            if (cls2 == ImmutableList.class) {
                ?? fbJsonField = new FbJsonField(null, method);
                fbJsonField.A01 = cls;
                fbJsonField.A00 = tiz;
                return fbJsonField;
            }
            if (cls2 != List.class && cls2 != ArrayList.class) {
                return new FbJsonField(null, method);
            }
            ?? fbJsonField2 = new FbJsonField(null, method);
            fbJsonField2.A01 = cls;
            fbJsonField2.A00 = tiz;
            return fbJsonField2;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0g("Invalid setter type ", method.getName(), " Only setter with on input parameter is supported."));
    }

    public static FbJsonField jsonField(Field field, Class cls) {
        return jsonField(field, cls, (TIZ) null);
    }

    public static FbJsonField jsonField(Method method, TIZ tiz) {
        return jsonField(method, (Class) null, tiz);
    }

    public static FbJsonField jsonField(Method method, Class cls) {
        return jsonField(method, cls, (TIZ) null);
    }

    public static FbJsonField jsonField(Field field) {
        return jsonField(field, (Class) null, (TIZ) null);
    }

    public static FbJsonField jsonField(Method method) {
        return jsonField(method, (Class) null, (TIZ) null);
    }
}
