package X;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BytesValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumValue;
import com.google.protobuf.Field;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.ListValue;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Value;
import com.oculus.applinks.LinkAddress;
import com.oculus.applinks.LinkAppDeviceIdentityRequest;
import com.oculus.applinks.LinkAppDeviceIdentityResponse;
import com.oculus.applinks.LinkAppLinkInfoRequest;
import com.oculus.applinks.LinkAppLinkInfoResponse;
import com.oculus.applinks.LinkAppRegisterRequest;
import com.oculus.applinks.LinkAppRegisterResponse;
import com.oculus.applinks.LinkAppRequest;
import com.oculus.applinks.LinkAppResponse;
import com.oculus.applinks.LinkedAppConnectedEvent;
import com.oculus.applinks.LinkedAppDisconnectedEvent;
import com.oculus.applinks.UnlinkAppRequest;
import com.oculus.applinks.UnlinkAppResponse;
import com.oculus.atc.CreateSoftApNetwork;
import com.oculus.atc.CreateWifiDirectNetwork;
import com.oculus.atc.DestroySoftApNetwork;
import com.oculus.atc.DestroySoftApNetworkResult;
import com.oculus.atc.DestroyWifiDirectNetwork;
import com.oculus.atc.DestroyWifiDirectNetworkResult;
import com.oculus.atc.EnableEncryption;
import com.oculus.atc.EndLinkSetup;
import com.oculus.atc.EndWifiSession;
import com.oculus.atc.JoinAccessPoint;
import com.oculus.atc.JoinAccessPointResult;
import com.oculus.atc.JoinWifiDirectGroup;
import com.oculus.atc.JoinWifiDirectGroupResult;
import com.oculus.atc.LePairingInfo;
import com.oculus.atc.LeaveAccessPoint;
import com.oculus.atc.LeaveAccessPointResult;
import com.oculus.atc.LeaveWifiDirectGroup;
import com.oculus.atc.LeaveWifiDirectGroupResult;
import com.oculus.atc.ManifestComplete;
import com.oculus.atc.NetworkAddress;
import com.oculus.atc.RequestEncryption;
import com.oculus.atc.SetLinkMessage;
import com.oculus.atc.SetManifestAuthorityKey;
import com.oculus.atc.SetSessionInfo;
import com.oculus.atc.SetWifiProperties;
import com.oculus.atc.SetWifiPropertiesResult;
import com.oculus.atc.SoftApClientAddressUpdatedEvent;
import com.oculus.atc.SoftApClientConnectedEvent;
import com.oculus.atc.SoftApClientDisconnectedEvent;
import com.oculus.atc.SoftApCredentials;
import com.oculus.atc.SoftApNetworkInfo;
import com.oculus.atc.SwitchLink;
import com.oculus.atc.WifiDirectNetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RYn extends TEQ {
    public static Map defaultInstanceMap = AbstractC58318PtA.A14();
    public C63022Saq unknownFields = C63022Saq.A05;
    public int memoizedSerializedSize = -1;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.IOException, X.4L5] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.IOException, X.4L5] */
    public static RYn A04(RYn rYn, byte[] bArr) {
        C4L5 c4l5;
        int length = bArr.length;
        C63271SgV A00 = C63271SgV.A00();
        RYn rYn2 = (RYn) rYn.A0K(C05F.A0N, null, null);
        try {
            InterfaceC65596Tnf A0f = AbstractC58320PtC.A0f(rYn2);
            A0f.CpQ(new C62906SWn(A00), rYn2, bArr, 0, length);
            A0f.Cmk(rYn2);
            if (rYn2.memoizedHashCode == 0) {
                A0A(rYn2);
                return rYn2;
            }
            throw new RuntimeException();
        } catch (C4L5 e) {
            boolean z = e.A01;
            c4l5 = e;
            if (z) {
                ?? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                c4l5 = iOException;
            }
            c4l5.A00 = rYn2;
            throw c4l5;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C4L5) {
                throw e2.getCause();
            }
            ?? iOException2 = new IOException(e2.getMessage(), e2);
            iOException2.A00 = null;
            c4l5 = iOException2;
            c4l5.A00 = rYn2;
            throw c4l5;
        } catch (IndexOutOfBoundsException unused) {
            C4L5 A02 = C4L5.A02();
            A02.A00 = rYn2;
            throw A02;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.IOException, X.4L5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.IOException, X.4L5] */
    public static RYn A01(AbstractC63036SbB abstractC63036SbB, C63271SgV c63271SgV, RYn rYn) {
        C4L5 c4l5;
        RYn rYn2 = (RYn) rYn.A0K(C05F.A0N, null, null);
        try {
            InterfaceC65596Tnf A0f = AbstractC58320PtC.A0f(rYn2);
            C63401SjW c63401SjW = abstractC63036SbB.A01;
            if (c63401SjW == null) {
                c63401SjW = new C63401SjW(abstractC63036SbB);
            }
            A0f.CpP(c63401SjW, c63271SgV, rYn2);
            A0f.Cmk(rYn2);
            return rYn2;
        } catch (C4L5 e) {
            boolean z = e.A01;
            c4l5 = e;
            if (z) {
                ?? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                c4l5 = iOException;
            }
            c4l5.A00 = rYn2;
            throw c4l5;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C4L5) {
                throw e2.getCause();
            }
            ?? iOException2 = new IOException(e2.getMessage(), e2);
            iOException2.A00 = null;
            c4l5 = iOException2;
            c4l5.A00 = rYn2;
            throw c4l5;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C4L5) {
                throw e3.getCause();
            }
            throw e3;
        }
    }

    public static RYn A02(RYn rYn, InputStream inputStream) {
        RYn A01 = A01(new RWM(inputStream), C63271SgV.A00(), rYn);
        A0A(A01);
        return A01;
    }

    public static C62590SHq A07(TEQ teq, String str, Object[] objArr) {
        return new C62590SHq(teq, str, objArr);
    }

    public static void A0B(RYn rYn, Class cls) {
        defaultInstanceMap.put(cls, rYn);
    }

    public static final boolean A0C(RYn rYn) {
        byte byteValue = ((Number) rYn.A0K(C05F.A00, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CWb = AbstractC58320PtC.A0f(rYn).CWb(rYn);
        Integer num = C05F.A01;
        Object obj = null;
        if (CWb) {
            obj = rYn;
        }
        rYn.A0K(num, obj, null);
        return CWb;
    }

    public final AbstractC60877RXa A0I() {
        return (AbstractC60877RXa) A0K(C05F.A0Y, null, null);
    }

    public final AbstractC60877RXa A0J() {
        AbstractC60877RXa abstractC60877RXa = (AbstractC60877RXa) A0K(C05F.A0Y, null, null);
        abstractC60877RXa.A05(this);
        return abstractC60877RXa;
    }

    @Override // X.InterfaceC65445TkH
    public final /* bridge */ /* synthetic */ RYn AwI() {
        return (RYn) A0K(C05F.A0j, null, null);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return SYX.A02.A00(cls).AT0(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i == 0) {
            int CME = AbstractC58320PtC.A0f(this).CME(this);
            this.memoizedHashCode = CME;
            return CME;
        }
        return i;
    }

    public static RYn A03(RYn rYn, ByteBuffer byteBuffer) {
        AbstractC63036SbB A06;
        C63271SgV A00 = C63271SgV.A00();
        if (byteBuffer.hasArray()) {
            A06 = AbstractC63036SbB.A06(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (byteBuffer.isDirect() && UnsafeUtil.A05) {
            A06 = new RWL(byteBuffer);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            A06 = AbstractC63036SbB.A06(bArr, 0, remaining);
        }
        RYn A01 = A01(A06, A00, rYn);
        A0A(A01);
        A0A(A01);
        return A01;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TZ8, X.RWC] */
    public static RWC A05(InterfaceC65672Tr2 interfaceC65672Tr2) {
        int A01 = AbstractC58320PtC.A01(interfaceC65672Tr2);
        RWC rwc = (RWC) interfaceC65672Tr2;
        if (A01 >= rwc.A00) {
            int[] copyOf = Arrays.copyOf(rwc.A01, A01);
            int i = rwc.A00;
            ?? tz8 = new TZ8();
            tz8.A01 = copyOf;
            tz8.A00 = i;
            return tz8;
        }
        throw AbstractC58318PtA.A0Y();
    }

    public static InterfaceC65691TsD A06(InterfaceC65691TsD interfaceC65691TsD) {
        return interfaceC65691TsD.Cq5(AbstractC58320PtC.A01(interfaceC65691TsD));
    }

    public static C62590SHq A08(TEQ teq, String str, Object[] objArr) {
        return A07(teq, str, objArr);
    }

    public static Object A09(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    throw AbstractC58318PtA.A0e("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw cause;
            }
            throw cause;
        }
    }

    public static void A0A(RYn rYn) {
        if (A0C(rYn)) {
            return;
        }
        C4L5 A0e = AbstractC58320PtC.A0e(new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
        A0e.A00 = rYn;
        throw A0e;
    }

    public final String toString() {
        StringBuilder A0u = AbstractC58323PtF.A0u(super.toString());
        AbstractC63075Sbx.A01(this, A0u, 0);
        return A0u.toString();
    }

    public Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        InterfaceC50386MMo interfaceC50386MMo2;
        InterfaceC50386MMo interfaceC50386MMo3;
        InterfaceC50386MMo interfaceC50386MMo4;
        InterfaceC50386MMo interfaceC50386MMo5;
        InterfaceC50386MMo interfaceC50386MMo6;
        InterfaceC50386MMo interfaceC50386MMo7;
        InterfaceC50386MMo interfaceC50386MMo8;
        InterfaceC50386MMo interfaceC50386MMo9;
        InterfaceC50386MMo interfaceC50386MMo10;
        InterfaceC50386MMo interfaceC50386MMo11;
        InterfaceC50386MMo interfaceC50386MMo12;
        InterfaceC50386MMo interfaceC50386MMo13;
        InterfaceC50386MMo interfaceC50386MMo14;
        InterfaceC50386MMo interfaceC50386MMo15;
        InterfaceC50386MMo interfaceC50386MMo16;
        InterfaceC50386MMo interfaceC50386MMo17;
        InterfaceC50386MMo interfaceC50386MMo18;
        InterfaceC50386MMo interfaceC50386MMo19;
        InterfaceC50386MMo interfaceC50386MMo20;
        InterfaceC50386MMo interfaceC50386MMo21;
        InterfaceC50386MMo interfaceC50386MMo22;
        InterfaceC50386MMo interfaceC50386MMo23;
        InterfaceC50386MMo interfaceC50386MMo24;
        InterfaceC50386MMo interfaceC50386MMo25;
        InterfaceC50386MMo interfaceC50386MMo26;
        InterfaceC50386MMo interfaceC50386MMo27;
        InterfaceC50386MMo interfaceC50386MMo28;
        InterfaceC50386MMo interfaceC50386MMo29;
        InterfaceC50386MMo interfaceC50386MMo30;
        InterfaceC50386MMo interfaceC50386MMo31;
        InterfaceC50386MMo interfaceC50386MMo32;
        InterfaceC50386MMo interfaceC50386MMo33;
        InterfaceC50386MMo interfaceC50386MMo34;
        InterfaceC50386MMo interfaceC50386MMo35;
        InterfaceC50386MMo interfaceC50386MMo36;
        InterfaceC50386MMo interfaceC50386MMo37;
        InterfaceC50386MMo interfaceC50386MMo38;
        InterfaceC50386MMo interfaceC50386MMo39;
        InterfaceC50386MMo interfaceC50386MMo40;
        InterfaceC50386MMo interfaceC50386MMo41;
        InterfaceC50386MMo interfaceC50386MMo42;
        InterfaceC50386MMo interfaceC50386MMo43;
        InterfaceC50386MMo interfaceC50386MMo44;
        InterfaceC50386MMo interfaceC50386MMo45;
        InterfaceC50386MMo interfaceC50386MMo46;
        InterfaceC50386MMo interfaceC50386MMo47;
        InterfaceC50386MMo interfaceC50386MMo48;
        InterfaceC50386MMo interfaceC50386MMo49;
        InterfaceC50386MMo interfaceC50386MMo50;
        InterfaceC50386MMo interfaceC50386MMo51;
        InterfaceC50386MMo interfaceC50386MMo52;
        InterfaceC50386MMo interfaceC50386MMo53;
        InterfaceC50386MMo interfaceC50386MMo54;
        InterfaceC50386MMo interfaceC50386MMo55;
        InterfaceC50386MMo interfaceC50386MMo56;
        InterfaceC50386MMo interfaceC50386MMo57;
        InterfaceC50386MMo interfaceC50386MMo58;
        InterfaceC50386MMo interfaceC50386MMo59;
        InterfaceC50386MMo interfaceC50386MMo60;
        InterfaceC50386MMo interfaceC50386MMo61;
        InterfaceC50386MMo interfaceC50386MMo62;
        InterfaceC50386MMo interfaceC50386MMo63;
        InterfaceC50386MMo interfaceC50386MMo64;
        InterfaceC50386MMo interfaceC50386MMo65;
        InterfaceC50386MMo interfaceC50386MMo66;
        InterfaceC50386MMo interfaceC50386MMo67;
        InterfaceC50386MMo interfaceC50386MMo68;
        InterfaceC50386MMo interfaceC50386MMo69;
        InterfaceC50386MMo interfaceC50386MMo70;
        InterfaceC50386MMo interfaceC50386MMo71;
        InterfaceC50386MMo interfaceC50386MMo72;
        InterfaceC50386MMo interfaceC50386MMo73;
        if (this instanceof LinkAppRegisterRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRegisterRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "appPublicKey_"});
                case 3:
                    return new LinkAppRegisterRequest();
                case 4:
                    return new C60871RWu();
                case 5:
                    return LinkAppRegisterRequest.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo74 = LinkAppRegisterRequest.PARSER;
                    if (interfaceC50386MMo74 == null) {
                        synchronized (LinkAppRegisterRequest.class) {
                            interfaceC50386MMo73 = LinkAppRegisterRequest.PARSER;
                            if (interfaceC50386MMo73 == null) {
                                C63271SgV c63271SgV = TES.A01;
                                interfaceC50386MMo73 = AbstractC43592JPx.A0J(LinkAppRegisterRequest.DEFAULT_INSTANCE);
                                LinkAppRegisterRequest.PARSER = interfaceC50386MMo73;
                            }
                        }
                        return interfaceC50386MMo73;
                    }
                    return interfaceC50386MMo74;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof WifiDirectNetworkInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(WifiDirectNetworkInfo.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\t\u0004\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "credentials_", "portNumber_"});
                case 3:
                    return new WifiDirectNetworkInfo();
                case 4:
                    return new RXY();
                case 5:
                    return WifiDirectNetworkInfo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo75 = WifiDirectNetworkInfo.PARSER;
                    if (interfaceC50386MMo75 == null) {
                        synchronized (WifiDirectNetworkInfo.class) {
                            interfaceC50386MMo72 = WifiDirectNetworkInfo.PARSER;
                            if (interfaceC50386MMo72 == null) {
                                C63271SgV c63271SgV2 = TES.A01;
                                interfaceC50386MMo72 = AbstractC43592JPx.A0J(WifiDirectNetworkInfo.DEFAULT_INSTANCE);
                                WifiDirectNetworkInfo.PARSER = interfaceC50386MMo72;
                            }
                        }
                        return interfaceC50386MMo72;
                    }
                    return interfaceC50386MMo75;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof WifiDirectNetworkInfo.Credentials) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"networkName_", "passphrase_"});
                case 3:
                    return new WifiDirectNetworkInfo.Credentials();
                case 4:
                    return new RXZ();
                case 5:
                    return WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo76 = WifiDirectNetworkInfo.Credentials.PARSER;
                    if (interfaceC50386MMo76 == null) {
                        synchronized (WifiDirectNetworkInfo.Credentials.class) {
                            interfaceC50386MMo71 = WifiDirectNetworkInfo.Credentials.PARSER;
                            if (interfaceC50386MMo71 == null) {
                                C63271SgV c63271SgV3 = TES.A01;
                                interfaceC50386MMo71 = AbstractC43592JPx.A0J(WifiDirectNetworkInfo.Credentials.DEFAULT_INSTANCE);
                                WifiDirectNetworkInfo.Credentials.PARSER = interfaceC50386MMo71;
                            }
                        }
                        return interfaceC50386MMo71;
                    }
                    return interfaceC50386MMo76;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SwitchLink) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SwitchLink.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"target_"});
                case 3:
                    return new SwitchLink();
                case 4:
                    return new RXX();
                case 5:
                    return SwitchLink.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo77 = SwitchLink.PARSER;
                    if (interfaceC50386MMo77 == null) {
                        synchronized (SwitchLink.class) {
                            interfaceC50386MMo70 = SwitchLink.PARSER;
                            if (interfaceC50386MMo70 == null) {
                                C63271SgV c63271SgV4 = TES.A01;
                                interfaceC50386MMo70 = AbstractC43592JPx.A0J(SwitchLink.DEFAULT_INSTANCE);
                                SwitchLink.PARSER = interfaceC50386MMo70;
                            }
                        }
                        return interfaceC50386MMo70;
                    }
                    return interfaceC50386MMo77;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SoftApNetworkInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApNetworkInfo.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\t\u0004\u000b\u0005\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "credentials_", "portNumber_", "channel_"});
                case 3:
                    return new SoftApNetworkInfo();
                case 4:
                    return new RXW();
                case 5:
                    return SoftApNetworkInfo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo78 = SoftApNetworkInfo.PARSER;
                    if (interfaceC50386MMo78 == null) {
                        synchronized (SoftApNetworkInfo.class) {
                            interfaceC50386MMo69 = SoftApNetworkInfo.PARSER;
                            if (interfaceC50386MMo69 == null) {
                                C63271SgV c63271SgV5 = TES.A01;
                                interfaceC50386MMo69 = AbstractC43592JPx.A0J(SoftApNetworkInfo.DEFAULT_INSTANCE);
                                SoftApNetworkInfo.PARSER = interfaceC50386MMo69;
                            }
                        }
                        return interfaceC50386MMo69;
                    }
                    return interfaceC50386MMo78;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SoftApCredentials) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApCredentials.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"ssid_", "password_"});
                case 3:
                    return new SoftApCredentials();
                case 4:
                    return new RXV();
                case 5:
                    return SoftApCredentials.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo79 = SoftApCredentials.PARSER;
                    if (interfaceC50386MMo79 == null) {
                        synchronized (SoftApCredentials.class) {
                            interfaceC50386MMo68 = SoftApCredentials.PARSER;
                            if (interfaceC50386MMo68 == null) {
                                C63271SgV c63271SgV6 = TES.A01;
                                interfaceC50386MMo68 = AbstractC43592JPx.A0J(SoftApCredentials.DEFAULT_INSTANCE);
                                SoftApCredentials.PARSER = interfaceC50386MMo68;
                            }
                        }
                        return interfaceC50386MMo68;
                    }
                    return interfaceC50386MMo79;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SoftApClientDisconnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientDisconnectedEvent.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RXU();
                case 5:
                    return SoftApClientDisconnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo80 = SoftApClientDisconnectedEvent.PARSER;
                    if (interfaceC50386MMo80 == null) {
                        synchronized (SoftApClientDisconnectedEvent.class) {
                            interfaceC50386MMo67 = SoftApClientDisconnectedEvent.PARSER;
                            if (interfaceC50386MMo67 == null) {
                                C63271SgV c63271SgV7 = TES.A01;
                                interfaceC50386MMo67 = AbstractC43592JPx.A0J(SoftApClientDisconnectedEvent.DEFAULT_INSTANCE);
                                SoftApClientDisconnectedEvent.PARSER = interfaceC50386MMo67;
                            }
                        }
                        return interfaceC50386MMo67;
                    }
                    return interfaceC50386MMo80;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SoftApClientConnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientConnectedEvent.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RXT();
                case 5:
                    return SoftApClientConnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo81 = SoftApClientConnectedEvent.PARSER;
                    if (interfaceC50386MMo81 == null) {
                        synchronized (SoftApClientConnectedEvent.class) {
                            interfaceC50386MMo66 = SoftApClientConnectedEvent.PARSER;
                            if (interfaceC50386MMo66 == null) {
                                C63271SgV c63271SgV8 = TES.A01;
                                interfaceC50386MMo66 = AbstractC43592JPx.A0J(SoftApClientConnectedEvent.DEFAULT_INSTANCE);
                                SoftApClientConnectedEvent.PARSER = interfaceC50386MMo66;
                            }
                        }
                        return interfaceC50386MMo66;
                    }
                    return interfaceC50386MMo81;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SoftApClientAddressUpdatedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"addresses_", NetworkAddress.class});
                case 3:
                    return new SoftApClientAddressUpdatedEvent();
                case 4:
                    return new RXS();
                case 5:
                    return SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo82 = SoftApClientAddressUpdatedEvent.PARSER;
                    if (interfaceC50386MMo82 == null) {
                        synchronized (SoftApClientAddressUpdatedEvent.class) {
                            interfaceC50386MMo65 = SoftApClientAddressUpdatedEvent.PARSER;
                            if (interfaceC50386MMo65 == null) {
                                C63271SgV c63271SgV9 = TES.A01;
                                interfaceC50386MMo65 = AbstractC43592JPx.A0J(SoftApClientAddressUpdatedEvent.DEFAULT_INSTANCE);
                                SoftApClientAddressUpdatedEvent.PARSER = interfaceC50386MMo65;
                            }
                        }
                        return interfaceC50386MMo65;
                    }
                    return interfaceC50386MMo82;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SetWifiPropertiesResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetWifiPropertiesResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RXR();
                case 5:
                    return SetWifiPropertiesResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo83 = SetWifiPropertiesResult.PARSER;
                    if (interfaceC50386MMo83 == null) {
                        synchronized (SetWifiPropertiesResult.class) {
                            interfaceC50386MMo64 = SetWifiPropertiesResult.PARSER;
                            if (interfaceC50386MMo64 == null) {
                                C63271SgV c63271SgV10 = TES.A01;
                                interfaceC50386MMo64 = AbstractC43592JPx.A0J(SetWifiPropertiesResult.DEFAULT_INSTANCE);
                                SetWifiPropertiesResult.PARSER = interfaceC50386MMo64;
                            }
                        }
                        return interfaceC50386MMo64;
                    }
                    return interfaceC50386MMo83;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SetWifiProperties) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetWifiProperties.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"countryCode_"});
                case 3:
                    return new SetWifiProperties();
                case 4:
                    return new RXQ();
                case 5:
                    return SetWifiProperties.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo84 = SetWifiProperties.PARSER;
                    if (interfaceC50386MMo84 == null) {
                        synchronized (SetWifiProperties.class) {
                            interfaceC50386MMo63 = SetWifiProperties.PARSER;
                            if (interfaceC50386MMo63 == null) {
                                C63271SgV c63271SgV11 = TES.A01;
                                interfaceC50386MMo63 = AbstractC43592JPx.A0J(SetWifiProperties.DEFAULT_INSTANCE);
                                SetWifiProperties.PARSER = interfaceC50386MMo63;
                            }
                        }
                        return interfaceC50386MMo63;
                    }
                    return interfaceC50386MMo84;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SetSessionInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetSessionInfo.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"uuid_"});
                case 3:
                    return new SetSessionInfo();
                case 4:
                    return new RXP();
                case 5:
                    return SetSessionInfo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo85 = SetSessionInfo.PARSER;
                    if (interfaceC50386MMo85 == null) {
                        synchronized (SetSessionInfo.class) {
                            interfaceC50386MMo62 = SetSessionInfo.PARSER;
                            if (interfaceC50386MMo62 == null) {
                                C63271SgV c63271SgV12 = TES.A01;
                                interfaceC50386MMo62 = AbstractC43592JPx.A0J(SetSessionInfo.DEFAULT_INSTANCE);
                                SetSessionInfo.PARSER = interfaceC50386MMo62;
                            }
                        }
                        return interfaceC50386MMo62;
                    }
                    return interfaceC50386MMo85;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SetManifestAuthorityKey) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetManifestAuthorityKey.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"authorityPubKey_"});
                case 3:
                    return new SetManifestAuthorityKey();
                case 4:
                    return new RXO();
                case 5:
                    return SetManifestAuthorityKey.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo86 = SetManifestAuthorityKey.PARSER;
                    if (interfaceC50386MMo86 == null) {
                        synchronized (SetManifestAuthorityKey.class) {
                            interfaceC50386MMo61 = SetManifestAuthorityKey.PARSER;
                            if (interfaceC50386MMo61 == null) {
                                C63271SgV c63271SgV13 = TES.A01;
                                interfaceC50386MMo61 = AbstractC43592JPx.A0J(SetManifestAuthorityKey.DEFAULT_INSTANCE);
                                SetManifestAuthorityKey.PARSER = interfaceC50386MMo61;
                            }
                        }
                        return interfaceC50386MMo61;
                    }
                    return interfaceC50386MMo86;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SetLinkMessage) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SetLinkMessage.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"link_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RXN();
                case 5:
                    return SetLinkMessage.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo87 = SetLinkMessage.PARSER;
                    if (interfaceC50386MMo87 == null) {
                        synchronized (SetLinkMessage.class) {
                            interfaceC50386MMo60 = SetLinkMessage.PARSER;
                            if (interfaceC50386MMo60 == null) {
                                C63271SgV c63271SgV14 = TES.A01;
                                interfaceC50386MMo60 = AbstractC43592JPx.A0J(SetLinkMessage.DEFAULT_INSTANCE);
                                SetLinkMessage.PARSER = interfaceC50386MMo60;
                            }
                        }
                        return interfaceC50386MMo60;
                    }
                    return interfaceC50386MMo87;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RequestEncryption) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RequestEncryption.DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\n\u0002\n\u0003?\u0000\u0004\u000b\u0005\u001c", new Object[]{"keyType_", "keyTypeCase_", "publicKey_", "challenge_", "supportedParameters_", "keyHint_"});
                case 3:
                    return new RequestEncryption();
                case 4:
                    return new RXM();
                case 5:
                    return RequestEncryption.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo88 = RequestEncryption.PARSER;
                    if (interfaceC50386MMo88 == null) {
                        synchronized (RequestEncryption.class) {
                            interfaceC50386MMo59 = RequestEncryption.PARSER;
                            if (interfaceC50386MMo59 == null) {
                                C63271SgV c63271SgV15 = TES.A01;
                                interfaceC50386MMo59 = AbstractC43592JPx.A0J(RequestEncryption.DEFAULT_INSTANCE);
                                RequestEncryption.PARSER = interfaceC50386MMo59;
                            }
                        }
                        return interfaceC50386MMo59;
                    }
                    return interfaceC50386MMo88;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof NetworkAddress) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(NetworkAddress.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", new Object[]{"addressType_", "prefixLength_", "data_"});
                case 3:
                    return new NetworkAddress();
                case 4:
                    return new RXL();
                case 5:
                    return NetworkAddress.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo89 = NetworkAddress.PARSER;
                    if (interfaceC50386MMo89 == null) {
                        synchronized (NetworkAddress.class) {
                            interfaceC50386MMo58 = NetworkAddress.PARSER;
                            if (interfaceC50386MMo58 == null) {
                                C63271SgV c63271SgV16 = TES.A01;
                                interfaceC50386MMo58 = AbstractC43592JPx.A0J(NetworkAddress.DEFAULT_INSTANCE);
                                NetworkAddress.PARSER = interfaceC50386MMo58;
                            }
                        }
                        return interfaceC50386MMo58;
                    }
                    return interfaceC50386MMo89;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof ManifestComplete) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(ManifestComplete.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"authorityPubKey_"});
                case 3:
                    return new ManifestComplete();
                case 4:
                    return new RXK();
                case 5:
                    return ManifestComplete.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo90 = ManifestComplete.PARSER;
                    if (interfaceC50386MMo90 == null) {
                        synchronized (ManifestComplete.class) {
                            interfaceC50386MMo57 = ManifestComplete.PARSER;
                            if (interfaceC50386MMo57 == null) {
                                C63271SgV c63271SgV17 = TES.A01;
                                interfaceC50386MMo57 = AbstractC43592JPx.A0J(ManifestComplete.DEFAULT_INSTANCE);
                                ManifestComplete.PARSER = interfaceC50386MMo57;
                            }
                        }
                        return interfaceC50386MMo57;
                    }
                    return interfaceC50386MMo90;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LeaveWifiDirectGroupResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveWifiDirectGroupResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RXJ();
                case 5:
                    return LeaveWifiDirectGroupResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo91 = LeaveWifiDirectGroupResult.PARSER;
                    if (interfaceC50386MMo91 == null) {
                        synchronized (LeaveWifiDirectGroupResult.class) {
                            interfaceC50386MMo56 = LeaveWifiDirectGroupResult.PARSER;
                            if (interfaceC50386MMo56 == null) {
                                C63271SgV c63271SgV18 = TES.A01;
                                interfaceC50386MMo56 = AbstractC43592JPx.A0J(LeaveWifiDirectGroupResult.DEFAULT_INSTANCE);
                                LeaveWifiDirectGroupResult.PARSER = interfaceC50386MMo56;
                            }
                        }
                        return interfaceC50386MMo56;
                    }
                    return interfaceC50386MMo91;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LeaveWifiDirectGroup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveWifiDirectGroup.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RXI();
                case 5:
                    return LeaveWifiDirectGroup.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo92 = LeaveWifiDirectGroup.PARSER;
                    if (interfaceC50386MMo92 == null) {
                        synchronized (LeaveWifiDirectGroup.class) {
                            interfaceC50386MMo55 = LeaveWifiDirectGroup.PARSER;
                            if (interfaceC50386MMo55 == null) {
                                C63271SgV c63271SgV19 = TES.A01;
                                interfaceC50386MMo55 = AbstractC43592JPx.A0J(LeaveWifiDirectGroup.DEFAULT_INSTANCE);
                                LeaveWifiDirectGroup.PARSER = interfaceC50386MMo55;
                            }
                        }
                        return interfaceC50386MMo55;
                    }
                    return interfaceC50386MMo92;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LeaveAccessPointResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveAccessPointResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RXH();
                case 5:
                    return LeaveAccessPointResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo93 = LeaveAccessPointResult.PARSER;
                    if (interfaceC50386MMo93 == null) {
                        synchronized (LeaveAccessPointResult.class) {
                            interfaceC50386MMo54 = LeaveAccessPointResult.PARSER;
                            if (interfaceC50386MMo54 == null) {
                                C63271SgV c63271SgV20 = TES.A01;
                                interfaceC50386MMo54 = AbstractC43592JPx.A0J(LeaveAccessPointResult.DEFAULT_INSTANCE);
                                LeaveAccessPointResult.PARSER = interfaceC50386MMo54;
                            }
                        }
                        return interfaceC50386MMo54;
                    }
                    return interfaceC50386MMo93;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LeaveAccessPoint) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LeaveAccessPoint.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RXG();
                case 5:
                    return LeaveAccessPoint.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo94 = LeaveAccessPoint.PARSER;
                    if (interfaceC50386MMo94 == null) {
                        synchronized (LeaveAccessPoint.class) {
                            interfaceC50386MMo53 = LeaveAccessPoint.PARSER;
                            if (interfaceC50386MMo53 == null) {
                                C63271SgV c63271SgV21 = TES.A01;
                                interfaceC50386MMo53 = AbstractC43592JPx.A0J(LeaveAccessPoint.DEFAULT_INSTANCE);
                                LeaveAccessPoint.PARSER = interfaceC50386MMo53;
                            }
                        }
                        return interfaceC50386MMo53;
                    }
                    return interfaceC50386MMo94;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LePairingInfo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LePairingInfo.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"appearance_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RXF();
                case 5:
                    return LePairingInfo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo95 = LePairingInfo.PARSER;
                    if (interfaceC50386MMo95 == null) {
                        synchronized (LePairingInfo.class) {
                            interfaceC50386MMo52 = LePairingInfo.PARSER;
                            if (interfaceC50386MMo52 == null) {
                                C63271SgV c63271SgV22 = TES.A01;
                                interfaceC50386MMo52 = AbstractC43592JPx.A0J(LePairingInfo.DEFAULT_INSTANCE);
                                LePairingInfo.PARSER = interfaceC50386MMo52;
                            }
                        }
                        return interfaceC50386MMo52;
                    }
                    return interfaceC50386MMo95;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof JoinWifiDirectGroupResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinWifiDirectGroupResult.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "portNumber_"});
                case 3:
                    return new JoinWifiDirectGroupResult();
                case 4:
                    return new RXE();
                case 5:
                    return JoinWifiDirectGroupResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo96 = JoinWifiDirectGroupResult.PARSER;
                    if (interfaceC50386MMo96 == null) {
                        synchronized (JoinWifiDirectGroupResult.class) {
                            interfaceC50386MMo51 = JoinWifiDirectGroupResult.PARSER;
                            if (interfaceC50386MMo51 == null) {
                                C63271SgV c63271SgV23 = TES.A01;
                                interfaceC50386MMo51 = AbstractC43592JPx.A0J(JoinWifiDirectGroupResult.DEFAULT_INSTANCE);
                                JoinWifiDirectGroupResult.PARSER = interfaceC50386MMo51;
                            }
                        }
                        return interfaceC50386MMo51;
                    }
                    return interfaceC50386MMo96;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof JoinWifiDirectGroup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinWifiDirectGroup.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u001b\u0005\t\u0006\n\u0007\u0004\b\f", new Object[]{"ssid_", "passphrase_", "timeout_", "clientAddresses_", NetworkAddress.class, "ownerAddress_", "uuid_", "frequency_", "bandwidth_"});
                case 3:
                    return new JoinWifiDirectGroup();
                case 4:
                    return new RXD();
                case 5:
                    return JoinWifiDirectGroup.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo97 = JoinWifiDirectGroup.PARSER;
                    if (interfaceC50386MMo97 == null) {
                        synchronized (JoinWifiDirectGroup.class) {
                            interfaceC50386MMo50 = JoinWifiDirectGroup.PARSER;
                            if (interfaceC50386MMo50 == null) {
                                C63271SgV c63271SgV24 = TES.A01;
                                interfaceC50386MMo50 = AbstractC43592JPx.A0J(JoinWifiDirectGroup.DEFAULT_INSTANCE);
                                JoinWifiDirectGroup.PARSER = interfaceC50386MMo50;
                            }
                        }
                        return interfaceC50386MMo50;
                    }
                    return interfaceC50386MMo97;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof JoinAccessPointResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinAccessPointResult.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "portNumber_"});
                case 3:
                    return new JoinAccessPointResult();
                case 4:
                    return new RXC();
                case 5:
                    return JoinAccessPointResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo98 = JoinAccessPointResult.PARSER;
                    if (interfaceC50386MMo98 == null) {
                        synchronized (JoinAccessPointResult.class) {
                            interfaceC50386MMo49 = JoinAccessPointResult.PARSER;
                            if (interfaceC50386MMo49 == null) {
                                C63271SgV c63271SgV25 = TES.A01;
                                interfaceC50386MMo49 = AbstractC43592JPx.A0J(JoinAccessPointResult.DEFAULT_INSTANCE);
                                JoinAccessPointResult.PARSER = interfaceC50386MMo49;
                            }
                        }
                        return interfaceC50386MMo49;
                    }
                    return interfaceC50386MMo98;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof JoinAccessPoint) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(JoinAccessPoint.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\f", new Object[]{"ssid_", "passphrase_", "uuid_", "bandwidth_"});
                case 3:
                    return new JoinAccessPoint();
                case 4:
                    return new RXB();
                case 5:
                    return JoinAccessPoint.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo99 = JoinAccessPoint.PARSER;
                    if (interfaceC50386MMo99 == null) {
                        synchronized (JoinAccessPoint.class) {
                            interfaceC50386MMo48 = JoinAccessPoint.PARSER;
                            if (interfaceC50386MMo48 == null) {
                                C63271SgV c63271SgV26 = TES.A01;
                                interfaceC50386MMo48 = AbstractC43592JPx.A0J(JoinAccessPoint.DEFAULT_INSTANCE);
                                JoinAccessPoint.PARSER = interfaceC50386MMo48;
                            }
                        }
                        return interfaceC50386MMo48;
                    }
                    return interfaceC50386MMo99;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof EndWifiSession) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EndWifiSession.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RXA();
                case 5:
                    return EndWifiSession.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo100 = EndWifiSession.PARSER;
                    if (interfaceC50386MMo100 == null) {
                        synchronized (EndWifiSession.class) {
                            interfaceC50386MMo47 = EndWifiSession.PARSER;
                            if (interfaceC50386MMo47 == null) {
                                C63271SgV c63271SgV27 = TES.A01;
                                interfaceC50386MMo47 = AbstractC43592JPx.A0J(EndWifiSession.DEFAULT_INSTANCE);
                                EndWifiSession.PARSER = interfaceC50386MMo47;
                            }
                        }
                        return interfaceC50386MMo47;
                    }
                    return interfaceC50386MMo100;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof EndLinkSetup) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EndLinkSetup.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"state_", "uuid_"});
                case 3:
                    return new EndLinkSetup();
                case 4:
                    return new RX9();
                case 5:
                    return EndLinkSetup.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo101 = EndLinkSetup.PARSER;
                    if (interfaceC50386MMo101 == null) {
                        synchronized (EndLinkSetup.class) {
                            interfaceC50386MMo46 = EndLinkSetup.PARSER;
                            if (interfaceC50386MMo46 == null) {
                                C63271SgV c63271SgV28 = TES.A01;
                                interfaceC50386MMo46 = AbstractC43592JPx.A0J(EndLinkSetup.DEFAULT_INSTANCE);
                                EndLinkSetup.PARSER = interfaceC50386MMo46;
                            }
                        }
                        return interfaceC50386MMo46;
                    }
                    return interfaceC50386MMo101;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof EnableEncryption) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EnableEncryption.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\u000b\u0005\u000b", new Object[]{"publicKey_", "seed_", "iv_", "base_", "parameters_"});
                case 3:
                    return new EnableEncryption();
                case 4:
                    return new RX8();
                case 5:
                    return EnableEncryption.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo102 = EnableEncryption.PARSER;
                    if (interfaceC50386MMo102 == null) {
                        synchronized (EnableEncryption.class) {
                            interfaceC50386MMo45 = EnableEncryption.PARSER;
                            if (interfaceC50386MMo45 == null) {
                                C63271SgV c63271SgV29 = TES.A01;
                                interfaceC50386MMo45 = AbstractC43592JPx.A0J(EnableEncryption.DEFAULT_INSTANCE);
                                EnableEncryption.PARSER = interfaceC50386MMo45;
                            }
                        }
                        return interfaceC50386MMo45;
                    }
                    return interfaceC50386MMo102;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DestroyWifiDirectNetworkResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RX7();
                case 5:
                    return DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo103 = DestroyWifiDirectNetworkResult.PARSER;
                    if (interfaceC50386MMo103 == null) {
                        synchronized (DestroyWifiDirectNetworkResult.class) {
                            interfaceC50386MMo44 = DestroyWifiDirectNetworkResult.PARSER;
                            if (interfaceC50386MMo44 == null) {
                                C63271SgV c63271SgV30 = TES.A01;
                                interfaceC50386MMo44 = AbstractC43592JPx.A0J(DestroyWifiDirectNetworkResult.DEFAULT_INSTANCE);
                                DestroyWifiDirectNetworkResult.PARSER = interfaceC50386MMo44;
                            }
                        }
                        return interfaceC50386MMo44;
                    }
                    return interfaceC50386MMo103;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DestroyWifiDirectNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroyWifiDirectNetwork.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RX6();
                case 5:
                    return DestroyWifiDirectNetwork.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo104 = DestroyWifiDirectNetwork.PARSER;
                    if (interfaceC50386MMo104 == null) {
                        synchronized (DestroyWifiDirectNetwork.class) {
                            interfaceC50386MMo43 = DestroyWifiDirectNetwork.PARSER;
                            if (interfaceC50386MMo43 == null) {
                                C63271SgV c63271SgV31 = TES.A01;
                                interfaceC50386MMo43 = AbstractC43592JPx.A0J(DestroyWifiDirectNetwork.DEFAULT_INSTANCE);
                                DestroyWifiDirectNetwork.PARSER = interfaceC50386MMo43;
                            }
                        }
                        return interfaceC50386MMo43;
                    }
                    return interfaceC50386MMo104;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DestroySoftApNetworkResult) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroySoftApNetworkResult.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RX5();
                case 5:
                    return DestroySoftApNetworkResult.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo105 = DestroySoftApNetworkResult.PARSER;
                    if (interfaceC50386MMo105 == null) {
                        synchronized (DestroySoftApNetworkResult.class) {
                            interfaceC50386MMo42 = DestroySoftApNetworkResult.PARSER;
                            if (interfaceC50386MMo42 == null) {
                                C63271SgV c63271SgV32 = TES.A01;
                                interfaceC50386MMo42 = AbstractC43592JPx.A0J(DestroySoftApNetworkResult.DEFAULT_INSTANCE);
                                DestroySoftApNetworkResult.PARSER = interfaceC50386MMo42;
                            }
                        }
                        return interfaceC50386MMo42;
                    }
                    return interfaceC50386MMo105;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DestroySoftApNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DestroySoftApNetwork.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RX4();
                case 5:
                    return DestroySoftApNetwork.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo106 = DestroySoftApNetwork.PARSER;
                    if (interfaceC50386MMo106 == null) {
                        synchronized (DestroySoftApNetwork.class) {
                            interfaceC50386MMo41 = DestroySoftApNetwork.PARSER;
                            if (interfaceC50386MMo41 == null) {
                                C63271SgV c63271SgV33 = TES.A01;
                                interfaceC50386MMo41 = AbstractC43592JPx.A0J(DestroySoftApNetwork.DEFAULT_INSTANCE);
                                DestroySoftApNetwork.PARSER = interfaceC50386MMo41;
                            }
                        }
                        return interfaceC50386MMo41;
                    }
                    return interfaceC50386MMo106;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof CreateWifiDirectNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(CreateWifiDirectNetwork.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"band_", "uuid_"});
                case 3:
                    return new CreateWifiDirectNetwork();
                case 4:
                    return new RX3();
                case 5:
                    return CreateWifiDirectNetwork.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo107 = CreateWifiDirectNetwork.PARSER;
                    if (interfaceC50386MMo107 == null) {
                        synchronized (CreateWifiDirectNetwork.class) {
                            interfaceC50386MMo40 = CreateWifiDirectNetwork.PARSER;
                            if (interfaceC50386MMo40 == null) {
                                C63271SgV c63271SgV34 = TES.A01;
                                interfaceC50386MMo40 = AbstractC43592JPx.A0J(CreateWifiDirectNetwork.DEFAULT_INSTANCE);
                                CreateWifiDirectNetwork.PARSER = interfaceC50386MMo40;
                            }
                        }
                        return interfaceC50386MMo40;
                    }
                    return interfaceC50386MMo107;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof CreateSoftApNetwork) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(CreateSoftApNetwork.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0003\t\u0007\u0000\u0000\u0000\u0003\f\u0004\u000b\u0005\u0007\u0006Ȉ\u0007\n\b\t\t\f", new Object[]{"band_", "channel_", "hidden_", "countryCode_", "uuid_", "credentials_", "bandwidth_"});
                case 3:
                    return new CreateSoftApNetwork();
                case 4:
                    return new RX2();
                case 5:
                    return CreateSoftApNetwork.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo108 = CreateSoftApNetwork.PARSER;
                    if (interfaceC50386MMo108 == null) {
                        synchronized (CreateSoftApNetwork.class) {
                            interfaceC50386MMo39 = CreateSoftApNetwork.PARSER;
                            if (interfaceC50386MMo39 == null) {
                                C63271SgV c63271SgV35 = TES.A01;
                                interfaceC50386MMo39 = AbstractC43592JPx.A0J(CreateSoftApNetwork.DEFAULT_INSTANCE);
                                CreateSoftApNetwork.PARSER = interfaceC50386MMo39;
                            }
                        }
                        return interfaceC50386MMo39;
                    }
                    return interfaceC50386MMo108;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof UnlinkAppResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UnlinkAppResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", new Object[]{"nonce_", "error_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RX1();
                case 5:
                    return UnlinkAppResponse.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo109 = UnlinkAppResponse.PARSER;
                    if (interfaceC50386MMo109 == null) {
                        synchronized (UnlinkAppResponse.class) {
                            interfaceC50386MMo38 = UnlinkAppResponse.PARSER;
                            if (interfaceC50386MMo38 == null) {
                                C63271SgV c63271SgV36 = TES.A01;
                                interfaceC50386MMo38 = AbstractC43592JPx.A0J(UnlinkAppResponse.DEFAULT_INSTANCE);
                                UnlinkAppResponse.PARSER = interfaceC50386MMo38;
                            }
                        }
                        return interfaceC50386MMo38;
                    }
                    return interfaceC50386MMo109;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof UnlinkAppRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UnlinkAppRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "serviceUUID_"});
                case 3:
                    return new UnlinkAppRequest();
                case 4:
                    return new RX0();
                case 5:
                    return UnlinkAppRequest.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo110 = UnlinkAppRequest.PARSER;
                    if (interfaceC50386MMo110 == null) {
                        synchronized (UnlinkAppRequest.class) {
                            interfaceC50386MMo37 = UnlinkAppRequest.PARSER;
                            if (interfaceC50386MMo37 == null) {
                                C63271SgV c63271SgV37 = TES.A01;
                                interfaceC50386MMo37 = AbstractC43592JPx.A0J(UnlinkAppRequest.DEFAULT_INSTANCE);
                                UnlinkAppRequest.PARSER = interfaceC50386MMo37;
                            }
                        }
                        return interfaceC50386MMo37;
                    }
                    return interfaceC50386MMo110;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkedAppDisconnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkedAppDisconnectedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"serviceUUID_"});
                case 3:
                    return new LinkedAppDisconnectedEvent();
                case 4:
                    return new C60876RWz();
                case 5:
                    return LinkedAppDisconnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo111 = LinkedAppDisconnectedEvent.PARSER;
                    if (interfaceC50386MMo111 == null) {
                        synchronized (LinkedAppDisconnectedEvent.class) {
                            interfaceC50386MMo36 = LinkedAppDisconnectedEvent.PARSER;
                            if (interfaceC50386MMo36 == null) {
                                C63271SgV c63271SgV38 = TES.A01;
                                interfaceC50386MMo36 = AbstractC43592JPx.A0J(LinkedAppDisconnectedEvent.DEFAULT_INSTANCE);
                                LinkedAppDisconnectedEvent.PARSER = interfaceC50386MMo36;
                            }
                        }
                        return interfaceC50386MMo36;
                    }
                    return interfaceC50386MMo111;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkedAppConnectedEvent) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkedAppConnectedEvent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"serviceUUID_"});
                case 3:
                    return new LinkedAppConnectedEvent();
                case 4:
                    return new C60875RWy();
                case 5:
                    return LinkedAppConnectedEvent.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo112 = LinkedAppConnectedEvent.PARSER;
                    if (interfaceC50386MMo112 == null) {
                        synchronized (LinkedAppConnectedEvent.class) {
                            interfaceC50386MMo35 = LinkedAppConnectedEvent.PARSER;
                            if (interfaceC50386MMo35 == null) {
                                C63271SgV c63271SgV39 = TES.A01;
                                interfaceC50386MMo35 = AbstractC43592JPx.A0J(LinkedAppConnectedEvent.DEFAULT_INSTANCE);
                                LinkedAppConnectedEvent.PARSER = interfaceC50386MMo35;
                            }
                        }
                        return interfaceC50386MMo35;
                    }
                    return interfaceC50386MMo112;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "devicePublicKey_"});
                case 3:
                    return new LinkAppResponse();
                case 4:
                    return new C60874RWx();
                case 5:
                    return LinkAppResponse.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo113 = LinkAppResponse.PARSER;
                    if (interfaceC50386MMo113 == null) {
                        synchronized (LinkAppResponse.class) {
                            interfaceC50386MMo34 = LinkAppResponse.PARSER;
                            if (interfaceC50386MMo34 == null) {
                                C63271SgV c63271SgV40 = TES.A01;
                                interfaceC50386MMo34 = AbstractC43592JPx.A0J(LinkAppResponse.DEFAULT_INSTANCE);
                                LinkAppResponse.PARSER = interfaceC50386MMo34;
                            }
                        }
                        return interfaceC50386MMo34;
                    }
                    return interfaceC50386MMo113;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\n\u0004Ȉ", new Object[]{"nonce_", "serviceUUID_", "appPublicKey_", "bundleIdentifier_"});
                case 3:
                    return new LinkAppRequest();
                case 4:
                    return new C60873RWw();
                case 5:
                    return LinkAppRequest.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo114 = LinkAppRequest.PARSER;
                    if (interfaceC50386MMo114 == null) {
                        synchronized (LinkAppRequest.class) {
                            interfaceC50386MMo33 = LinkAppRequest.PARSER;
                            if (interfaceC50386MMo33 == null) {
                                C63271SgV c63271SgV41 = TES.A01;
                                interfaceC50386MMo33 = AbstractC43592JPx.A0J(LinkAppRequest.DEFAULT_INSTANCE);
                                LinkAppRequest.PARSER = interfaceC50386MMo33;
                            }
                        }
                        return interfaceC50386MMo33;
                    }
                    return interfaceC50386MMo114;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppRegisterResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppRegisterResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "serviceUUID_"});
                case 3:
                    return new LinkAppRegisterResponse();
                case 4:
                    return new C60872RWv();
                case 5:
                    return LinkAppRegisterResponse.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo115 = LinkAppRegisterResponse.PARSER;
                    if (interfaceC50386MMo115 == null) {
                        synchronized (LinkAppRegisterResponse.class) {
                            interfaceC50386MMo32 = LinkAppRegisterResponse.PARSER;
                            if (interfaceC50386MMo32 == null) {
                                C63271SgV c63271SgV42 = TES.A01;
                                interfaceC50386MMo32 = AbstractC43592JPx.A0J(LinkAppRegisterResponse.DEFAULT_INSTANCE);
                                LinkAppRegisterResponse.PARSER = interfaceC50386MMo32;
                            }
                        }
                        return interfaceC50386MMo32;
                    }
                    return interfaceC50386MMo115;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppLinkInfoResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppLinkInfoResponse.DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003\u001b\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n", new Object[]{"nonce_", "error_", "addresses_", LinkAddress.class, "firmwareVersion_", "deviceSerial_", "deviceImageAssetURI_", "deviceModelName_", "buildFlavor_", "deviceName_", "hardwareType_", "macAddress_"});
                case 3:
                    return new LinkAppLinkInfoResponse();
                case 4:
                    return new C60870RWt();
                case 5:
                    return LinkAppLinkInfoResponse.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo116 = LinkAppLinkInfoResponse.PARSER;
                    if (interfaceC50386MMo116 == null) {
                        synchronized (LinkAppLinkInfoResponse.class) {
                            interfaceC50386MMo31 = LinkAppLinkInfoResponse.PARSER;
                            if (interfaceC50386MMo31 == null) {
                                C63271SgV c63271SgV43 = TES.A01;
                                interfaceC50386MMo31 = AbstractC43592JPx.A0J(LinkAppLinkInfoResponse.DEFAULT_INSTANCE);
                                LinkAppLinkInfoResponse.PARSER = interfaceC50386MMo31;
                            }
                        }
                        return interfaceC50386MMo31;
                    }
                    return interfaceC50386MMo116;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppLinkInfoRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppLinkInfoRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\f\u0004\f", new Object[]{"nonce_", "serviceUUID_", "linkType_", "requestType_"});
                case 3:
                    return new LinkAppLinkInfoRequest();
                case 4:
                    return new C60869RWs();
                case 5:
                    return LinkAppLinkInfoRequest.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo117 = LinkAppLinkInfoRequest.PARSER;
                    if (interfaceC50386MMo117 == null) {
                        synchronized (LinkAppLinkInfoRequest.class) {
                            interfaceC50386MMo30 = LinkAppLinkInfoRequest.PARSER;
                            if (interfaceC50386MMo30 == null) {
                                C63271SgV c63271SgV44 = TES.A01;
                                interfaceC50386MMo30 = AbstractC43592JPx.A0J(LinkAppLinkInfoRequest.DEFAULT_INSTANCE);
                                LinkAppLinkInfoRequest.PARSER = interfaceC50386MMo30;
                            }
                        }
                        return interfaceC50386MMo30;
                    }
                    return interfaceC50386MMo117;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppDeviceIdentityResponse) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n", new Object[]{"nonce_", "error_", "serviceUUID_", "devicePublicKey_"});
                case 3:
                    return new LinkAppDeviceIdentityResponse();
                case 4:
                    return new C60868RWr();
                case 5:
                    return LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo118 = LinkAppDeviceIdentityResponse.PARSER;
                    if (interfaceC50386MMo118 == null) {
                        synchronized (LinkAppDeviceIdentityResponse.class) {
                            interfaceC50386MMo29 = LinkAppDeviceIdentityResponse.PARSER;
                            if (interfaceC50386MMo29 == null) {
                                C63271SgV c63271SgV45 = TES.A01;
                                interfaceC50386MMo29 = AbstractC43592JPx.A0J(LinkAppDeviceIdentityResponse.DEFAULT_INSTANCE);
                                LinkAppDeviceIdentityResponse.PARSER = interfaceC50386MMo29;
                            }
                        }
                        return interfaceC50386MMo29;
                    }
                    return interfaceC50386MMo118;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAppDeviceIdentityRequest) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"nonce_", "serviceUUID_"});
                case 3:
                    return new LinkAppDeviceIdentityRequest();
                case 4:
                    return new C60867RWq();
                case 5:
                    return LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo119 = LinkAppDeviceIdentityRequest.PARSER;
                    if (interfaceC50386MMo119 == null) {
                        synchronized (LinkAppDeviceIdentityRequest.class) {
                            interfaceC50386MMo28 = LinkAppDeviceIdentityRequest.PARSER;
                            if (interfaceC50386MMo28 == null) {
                                C63271SgV c63271SgV46 = TES.A01;
                                interfaceC50386MMo28 = AbstractC43592JPx.A0J(LinkAppDeviceIdentityRequest.DEFAULT_INSTANCE);
                                LinkAppDeviceIdentityRequest.PARSER = interfaceC50386MMo28;
                            }
                        }
                        return interfaceC50386MMo28;
                    }
                    return interfaceC50386MMo119;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof LinkAddress) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(LinkAddress.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\n", new Object[]{"addressType_", "prefixLength_", "data_"});
                case 3:
                    return new LinkAddress();
                case 4:
                    return new C60866RWp();
                case 5:
                    return LinkAddress.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo120 = LinkAddress.PARSER;
                    if (interfaceC50386MMo120 == null) {
                        synchronized (LinkAddress.class) {
                            interfaceC50386MMo27 = LinkAddress.PARSER;
                            if (interfaceC50386MMo27 == null) {
                                C63271SgV c63271SgV47 = TES.A01;
                                interfaceC50386MMo27 = AbstractC43592JPx.A0J(LinkAddress.DEFAULT_INSTANCE);
                                LinkAddress.PARSER = interfaceC50386MMo27;
                            }
                        }
                        return interfaceC50386MMo27;
                    }
                    return interfaceC50386MMo120;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
                case 3:
                    return new Value();
                case 4:
                    return new C60865RWo();
                case 5:
                    return Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo121 = Value.PARSER;
                    if (interfaceC50386MMo121 == null) {
                        synchronized (Value.class) {
                            interfaceC50386MMo26 = Value.PARSER;
                            if (interfaceC50386MMo26 == null) {
                                C63271SgV c63271SgV48 = TES.A01;
                                interfaceC50386MMo26 = AbstractC43592JPx.A0J(Value.DEFAULT_INSTANCE);
                                Value.PARSER = interfaceC50386MMo26;
                            }
                        }
                        return interfaceC50386MMo26;
                    }
                    return interfaceC50386MMo121;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof UInt64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new C60864RWn();
                case 5:
                    return UInt64Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo122 = UInt64Value.PARSER;
                    if (interfaceC50386MMo122 == null) {
                        synchronized (UInt64Value.class) {
                            interfaceC50386MMo25 = UInt64Value.PARSER;
                            if (interfaceC50386MMo25 == null) {
                                C63271SgV c63271SgV49 = TES.A01;
                                interfaceC50386MMo25 = AbstractC43592JPx.A0J(UInt64Value.DEFAULT_INSTANCE);
                                UInt64Value.PARSER = interfaceC50386MMo25;
                            }
                        }
                        return interfaceC50386MMo25;
                    }
                    return interfaceC50386MMo122;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof UInt32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new C60863RWm();
                case 5:
                    return UInt32Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo123 = UInt32Value.PARSER;
                    if (interfaceC50386MMo123 == null) {
                        synchronized (UInt32Value.class) {
                            interfaceC50386MMo24 = UInt32Value.PARSER;
                            if (interfaceC50386MMo24 == null) {
                                C63271SgV c63271SgV50 = TES.A01;
                                interfaceC50386MMo24 = AbstractC43592JPx.A0J(UInt32Value.DEFAULT_INSTANCE);
                                UInt32Value.PARSER = interfaceC50386MMo24;
                            }
                        }
                        return interfaceC50386MMo24;
                    }
                    return interfaceC50386MMo123;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Type) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Type();
                case 4:
                    return new C60862RWl();
                case 5:
                    return Type.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo124 = Type.PARSER;
                    if (interfaceC50386MMo124 == null) {
                        synchronized (Type.class) {
                            interfaceC50386MMo23 = Type.PARSER;
                            if (interfaceC50386MMo23 == null) {
                                C63271SgV c63271SgV51 = TES.A01;
                                interfaceC50386MMo23 = AbstractC43592JPx.A0J(Type.DEFAULT_INSTANCE);
                                Type.PARSER = interfaceC50386MMo23;
                            }
                        }
                        return interfaceC50386MMo23;
                    }
                    return interfaceC50386MMo124;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Timestamp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new RYn();
                case 4:
                    return new C60861RWk();
                case 5:
                    return Timestamp.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo125 = Timestamp.PARSER;
                    if (interfaceC50386MMo125 == null) {
                        synchronized (Timestamp.class) {
                            interfaceC50386MMo22 = Timestamp.PARSER;
                            if (interfaceC50386MMo22 == null) {
                                C63271SgV c63271SgV52 = TES.A01;
                                interfaceC50386MMo22 = AbstractC43592JPx.A0J(Timestamp.DEFAULT_INSTANCE);
                                Timestamp.PARSER = interfaceC50386MMo22;
                            }
                        }
                        return interfaceC50386MMo22;
                    }
                    return interfaceC50386MMo125;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Struct) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC62341S7l.A00});
                case 3:
                    return new Struct();
                case 4:
                    return new C60860RWj();
                case 5:
                    return Struct.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo126 = Struct.PARSER;
                    if (interfaceC50386MMo126 == null) {
                        synchronized (Struct.class) {
                            interfaceC50386MMo21 = Struct.PARSER;
                            if (interfaceC50386MMo21 == null) {
                                C63271SgV c63271SgV53 = TES.A01;
                                interfaceC50386MMo21 = AbstractC43592JPx.A0J(Struct.DEFAULT_INSTANCE);
                                Struct.PARSER = interfaceC50386MMo21;
                            }
                        }
                        return interfaceC50386MMo21;
                    }
                    return interfaceC50386MMo126;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof StringValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", AbstractC58321PtD.A1b());
                case 3:
                    return new StringValue();
                case 4:
                    return new C60859RWi();
                case 5:
                    return StringValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo127 = StringValue.PARSER;
                    if (interfaceC50386MMo127 == null) {
                        synchronized (StringValue.class) {
                            interfaceC50386MMo20 = StringValue.PARSER;
                            if (interfaceC50386MMo20 == null) {
                                C63271SgV c63271SgV54 = TES.A01;
                                interfaceC50386MMo20 = AbstractC43592JPx.A0J(StringValue.DEFAULT_INSTANCE);
                                StringValue.PARSER = interfaceC50386MMo20;
                            }
                        }
                        return interfaceC50386MMo20;
                    }
                    return interfaceC50386MMo127;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof SourceContext) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
                case 3:
                    return new SourceContext();
                case 4:
                    return new C60858RWh();
                case 5:
                    return SourceContext.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo128 = SourceContext.PARSER;
                    if (interfaceC50386MMo128 == null) {
                        synchronized (SourceContext.class) {
                            interfaceC50386MMo19 = SourceContext.PARSER;
                            if (interfaceC50386MMo19 == null) {
                                C63271SgV c63271SgV55 = TES.A01;
                                interfaceC50386MMo19 = AbstractC43592JPx.A0J(SourceContext.DEFAULT_INSTANCE);
                                SourceContext.PARSER = interfaceC50386MMo19;
                            }
                        }
                        return interfaceC50386MMo19;
                    }
                    return interfaceC50386MMo128;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Option) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
                case 3:
                    return new Option();
                case 4:
                    return new RWg();
                case 5:
                    return Option.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo129 = Option.PARSER;
                    if (interfaceC50386MMo129 == null) {
                        synchronized (Option.class) {
                            interfaceC50386MMo18 = Option.PARSER;
                            if (interfaceC50386MMo18 == null) {
                                C63271SgV c63271SgV56 = TES.A01;
                                interfaceC50386MMo18 = AbstractC43592JPx.A0J(Option.DEFAULT_INSTANCE);
                                Option.PARSER = interfaceC50386MMo18;
                            }
                        }
                        return interfaceC50386MMo18;
                    }
                    return interfaceC50386MMo129;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Mixin) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
                case 3:
                    return new Mixin();
                case 4:
                    return new C60857RWf();
                case 5:
                    return Mixin.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo130 = Mixin.PARSER;
                    if (interfaceC50386MMo130 == null) {
                        synchronized (Mixin.class) {
                            interfaceC50386MMo17 = Mixin.PARSER;
                            if (interfaceC50386MMo17 == null) {
                                C63271SgV c63271SgV57 = TES.A01;
                                interfaceC50386MMo17 = AbstractC43592JPx.A0J(Mixin.DEFAULT_INSTANCE);
                                Mixin.PARSER = interfaceC50386MMo17;
                            }
                        }
                        return interfaceC50386MMo17;
                    }
                    return interfaceC50386MMo130;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof com.google.protobuf.Method) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(com.google.protobuf.Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
                case 3:
                    return new com.google.protobuf.Method();
                case 4:
                    return new C60856RWe();
                case 5:
                    return com.google.protobuf.Method.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo131 = com.google.protobuf.Method.PARSER;
                    if (interfaceC50386MMo131 == null) {
                        synchronized (com.google.protobuf.Method.class) {
                            interfaceC50386MMo16 = com.google.protobuf.Method.PARSER;
                            if (interfaceC50386MMo16 == null) {
                                C63271SgV c63271SgV58 = TES.A01;
                                interfaceC50386MMo16 = AbstractC43592JPx.A0J(com.google.protobuf.Method.DEFAULT_INSTANCE);
                                com.google.protobuf.Method.PARSER = interfaceC50386MMo16;
                            }
                        }
                        return interfaceC50386MMo16;
                    }
                    return interfaceC50386MMo131;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof ListValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
                case 3:
                    return new ListValue();
                case 4:
                    return new C60855RWd();
                case 5:
                    return ListValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo132 = ListValue.PARSER;
                    if (interfaceC50386MMo132 == null) {
                        synchronized (ListValue.class) {
                            interfaceC50386MMo15 = ListValue.PARSER;
                            if (interfaceC50386MMo15 == null) {
                                C63271SgV c63271SgV59 = TES.A01;
                                interfaceC50386MMo15 = AbstractC43592JPx.A0J(ListValue.DEFAULT_INSTANCE);
                                ListValue.PARSER = interfaceC50386MMo15;
                            }
                        }
                        return interfaceC50386MMo15;
                    }
                    return interfaceC50386MMo132;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Int64Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new C60854RWc();
                case 5:
                    return Int64Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo133 = Int64Value.PARSER;
                    if (interfaceC50386MMo133 == null) {
                        synchronized (Int64Value.class) {
                            interfaceC50386MMo14 = Int64Value.PARSER;
                            if (interfaceC50386MMo14 == null) {
                                C63271SgV c63271SgV60 = TES.A01;
                                interfaceC50386MMo14 = AbstractC43592JPx.A0J(Int64Value.DEFAULT_INSTANCE);
                                Int64Value.PARSER = interfaceC50386MMo14;
                            }
                        }
                        return interfaceC50386MMo14;
                    }
                    return interfaceC50386MMo133;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Int32Value) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new C60853RWb();
                case 5:
                    return Int32Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo134 = Int32Value.PARSER;
                    if (interfaceC50386MMo134 == null) {
                        synchronized (Int32Value.class) {
                            interfaceC50386MMo13 = Int32Value.PARSER;
                            if (interfaceC50386MMo13 == null) {
                                C63271SgV c63271SgV61 = TES.A01;
                                interfaceC50386MMo13 = AbstractC43592JPx.A0J(Int32Value.DEFAULT_INSTANCE);
                                Int32Value.PARSER = interfaceC50386MMo13;
                            }
                        }
                        return interfaceC50386MMo13;
                    }
                    return interfaceC50386MMo134;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof FloatValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(FloatValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new C60852RWa();
                case 5:
                    return FloatValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo135 = FloatValue.PARSER;
                    if (interfaceC50386MMo135 == null) {
                        synchronized (FloatValue.class) {
                            interfaceC50386MMo12 = FloatValue.PARSER;
                            if (interfaceC50386MMo12 == null) {
                                C63271SgV c63271SgV62 = TES.A01;
                                interfaceC50386MMo12 = AbstractC43592JPx.A0J(FloatValue.DEFAULT_INSTANCE);
                                FloatValue.PARSER = interfaceC50386MMo12;
                            }
                        }
                        return interfaceC50386MMo12;
                    }
                    return interfaceC50386MMo135;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof FieldMask) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
                case 3:
                    return new FieldMask();
                case 4:
                    return new RWZ();
                case 5:
                    return FieldMask.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo136 = FieldMask.PARSER;
                    if (interfaceC50386MMo136 == null) {
                        synchronized (FieldMask.class) {
                            interfaceC50386MMo11 = FieldMask.PARSER;
                            if (interfaceC50386MMo11 == null) {
                                C63271SgV c63271SgV63 = TES.A01;
                                interfaceC50386MMo11 = AbstractC43592JPx.A0J(FieldMask.DEFAULT_INSTANCE);
                                FieldMask.PARSER = interfaceC50386MMo11;
                            }
                        }
                        return interfaceC50386MMo11;
                    }
                    return interfaceC50386MMo136;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Field) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Field.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
                case 3:
                    return new Field();
                case 4:
                    return new RWY();
                case 5:
                    return Field.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo137 = Field.PARSER;
                    if (interfaceC50386MMo137 == null) {
                        synchronized (Field.class) {
                            interfaceC50386MMo10 = Field.PARSER;
                            if (interfaceC50386MMo10 == null) {
                                C63271SgV c63271SgV64 = TES.A01;
                                interfaceC50386MMo10 = AbstractC43592JPx.A0J(Field.DEFAULT_INSTANCE);
                                Field.PARSER = interfaceC50386MMo10;
                            }
                        }
                        return interfaceC50386MMo10;
                    }
                    return interfaceC50386MMo137;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof EnumValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
                case 3:
                    return new EnumValue();
                case 4:
                    return new RWX();
                case 5:
                    return EnumValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo138 = EnumValue.PARSER;
                    if (interfaceC50386MMo138 == null) {
                        synchronized (EnumValue.class) {
                            interfaceC50386MMo9 = EnumValue.PARSER;
                            if (interfaceC50386MMo9 == null) {
                                C63271SgV c63271SgV65 = TES.A01;
                                interfaceC50386MMo9 = AbstractC43592JPx.A0J(EnumValue.DEFAULT_INSTANCE);
                                EnumValue.PARSER = interfaceC50386MMo9;
                            }
                        }
                        return interfaceC50386MMo9;
                    }
                    return interfaceC50386MMo138;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Enum) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Enum();
                case 4:
                    return new RWW();
                case 5:
                    return Enum.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo139 = Enum.PARSER;
                    if (interfaceC50386MMo139 == null) {
                        synchronized (Enum.class) {
                            interfaceC50386MMo8 = Enum.PARSER;
                            if (interfaceC50386MMo8 == null) {
                                C63271SgV c63271SgV66 = TES.A01;
                                interfaceC50386MMo8 = AbstractC43592JPx.A0J(Enum.DEFAULT_INSTANCE);
                                Enum.PARSER = interfaceC50386MMo8;
                            }
                        }
                        return interfaceC50386MMo8;
                    }
                    return interfaceC50386MMo139;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Empty) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Empty.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RYn();
                case 4:
                    return new RWV();
                case 5:
                    return Empty.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo140 = Empty.PARSER;
                    if (interfaceC50386MMo140 == null) {
                        synchronized (Empty.class) {
                            interfaceC50386MMo7 = Empty.PARSER;
                            if (interfaceC50386MMo7 == null) {
                                C63271SgV c63271SgV67 = TES.A01;
                                interfaceC50386MMo7 = AbstractC43592JPx.A0J(Empty.DEFAULT_INSTANCE);
                                Empty.PARSER = interfaceC50386MMo7;
                            }
                        }
                        return interfaceC50386MMo7;
                    }
                    return interfaceC50386MMo140;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Duration) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new RYn();
                case 4:
                    return new RWU();
                case 5:
                    return Duration.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo141 = Duration.PARSER;
                    if (interfaceC50386MMo141 == null) {
                        synchronized (Duration.class) {
                            interfaceC50386MMo6 = Duration.PARSER;
                            if (interfaceC50386MMo6 == null) {
                                C63271SgV c63271SgV68 = TES.A01;
                                interfaceC50386MMo6 = AbstractC43592JPx.A0J(Duration.DEFAULT_INSTANCE);
                                Duration.PARSER = interfaceC50386MMo6;
                            }
                        }
                        return interfaceC50386MMo6;
                    }
                    return interfaceC50386MMo141;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DoubleValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new RWT();
                case 5:
                    return DoubleValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo142 = DoubleValue.PARSER;
                    if (interfaceC50386MMo142 == null) {
                        synchronized (DoubleValue.class) {
                            interfaceC50386MMo5 = DoubleValue.PARSER;
                            if (interfaceC50386MMo5 == null) {
                                C63271SgV c63271SgV69 = TES.A01;
                                interfaceC50386MMo5 = AbstractC43592JPx.A0J(DoubleValue.DEFAULT_INSTANCE);
                                DoubleValue.PARSER = interfaceC50386MMo5;
                            }
                        }
                        return interfaceC50386MMo5;
                    }
                    return interfaceC50386MMo142;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof BytesValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", AbstractC58321PtD.A1b());
                case 3:
                    return new BytesValue();
                case 4:
                    return new RWS();
                case 5:
                    return BytesValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo143 = BytesValue.PARSER;
                    if (interfaceC50386MMo143 == null) {
                        synchronized (BytesValue.class) {
                            interfaceC50386MMo4 = BytesValue.PARSER;
                            if (interfaceC50386MMo4 == null) {
                                C63271SgV c63271SgV70 = TES.A01;
                                interfaceC50386MMo4 = AbstractC43592JPx.A0J(BytesValue.DEFAULT_INSTANCE);
                                BytesValue.PARSER = interfaceC50386MMo4;
                            }
                        }
                        return interfaceC50386MMo4;
                    }
                    return interfaceC50386MMo143;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof BoolValue) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", AbstractC58321PtD.A1b());
                case 3:
                    return new RYn();
                case 4:
                    return new RWR();
                case 5:
                    return BoolValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo144 = BoolValue.PARSER;
                    if (interfaceC50386MMo144 == null) {
                        synchronized (BoolValue.class) {
                            interfaceC50386MMo3 = BoolValue.PARSER;
                            if (interfaceC50386MMo3 == null) {
                                C63271SgV c63271SgV71 = TES.A01;
                                interfaceC50386MMo3 = AbstractC43592JPx.A0J(BoolValue.DEFAULT_INSTANCE);
                                BoolValue.PARSER = interfaceC50386MMo3;
                            }
                        }
                        return interfaceC50386MMo3;
                    }
                    return interfaceC50386MMo144;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        boolean z = this instanceof com.google.protobuf.Api;
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(com.google.protobuf.Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", com.google.protobuf.Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
                case 3:
                    return new com.google.protobuf.Api();
                case 4:
                    return new RWQ();
                case 5:
                    return com.google.protobuf.Api.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo145 = com.google.protobuf.Api.PARSER;
                    if (interfaceC50386MMo145 == null) {
                        synchronized (com.google.protobuf.Api.class) {
                            interfaceC50386MMo2 = com.google.protobuf.Api.PARSER;
                            if (interfaceC50386MMo2 == null) {
                                C63271SgV c63271SgV72 = TES.A01;
                                interfaceC50386MMo2 = AbstractC43592JPx.A0J(com.google.protobuf.Api.DEFAULT_INSTANCE);
                                com.google.protobuf.Api.PARSER = interfaceC50386MMo2;
                            }
                        }
                        return interfaceC50386MMo2;
                    }
                    return interfaceC50386MMo145;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        switch (intValue) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return A07(com.google.protobuf.Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new com.google.protobuf.Any();
            case 4:
                return new RWP();
            case 5:
                return com.google.protobuf.Any.DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo146 = com.google.protobuf.Any.PARSER;
                if (interfaceC50386MMo146 == null) {
                    synchronized (com.google.protobuf.Any.class) {
                        interfaceC50386MMo = com.google.protobuf.Any.PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV73 = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(com.google.protobuf.Any.DEFAULT_INSTANCE);
                            com.google.protobuf.Any.PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo146;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}
