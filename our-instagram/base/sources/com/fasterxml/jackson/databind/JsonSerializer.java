package com.fasterxml.jackson.databind;

import X.AbstractC63023Sar;
import X.AbstractC913245l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C102314j6;
import X.C911944v;
import X.C914146b;
import X.EnumC912645f;
import X.SXY;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class JsonSerializer {
    public boolean A06() {
        return false;
    }

    public JsonSerializer A07(SXY sxy) {
        return this;
    }

    public boolean A08() {
        return false;
    }

    /* loaded from: classes10.dex */
    public abstract class None extends JsonSerializer {
        public None() {
            throw C00O.createAndThrow();
        }
    }

    public Class A05() {
        if (this instanceof StdSerializer) {
            return ((StdSerializer) this).A00;
        }
        return null;
    }

    public void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Number number;
        int intValue;
        long timeInMillis;
        String name;
        boolean z;
        boolean A0U;
        if (this instanceof StringSerializer) {
            name = (String) obj;
        } else {
            if (this instanceof BooleanSerializer) {
                z = Boolean.TRUE.equals(obj);
            } else {
                if (this instanceof NumberSerializers$FloatSerializer) {
                    number = (Number) obj;
                } else {
                    if (this instanceof NullSerializer) {
                        anonymousClass182.A0b();
                        return;
                    }
                    if (this instanceof TokenBufferSerializer) {
                        ((C914146b) obj).A13(anonymousClass182);
                        return;
                    }
                    if (this instanceof ToStringSerializerBase) {
                        name = ((ToStringSerializerBase) this).A0E(obj);
                    } else {
                        if (this instanceof ToEmptyObjectSerializer) {
                            ToEmptyObjectSerializer toEmptyObjectSerializer = (ToEmptyObjectSerializer) this;
                            if (toEmptyObjectSerializer instanceof UnknownSerializer) {
                                if (abstractC913345m.A05.A0C(EnumC912645f.FAIL_ON_EMPTY_BEANS)) {
                                    abstractC913345m.A09(String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()), toEmptyObjectSerializer.A00);
                                    throw C00O.createAndThrow();
                                }
                            }
                            anonymousClass182.A0K(obj, 0);
                            anonymousClass182.A0a();
                            return;
                        }
                        if (this instanceof FailingSerializer) {
                            throw new C102314j6(((AbstractC913245l) abstractC913345m).A00, ((FailingSerializer) this).A00, null);
                        }
                        if (this instanceof UUIDSerializer) {
                            UUID uuid = (UUID) obj;
                            Boolean bool = ((UUIDSerializer) this).A00;
                            if (bool != null) {
                                A0U = bool.booleanValue();
                            } else {
                                if (!(anonymousClass182 instanceof C914146b)) {
                                    A0U = anonymousClass182.A0U();
                                }
                                char[] cArr = new char[36];
                                long mostSignificantBits = uuid.getMostSignificantBits();
                                int i = (int) (mostSignificantBits >> 32);
                                UUIDSerializer.A04(cArr, i >> 16, 0);
                                UUIDSerializer.A04(cArr, i, 4);
                                cArr[8] = '-';
                                int i2 = (int) mostSignificantBits;
                                UUIDSerializer.A04(cArr, i2 >>> 16, 9);
                                cArr[13] = '-';
                                UUIDSerializer.A04(cArr, i2, 14);
                                cArr[18] = '-';
                                long leastSignificantBits = uuid.getLeastSignificantBits();
                                UUIDSerializer.A04(cArr, (int) (leastSignificantBits >>> 48), 19);
                                cArr[23] = '-';
                                UUIDSerializer.A04(cArr, (int) (leastSignificantBits >>> 32), 24);
                                int i3 = (int) leastSignificantBits;
                                UUIDSerializer.A04(cArr, i3 >> 16, 28);
                                UUIDSerializer.A04(cArr, i3, 32);
                                anonymousClass182.A10(cArr, 0, 36);
                                return;
                            }
                            if (A0U) {
                                byte[] bArr = new byte[16];
                                long mostSignificantBits2 = uuid.getMostSignificantBits();
                                long leastSignificantBits2 = uuid.getLeastSignificantBits();
                                UUIDSerializer.A03((int) (mostSignificantBits2 >> 32), bArr, 0);
                                UUIDSerializer.A03((int) mostSignificantBits2, bArr, 4);
                                UUIDSerializer.A03((int) (leastSignificantBits2 >> 32), bArr, 8);
                                UUIDSerializer.A03((int) leastSignificantBits2, bArr, 12);
                                anonymousClass182.A0j(C911944v.A01, bArr, 0, 16);
                                return;
                            }
                            char[] cArr2 = new char[36];
                            long mostSignificantBits3 = uuid.getMostSignificantBits();
                            int i4 = (int) (mostSignificantBits3 >> 32);
                            UUIDSerializer.A04(cArr2, i4 >> 16, 0);
                            UUIDSerializer.A04(cArr2, i4, 4);
                            cArr2[8] = '-';
                            int i22 = (int) mostSignificantBits3;
                            UUIDSerializer.A04(cArr2, i22 >>> 16, 9);
                            cArr2[13] = '-';
                            UUIDSerializer.A04(cArr2, i22, 14);
                            cArr2[18] = '-';
                            long leastSignificantBits3 = uuid.getLeastSignificantBits();
                            UUIDSerializer.A04(cArr2, (int) (leastSignificantBits3 >>> 48), 19);
                            cArr2[23] = '-';
                            UUIDSerializer.A04(cArr2, (int) (leastSignificantBits3 >>> 32), 24);
                            int i32 = (int) leastSignificantBits3;
                            UUIDSerializer.A04(cArr2, i32 >> 16, 28);
                            UUIDSerializer.A04(cArr2, i32, 32);
                            anonymousClass182.A10(cArr2, 0, 36);
                            return;
                        }
                        if (this instanceof StdJdkSerializers$AtomicLongSerializer) {
                            timeInMillis = ((AtomicLong) obj).get();
                        } else {
                            if (this instanceof StdJdkSerializers$AtomicIntegerSerializer) {
                                intValue = ((AtomicInteger) obj).get();
                            } else if (this instanceof StdJdkSerializers$AtomicBooleanSerializer) {
                                z = ((AtomicBoolean) obj).get();
                            } else {
                                if (this instanceof NumberSerializers$ShortSerializer) {
                                    anonymousClass182.A0x(((Number) obj).shortValue());
                                    return;
                                }
                                if (this instanceof NumberSerializers$LongSerializer) {
                                    timeInMillis = ((Number) obj).longValue();
                                } else {
                                    if (!(this instanceof NumberSerializers$IntegerSerializer) && !(this instanceof NumberSerializers$IntLikeSerializer)) {
                                        if (this instanceof NumberSerializers$DoubleSerializer) {
                                            number = (Number) obj;
                                        } else if (this instanceof NumberSerializer) {
                                            number = (Number) obj;
                                            if (number instanceof BigDecimal) {
                                                anonymousClass182.A0v((BigDecimal) number);
                                                return;
                                            }
                                            if (number instanceof BigInteger) {
                                                anonymousClass182.A0w((BigInteger) number);
                                                return;
                                            }
                                            if (number instanceof Long) {
                                                timeInMillis = number.longValue();
                                            } else if (!(number instanceof Double)) {
                                                if (!(number instanceof Float)) {
                                                    if (!(number instanceof Integer) && !(number instanceof Byte) && !(number instanceof Short)) {
                                                        anonymousClass182.A0s(number.toString());
                                                        return;
                                                    }
                                                }
                                            }
                                        } else if (this instanceof FileSerializer) {
                                            name = ((File) obj).getAbsolutePath();
                                        } else if (this instanceof ClassSerializer) {
                                            name = ((Class) obj).getName();
                                        } else {
                                            DateTimeSerializerBase dateTimeSerializerBase = (DateTimeSerializerBase) this;
                                            if (this instanceof DateSerializer) {
                                                Date date = (Date) obj;
                                                if (dateTimeSerializerBase.A0G(abstractC913345m)) {
                                                    if (date != null) {
                                                        timeInMillis = date.getTime();
                                                    }
                                                    timeInMillis = 0;
                                                } else {
                                                    dateTimeSerializerBase.A0F(anonymousClass182, abstractC913345m, date);
                                                    return;
                                                }
                                            } else {
                                                Calendar calendar = (Calendar) obj;
                                                if (dateTimeSerializerBase.A0G(abstractC913345m)) {
                                                    if (calendar != null) {
                                                        timeInMillis = calendar.getTimeInMillis();
                                                    }
                                                    timeInMillis = 0;
                                                } else {
                                                    dateTimeSerializerBase.A0F(anonymousClass182, abstractC913345m, calendar.getTime());
                                                    return;
                                                }
                                            }
                                        }
                                        anonymousClass182.A0f(number.doubleValue());
                                        return;
                                    }
                                    number = (Number) obj;
                                    intValue = number.intValue();
                                }
                            }
                            anonymousClass182.A0h(intValue);
                            return;
                        }
                        anonymousClass182.A0i(timeInMillis);
                        return;
                    }
                }
                anonymousClass182.A0g(number.floatValue());
                return;
            }
            anonymousClass182.A0y(z);
            return;
        }
        anonymousClass182.A0u(name);
    }

    public boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        String str;
        if (!(this instanceof ToEmptyObjectSerializer)) {
            if (this instanceof ToStringSerializerBase) {
                str = ((ToStringSerializerBase) this).A0E(obj);
            } else {
                if (this instanceof UUIDSerializer) {
                    UUID uuid = (UUID) obj;
                    if (uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(this instanceof StringSerializer)) {
                    if ((this instanceof DateTimeSerializerBase) || obj != null) {
                        return false;
                    }
                    return true;
                }
                str = (String) obj;
            }
            return str.isEmpty();
        }
        return true;
    }

    public void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Class<?> A05 = A05();
        if (A05 == null) {
            A05 = obj.getClass();
        }
        abstractC913345m.A09(String.format("Type id handling not implemented for type %s (by serializer of type %s)", A05.getName(), getClass().getName()), A05);
        throw C00O.createAndThrow();
    }
}
