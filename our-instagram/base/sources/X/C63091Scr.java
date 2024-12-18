package X;

import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.Scr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63091Scr {
    public static final HashSet A00 = AbstractC166987dD.A1H();

    public static StdDeserializer A00(Class cls, String str) {
        int i;
        if (A00.contains(str)) {
            if (cls == File.class) {
                i = 1;
            } else if (cls == java.net.URL.class) {
                i = 2;
            } else if (cls == java.net.URI.class) {
                i = 3;
            } else if (cls == Class.class) {
                i = 4;
            } else if (cls == AbstractC910944l.class) {
                i = 5;
            } else if (cls == Currency.class) {
                i = 6;
            } else if (cls == Pattern.class) {
                i = 7;
            } else if (cls == Locale.class) {
                i = 8;
            } else if (cls == Charset.class) {
                i = 9;
            } else if (cls == TimeZone.class) {
                i = 10;
            } else if (cls == InetAddress.class) {
                i = 11;
            } else if (cls == InetSocketAddress.class) {
                i = 12;
            } else {
                if (cls == StringBuilder.class) {
                    return new FromStringDeserializer.StringBuilderDeserializer();
                }
                if (cls == StringBuffer.class) {
                    return new FromStringDeserializer.StringBufferDeserializer();
                }
                if (cls == UUID.class) {
                    return new UUIDDeserializer();
                }
                if (cls == StackTraceElement.class) {
                    return new StackTraceElementDeserializer();
                }
                if (cls == AtomicBoolean.class) {
                    return new AtomicBooleanDeserializer();
                }
                if (cls == AtomicInteger.class) {
                    return new AtomicIntegerDeserializer();
                }
                if (cls == AtomicLong.class) {
                    return new AtomicLongDeserializer();
                }
                if (cls == ByteBuffer.class) {
                    return new ByteBufferDeserializer();
                }
                if (cls == Void.class) {
                    return NullifyingDeserializer.A00;
                }
                return null;
            }
            return new FromStringDeserializer.Std(cls, i);
        }
        return null;
    }

    static {
        HashSet hashSet;
        int i = 0;
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        int i2 = 0;
        do {
            Class cls = clsArr[i2];
            hashSet = A00;
            hashSet.add(cls.getName());
            i2++;
        } while (i2 < 7);
        Class[] clsArr2 = {File.class, java.net.URL.class, java.net.URI.class, Class.class, AbstractC910944l.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
        do {
            hashSet.add(clsArr2[i].getName());
            i++;
        } while (i < 14);
    }
}
