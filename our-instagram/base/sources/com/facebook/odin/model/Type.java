package com.facebook.odin.model;

import X.AbstractC12190kN;
import com.facebook.react.modules.toast.ToastModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Type {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Type[] A01;
    public static final Type A02;
    public static final Type A03;
    public static final Type A04;
    public static final Type A05;
    public static final Type A06;
    public static final Type A07;
    public static final Type A08;
    public static final Type A09;
    public static final Type A0A;
    public static final Type A0B;
    public static final Type A0C;
    public static final Type A0D;
    public static final Type A0E;
    public static final Type A0F;

    static {
        Type type = new Type(ToastModule.DURATION_LONG_KEY, 0);
        A09 = type;
        Type type2 = new Type("DOUBLE", 1);
        A06 = type2;
        Type type3 = new Type("STRING", 2);
        A0D = type3;
        Type type4 = new Type("BOOLEAN", 3);
        A02 = type4;
        Type type5 = new Type("STRING_LIST", 4);
        A0E = type5;
        Type type6 = new Type("LONG_LIST", 5);
        A0A = type6;
        Type type7 = new Type("DOUBLE_LIST", 6);
        A07 = type7;
        Type type8 = new Type("BOOLEAN_LIST", 7);
        A03 = type8;
        Type type9 = new Type("STRING_MAP", 8);
        A0F = type9;
        Type type10 = new Type("LONG_MAP", 9);
        A0B = type10;
        Type type11 = new Type("DOUBLE_MAP", 10);
        A08 = type11;
        Type type12 = new Type("BOOLEAN_MAP", 11);
        A04 = type12;
        Type type13 = new Type("SERVER_CONTEXT", 12);
        A0C = type13;
        Type type14 = new Type("CLIENT_CONTEXT", 13);
        A05 = type14;
        Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, new Type("SERVER_AND_CLIENT_CONTEXT", 14)};
        A01 = typeArr;
        A00 = AbstractC12190kN.A00(typeArr);
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) A01.clone();
    }

    public Type(String str, int i) {
    }
}
