package X;

import com.google.repack.protobuf.BoolValue;
import com.google.repack.protobuf.BytesValue;
import com.google.repack.protobuf.DoubleValue;
import com.google.repack.protobuf.Duration;
import com.google.repack.protobuf.Empty;
import com.google.repack.protobuf.Enum;
import com.google.repack.protobuf.EnumValue;
import com.google.repack.protobuf.Field;
import com.google.repack.protobuf.FieldMask;
import com.google.repack.protobuf.FloatValue;
import com.google.repack.protobuf.Int32Value;
import com.google.repack.protobuf.Int64Value;
import com.google.repack.protobuf.ListValue;
import com.google.repack.protobuf.Method;
import com.google.repack.protobuf.Mixin;
import com.google.repack.protobuf.Option;
import com.google.repack.protobuf.SourceContext;
import com.google.repack.protobuf.StringValue;
import com.google.repack.protobuf.Struct;
import com.google.repack.protobuf.Timestamp;
import com.google.repack.protobuf.Type;
import com.google.repack.protobuf.UInt32Value;
import com.google.repack.protobuf.UInt64Value;
import com.google.repack.protobuf.Value;
import com.meta.hera.engine.device.Device;
import com.meta.hera.engine.device.DeviceActions$RegisterDevice;
import com.meta.hera.engine.device.DeviceActions$SearchDevices;
import com.meta.hera.engine.device.DeviceActions$UnregisterDevice;
import com.meta.hera.engine.device.DeviceActions$UpdatePeripheralState;
import com.meta.hera.engine.device.DevicePeripheralState;
import com.meta.hera.engine.device.DeviceState;
import com.meta.hera.engine.device.PhonePeripheralState;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RaB extends TEY {
    public static Map defaultInstanceMap = AbstractC58318PtA.A14();
    public C62964SZh unknownFields = C62964SZh.A03;
    public int memoizedSerializedSize = -1;

    public static C64442TEa A00(RaB raB) {
        return new C64442TEa(raB);
    }

    public static SHr A01(TEY tey, String str, Object[] objArr) {
        return new SHr(tey, str, objArr);
    }

    public final Object A03(Integer num) {
        InterfaceC65289ThM interfaceC65289ThM;
        InterfaceC65289ThM interfaceC65289ThM2;
        InterfaceC65289ThM interfaceC65289ThM3;
        InterfaceC65289ThM interfaceC65289ThM4;
        InterfaceC65289ThM interfaceC65289ThM5;
        InterfaceC65289ThM interfaceC65289ThM6;
        InterfaceC65289ThM interfaceC65289ThM7;
        InterfaceC65289ThM interfaceC65289ThM8;
        InterfaceC65289ThM interfaceC65289ThM9;
        InterfaceC65289ThM interfaceC65289ThM10;
        InterfaceC65289ThM interfaceC65289ThM11;
        InterfaceC65289ThM interfaceC65289ThM12;
        InterfaceC65289ThM interfaceC65289ThM13;
        InterfaceC65289ThM interfaceC65289ThM14;
        InterfaceC65289ThM interfaceC65289ThM15;
        InterfaceC65289ThM interfaceC65289ThM16;
        InterfaceC65289ThM interfaceC65289ThM17;
        InterfaceC65289ThM interfaceC65289ThM18;
        InterfaceC65289ThM interfaceC65289ThM19;
        InterfaceC65289ThM interfaceC65289ThM20;
        InterfaceC65289ThM interfaceC65289ThM21;
        InterfaceC65289ThM interfaceC65289ThM22;
        InterfaceC65289ThM interfaceC65289ThM23;
        InterfaceC65289ThM interfaceC65289ThM24;
        InterfaceC65289ThM interfaceC65289ThM25;
        InterfaceC65289ThM interfaceC65289ThM26;
        InterfaceC65289ThM interfaceC65289ThM27;
        InterfaceC65289ThM interfaceC65289ThM28;
        InterfaceC65289ThM interfaceC65289ThM29;
        InterfaceC65289ThM interfaceC65289ThM30;
        InterfaceC65289ThM interfaceC65289ThM31;
        InterfaceC65289ThM interfaceC65289ThM32;
        InterfaceC65289ThM interfaceC65289ThM33;
        InterfaceC65289ThM interfaceC65289ThM34;
        if (this instanceof PhonePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(PhonePeripheralState.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "phoneApplicationLifecycleState_"});
                case 3:
                    return new RaB();
                case 4:
                    return new C60878RZa();
                case 5:
                    return PhonePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM35 = PhonePeripheralState.PARSER;
                    if (interfaceC65289ThM35 == null) {
                        synchronized (PhonePeripheralState.class) {
                            interfaceC65289ThM34 = PhonePeripheralState.PARSER;
                            if (interfaceC65289ThM34 == null) {
                                C63133Sde c63133Sde = C64442TEa.A01;
                                interfaceC65289ThM34 = A00(PhonePeripheralState.DEFAULT_INSTANCE);
                                PhonePeripheralState.PARSER = interfaceC65289ThM34;
                            }
                        }
                        return interfaceC65289ThM34;
                    }
                    return interfaceC65289ThM35;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DeviceState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceState.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"devices_", Device.class, "searchRequestId_"});
                case 3:
                    return new DeviceState();
                case 4:
                    return new RZZ();
                case 5:
                    return DeviceState.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM36 = DeviceState.PARSER;
                    if (interfaceC65289ThM36 == null) {
                        synchronized (DeviceState.class) {
                            interfaceC65289ThM33 = DeviceState.PARSER;
                            if (interfaceC65289ThM33 == null) {
                                C63133Sde c63133Sde2 = C64442TEa.A01;
                                interfaceC65289ThM33 = A00(DeviceState.DEFAULT_INSTANCE);
                                DeviceState.PARSER = interfaceC65289ThM33;
                            }
                        }
                        return interfaceC65289ThM33;
                    }
                    return interfaceC65289ThM36;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DevicePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DevicePeripheralState.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "glassesHingeState_", "glassesMountState_", "deviceThermalState_", "deviceBatteryState_", "devicePeakPowerState_", "deviceCameraErrorState_"});
                case 3:
                    return new RaB();
                case 4:
                    return new RZY();
                case 5:
                    return DevicePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM37 = DevicePeripheralState.PARSER;
                    if (interfaceC65289ThM37 == null) {
                        synchronized (DevicePeripheralState.class) {
                            interfaceC65289ThM32 = DevicePeripheralState.PARSER;
                            if (interfaceC65289ThM32 == null) {
                                C63133Sde c63133Sde3 = C64442TEa.A01;
                                interfaceC65289ThM32 = A00(DevicePeripheralState.DEFAULT_INSTANCE);
                                DevicePeripheralState.PARSER = interfaceC65289ThM32;
                            }
                        }
                        return interfaceC65289ThM32;
                    }
                    return interfaceC65289ThM37;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DeviceActions$UpdatePeripheralState) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"delta_", "deltaCase_", "deviceId_", DevicePeripheralState.class, PhonePeripheralState.class});
                case 3:
                    return new DeviceActions$UpdatePeripheralState();
                case 4:
                    return new RZX();
                case 5:
                    return DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM38 = DeviceActions$UpdatePeripheralState.PARSER;
                    if (interfaceC65289ThM38 == null) {
                        synchronized (DeviceActions$UpdatePeripheralState.class) {
                            interfaceC65289ThM31 = DeviceActions$UpdatePeripheralState.PARSER;
                            if (interfaceC65289ThM31 == null) {
                                C63133Sde c63133Sde4 = C64442TEa.A01;
                                interfaceC65289ThM31 = A00(DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE);
                                DeviceActions$UpdatePeripheralState.PARSER = interfaceC65289ThM31;
                            }
                        }
                        return interfaceC65289ThM31;
                    }
                    return interfaceC65289ThM38;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DeviceActions$UnregisterDevice) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$UnregisterDevice.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceId_"});
                case 3:
                    return new DeviceActions$UnregisterDevice();
                case 4:
                    return new RZW();
                case 5:
                    return DeviceActions$UnregisterDevice.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM39 = DeviceActions$UnregisterDevice.PARSER;
                    if (interfaceC65289ThM39 == null) {
                        synchronized (DeviceActions$UnregisterDevice.class) {
                            interfaceC65289ThM30 = DeviceActions$UnregisterDevice.PARSER;
                            if (interfaceC65289ThM30 == null) {
                                C63133Sde c63133Sde5 = C64442TEa.A01;
                                interfaceC65289ThM30 = A00(DeviceActions$UnregisterDevice.DEFAULT_INSTANCE);
                                DeviceActions$UnregisterDevice.PARSER = interfaceC65289ThM30;
                            }
                        }
                        return interfaceC65289ThM30;
                    }
                    return interfaceC65289ThM39;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DeviceActions$SearchDevices) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$SearchDevices.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "timeoutMs_"});
                case 3:
                    return new RaB();
                case 4:
                    return new RZV();
                case 5:
                    return DeviceActions$SearchDevices.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM40 = DeviceActions$SearchDevices.PARSER;
                    if (interfaceC65289ThM40 == null) {
                        synchronized (DeviceActions$SearchDevices.class) {
                            interfaceC65289ThM29 = DeviceActions$SearchDevices.PARSER;
                            if (interfaceC65289ThM29 == null) {
                                C63133Sde c63133Sde6 = C64442TEa.A01;
                                interfaceC65289ThM29 = A00(DeviceActions$SearchDevices.DEFAULT_INSTANCE);
                                DeviceActions$SearchDevices.PARSER = interfaceC65289ThM29;
                            }
                        }
                        return interfaceC65289ThM29;
                    }
                    return interfaceC65289ThM40;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof DeviceActions$RegisterDevice) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(DeviceActions$RegisterDevice.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"device_"});
                case 3:
                    return new RaB();
                case 4:
                    return new RZU();
                case 5:
                    return DeviceActions$RegisterDevice.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM41 = DeviceActions$RegisterDevice.PARSER;
                    if (interfaceC65289ThM41 == null) {
                        synchronized (DeviceActions$RegisterDevice.class) {
                            interfaceC65289ThM28 = DeviceActions$RegisterDevice.PARSER;
                            if (interfaceC65289ThM28 == null) {
                                C63133Sde c63133Sde7 = C64442TEa.A01;
                                interfaceC65289ThM28 = A00(DeviceActions$RegisterDevice.DEFAULT_INSTANCE);
                                DeviceActions$RegisterDevice.PARSER = interfaceC65289ThM28;
                            }
                        }
                        return interfaceC65289ThM28;
                    }
                    return interfaceC65289ThM41;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Device) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Device.DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ለ\u0000\u0004\f\u0005\u0003\u0006<\u0000\u0007<\u0000", new Object[]{"peripheralState_", "peripheralStateCase_", "bitField0_", "id_", "role_", "name_", "status_", "lastHeartbeatTimestampMs_", DevicePeripheralState.class, PhonePeripheralState.class});
                case 3:
                    return new Device();
                case 4:
                    return new RZT();
                case 5:
                    return Device.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM42 = Device.PARSER;
                    if (interfaceC65289ThM42 == null) {
                        synchronized (Device.class) {
                            interfaceC65289ThM27 = Device.PARSER;
                            if (interfaceC65289ThM27 == null) {
                                C63133Sde c63133Sde8 = C64442TEa.A01;
                                interfaceC65289ThM27 = A00(Device.DEFAULT_INSTANCE);
                                Device.PARSER = interfaceC65289ThM27;
                            }
                        }
                        return interfaceC65289ThM27;
                    }
                    return interfaceC65289ThM42;
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
                    return A01(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
                case 3:
                    return new Value();
                case 4:
                    return new RZS();
                case 5:
                    return Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM43 = Value.PARSER;
                    if (interfaceC65289ThM43 == null) {
                        synchronized (Value.class) {
                            interfaceC65289ThM26 = Value.PARSER;
                            if (interfaceC65289ThM26 == null) {
                                C63133Sde c63133Sde9 = C64442TEa.A01;
                                interfaceC65289ThM26 = A00(Value.DEFAULT_INSTANCE);
                                Value.PARSER = interfaceC65289ThM26;
                            }
                        }
                        return interfaceC65289ThM26;
                    }
                    return interfaceC65289ThM43;
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
                    return A01(UInt64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZR();
                case 5:
                    return UInt64Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM44 = UInt64Value.PARSER;
                    if (interfaceC65289ThM44 == null) {
                        synchronized (UInt64Value.class) {
                            interfaceC65289ThM25 = UInt64Value.PARSER;
                            if (interfaceC65289ThM25 == null) {
                                C63133Sde c63133Sde10 = C64442TEa.A01;
                                interfaceC65289ThM25 = A00(UInt64Value.DEFAULT_INSTANCE);
                                UInt64Value.PARSER = interfaceC65289ThM25;
                            }
                        }
                        return interfaceC65289ThM25;
                    }
                    return interfaceC65289ThM44;
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
                    return A01(UInt32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZQ();
                case 5:
                    return UInt32Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM45 = UInt32Value.PARSER;
                    if (interfaceC65289ThM45 == null) {
                        synchronized (UInt32Value.class) {
                            interfaceC65289ThM24 = UInt32Value.PARSER;
                            if (interfaceC65289ThM24 == null) {
                                C63133Sde c63133Sde11 = C64442TEa.A01;
                                interfaceC65289ThM24 = A00(UInt32Value.DEFAULT_INSTANCE);
                                UInt32Value.PARSER = interfaceC65289ThM24;
                            }
                        }
                        return interfaceC65289ThM24;
                    }
                    return interfaceC65289ThM45;
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
                    return A01(Type.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Type();
                case 4:
                    return new RZP();
                case 5:
                    return Type.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM46 = Type.PARSER;
                    if (interfaceC65289ThM46 == null) {
                        synchronized (Type.class) {
                            interfaceC65289ThM23 = Type.PARSER;
                            if (interfaceC65289ThM23 == null) {
                                C63133Sde c63133Sde12 = C64442TEa.A01;
                                interfaceC65289ThM23 = A00(Type.DEFAULT_INSTANCE);
                                Type.PARSER = interfaceC65289ThM23;
                            }
                        }
                        return interfaceC65289ThM23;
                    }
                    return interfaceC65289ThM46;
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
                    return A01(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new RaB();
                case 4:
                    return new RZO();
                case 5:
                    return Timestamp.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM47 = Timestamp.PARSER;
                    if (interfaceC65289ThM47 == null) {
                        synchronized (Timestamp.class) {
                            interfaceC65289ThM22 = Timestamp.PARSER;
                            if (interfaceC65289ThM22 == null) {
                                C63133Sde c63133Sde13 = C64442TEa.A01;
                                interfaceC65289ThM22 = A00(Timestamp.DEFAULT_INSTANCE);
                                Timestamp.PARSER = interfaceC65289ThM22;
                            }
                        }
                        return interfaceC65289ThM22;
                    }
                    return interfaceC65289ThM47;
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
                    return A01(Struct.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC62342S7n.A00});
                case 3:
                    return new Struct();
                case 4:
                    return new RZN();
                case 5:
                    return Struct.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM48 = Struct.PARSER;
                    if (interfaceC65289ThM48 == null) {
                        synchronized (Struct.class) {
                            interfaceC65289ThM21 = Struct.PARSER;
                            if (interfaceC65289ThM21 == null) {
                                C63133Sde c63133Sde14 = C64442TEa.A01;
                                interfaceC65289ThM21 = A00(Struct.DEFAULT_INSTANCE);
                                Struct.PARSER = interfaceC65289ThM21;
                            }
                        }
                        return interfaceC65289ThM21;
                    }
                    return interfaceC65289ThM48;
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
                    return A01(StringValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", AbstractC58321PtD.A1b());
                case 3:
                    return new StringValue();
                case 4:
                    return new RZM();
                case 5:
                    return StringValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM49 = StringValue.PARSER;
                    if (interfaceC65289ThM49 == null) {
                        synchronized (StringValue.class) {
                            interfaceC65289ThM20 = StringValue.PARSER;
                            if (interfaceC65289ThM20 == null) {
                                C63133Sde c63133Sde15 = C64442TEa.A01;
                                interfaceC65289ThM20 = A00(StringValue.DEFAULT_INSTANCE);
                                StringValue.PARSER = interfaceC65289ThM20;
                            }
                        }
                        return interfaceC65289ThM20;
                    }
                    return interfaceC65289ThM49;
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
                    return A01(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
                case 3:
                    return new SourceContext();
                case 4:
                    return new RZL();
                case 5:
                    return SourceContext.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM50 = SourceContext.PARSER;
                    if (interfaceC65289ThM50 == null) {
                        synchronized (SourceContext.class) {
                            interfaceC65289ThM19 = SourceContext.PARSER;
                            if (interfaceC65289ThM19 == null) {
                                C63133Sde c63133Sde16 = C64442TEa.A01;
                                interfaceC65289ThM19 = A00(SourceContext.DEFAULT_INSTANCE);
                                SourceContext.PARSER = interfaceC65289ThM19;
                            }
                        }
                        return interfaceC65289ThM19;
                    }
                    return interfaceC65289ThM50;
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
                    return A01(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
                case 3:
                    return new Option();
                case 4:
                    return new RZK();
                case 5:
                    return Option.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM51 = Option.PARSER;
                    if (interfaceC65289ThM51 == null) {
                        synchronized (Option.class) {
                            interfaceC65289ThM18 = Option.PARSER;
                            if (interfaceC65289ThM18 == null) {
                                C63133Sde c63133Sde17 = C64442TEa.A01;
                                interfaceC65289ThM18 = A00(Option.DEFAULT_INSTANCE);
                                Option.PARSER = interfaceC65289ThM18;
                            }
                        }
                        return interfaceC65289ThM18;
                    }
                    return interfaceC65289ThM51;
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
                    return A01(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
                case 3:
                    return new Mixin();
                case 4:
                    return new RZJ();
                case 5:
                    return Mixin.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM52 = Mixin.PARSER;
                    if (interfaceC65289ThM52 == null) {
                        synchronized (Mixin.class) {
                            interfaceC65289ThM17 = Mixin.PARSER;
                            if (interfaceC65289ThM17 == null) {
                                C63133Sde c63133Sde18 = C64442TEa.A01;
                                interfaceC65289ThM17 = A00(Mixin.DEFAULT_INSTANCE);
                                Mixin.PARSER = interfaceC65289ThM17;
                            }
                        }
                        return interfaceC65289ThM17;
                    }
                    return interfaceC65289ThM52;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof Method) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(Method.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
                case 3:
                    return new Method();
                case 4:
                    return new RZI();
                case 5:
                    return Method.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM53 = Method.PARSER;
                    if (interfaceC65289ThM53 == null) {
                        synchronized (Method.class) {
                            interfaceC65289ThM16 = Method.PARSER;
                            if (interfaceC65289ThM16 == null) {
                                C63133Sde c63133Sde19 = C64442TEa.A01;
                                interfaceC65289ThM16 = A00(Method.DEFAULT_INSTANCE);
                                Method.PARSER = interfaceC65289ThM16;
                            }
                        }
                        return interfaceC65289ThM16;
                    }
                    return interfaceC65289ThM53;
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
                    return A01(ListValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
                case 3:
                    return new ListValue();
                case 4:
                    return new RZH();
                case 5:
                    return ListValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM54 = ListValue.PARSER;
                    if (interfaceC65289ThM54 == null) {
                        synchronized (ListValue.class) {
                            interfaceC65289ThM15 = ListValue.PARSER;
                            if (interfaceC65289ThM15 == null) {
                                C63133Sde c63133Sde20 = C64442TEa.A01;
                                interfaceC65289ThM15 = A00(ListValue.DEFAULT_INSTANCE);
                                ListValue.PARSER = interfaceC65289ThM15;
                            }
                        }
                        return interfaceC65289ThM15;
                    }
                    return interfaceC65289ThM54;
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
                    return A01(Int64Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZG();
                case 5:
                    return Int64Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM55 = Int64Value.PARSER;
                    if (interfaceC65289ThM55 == null) {
                        synchronized (Int64Value.class) {
                            interfaceC65289ThM14 = Int64Value.PARSER;
                            if (interfaceC65289ThM14 == null) {
                                C63133Sde c63133Sde21 = C64442TEa.A01;
                                interfaceC65289ThM14 = A00(Int64Value.DEFAULT_INSTANCE);
                                Int64Value.PARSER = interfaceC65289ThM14;
                            }
                        }
                        return interfaceC65289ThM14;
                    }
                    return interfaceC65289ThM55;
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
                    return A01(Int32Value.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZF();
                case 5:
                    return Int32Value.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM56 = Int32Value.PARSER;
                    if (interfaceC65289ThM56 == null) {
                        synchronized (Int32Value.class) {
                            interfaceC65289ThM13 = Int32Value.PARSER;
                            if (interfaceC65289ThM13 == null) {
                                C63133Sde c63133Sde22 = C64442TEa.A01;
                                interfaceC65289ThM13 = A00(Int32Value.DEFAULT_INSTANCE);
                                Int32Value.PARSER = interfaceC65289ThM13;
                            }
                        }
                        return interfaceC65289ThM13;
                    }
                    return interfaceC65289ThM56;
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
                    return A01(FloatValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZE();
                case 5:
                    return FloatValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM57 = FloatValue.PARSER;
                    if (interfaceC65289ThM57 == null) {
                        synchronized (FloatValue.class) {
                            interfaceC65289ThM12 = FloatValue.PARSER;
                            if (interfaceC65289ThM12 == null) {
                                C63133Sde c63133Sde23 = C64442TEa.A01;
                                interfaceC65289ThM12 = A00(FloatValue.DEFAULT_INSTANCE);
                                FloatValue.PARSER = interfaceC65289ThM12;
                            }
                        }
                        return interfaceC65289ThM12;
                    }
                    return interfaceC65289ThM57;
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
                    return A01(FieldMask.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
                case 3:
                    return new FieldMask();
                case 4:
                    return new RZD();
                case 5:
                    return FieldMask.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM58 = FieldMask.PARSER;
                    if (interfaceC65289ThM58 == null) {
                        synchronized (FieldMask.class) {
                            interfaceC65289ThM11 = FieldMask.PARSER;
                            if (interfaceC65289ThM11 == null) {
                                C63133Sde c63133Sde24 = C64442TEa.A01;
                                interfaceC65289ThM11 = A00(FieldMask.DEFAULT_INSTANCE);
                                FieldMask.PARSER = interfaceC65289ThM11;
                            }
                        }
                        return interfaceC65289ThM11;
                    }
                    return interfaceC65289ThM58;
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
                    return A01(Field.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
                case 3:
                    return new Field();
                case 4:
                    return new RZC();
                case 5:
                    return Field.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM59 = Field.PARSER;
                    if (interfaceC65289ThM59 == null) {
                        synchronized (Field.class) {
                            interfaceC65289ThM10 = Field.PARSER;
                            if (interfaceC65289ThM10 == null) {
                                C63133Sde c63133Sde25 = C64442TEa.A01;
                                interfaceC65289ThM10 = A00(Field.DEFAULT_INSTANCE);
                                Field.PARSER = interfaceC65289ThM10;
                            }
                        }
                        return interfaceC65289ThM10;
                    }
                    return interfaceC65289ThM59;
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
                    return A01(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
                case 3:
                    return new EnumValue();
                case 4:
                    return new RZB();
                case 5:
                    return EnumValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM60 = EnumValue.PARSER;
                    if (interfaceC65289ThM60 == null) {
                        synchronized (EnumValue.class) {
                            interfaceC65289ThM9 = EnumValue.PARSER;
                            if (interfaceC65289ThM9 == null) {
                                C63133Sde c63133Sde26 = C64442TEa.A01;
                                interfaceC65289ThM9 = A00(EnumValue.DEFAULT_INSTANCE);
                                EnumValue.PARSER = interfaceC65289ThM9;
                            }
                        }
                        return interfaceC65289ThM9;
                    }
                    return interfaceC65289ThM60;
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
                    return A01(Enum.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
                case 3:
                    return new Enum();
                case 4:
                    return new RZA();
                case 5:
                    return Enum.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM61 = Enum.PARSER;
                    if (interfaceC65289ThM61 == null) {
                        synchronized (Enum.class) {
                            interfaceC65289ThM8 = Enum.PARSER;
                            if (interfaceC65289ThM8 == null) {
                                C63133Sde c63133Sde27 = C64442TEa.A01;
                                interfaceC65289ThM8 = A00(Enum.DEFAULT_INSTANCE);
                                Enum.PARSER = interfaceC65289ThM8;
                            }
                        }
                        return interfaceC65289ThM8;
                    }
                    return interfaceC65289ThM61;
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
                    return A01(Empty.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new RaB();
                case 4:
                    return new RZ9();
                case 5:
                    return Empty.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM62 = Empty.PARSER;
                    if (interfaceC65289ThM62 == null) {
                        synchronized (Empty.class) {
                            interfaceC65289ThM7 = Empty.PARSER;
                            if (interfaceC65289ThM7 == null) {
                                C63133Sde c63133Sde28 = C64442TEa.A01;
                                interfaceC65289ThM7 = A00(Empty.DEFAULT_INSTANCE);
                                Empty.PARSER = interfaceC65289ThM7;
                            }
                        }
                        return interfaceC65289ThM7;
                    }
                    return interfaceC65289ThM62;
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
                    return A01(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
                case 3:
                    return new RaB();
                case 4:
                    return new RZ8();
                case 5:
                    return Duration.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM63 = Duration.PARSER;
                    if (interfaceC65289ThM63 == null) {
                        synchronized (Duration.class) {
                            interfaceC65289ThM6 = Duration.PARSER;
                            if (interfaceC65289ThM6 == null) {
                                C63133Sde c63133Sde29 = C64442TEa.A01;
                                interfaceC65289ThM6 = A00(Duration.DEFAULT_INSTANCE);
                                Duration.PARSER = interfaceC65289ThM6;
                            }
                        }
                        return interfaceC65289ThM6;
                    }
                    return interfaceC65289ThM63;
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
                    return A01(DoubleValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZ7();
                case 5:
                    return DoubleValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM64 = DoubleValue.PARSER;
                    if (interfaceC65289ThM64 == null) {
                        synchronized (DoubleValue.class) {
                            interfaceC65289ThM5 = DoubleValue.PARSER;
                            if (interfaceC65289ThM5 == null) {
                                C63133Sde c63133Sde30 = C64442TEa.A01;
                                interfaceC65289ThM5 = A00(DoubleValue.DEFAULT_INSTANCE);
                                DoubleValue.PARSER = interfaceC65289ThM5;
                            }
                        }
                        return interfaceC65289ThM5;
                    }
                    return interfaceC65289ThM64;
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
                    return A01(BytesValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", AbstractC58321PtD.A1b());
                case 3:
                    return new BytesValue();
                case 4:
                    return new RZ6();
                case 5:
                    return BytesValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM65 = BytesValue.PARSER;
                    if (interfaceC65289ThM65 == null) {
                        synchronized (BytesValue.class) {
                            interfaceC65289ThM4 = BytesValue.PARSER;
                            if (interfaceC65289ThM4 == null) {
                                C63133Sde c63133Sde31 = C64442TEa.A01;
                                interfaceC65289ThM4 = A00(BytesValue.DEFAULT_INSTANCE);
                                BytesValue.PARSER = interfaceC65289ThM4;
                            }
                        }
                        return interfaceC65289ThM4;
                    }
                    return interfaceC65289ThM65;
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
                    return A01(BoolValue.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", AbstractC58321PtD.A1b());
                case 3:
                    return new RaB();
                case 4:
                    return new RZ5();
                case 5:
                    return BoolValue.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM66 = BoolValue.PARSER;
                    if (interfaceC65289ThM66 == null) {
                        synchronized (BoolValue.class) {
                            interfaceC65289ThM3 = BoolValue.PARSER;
                            if (interfaceC65289ThM3 == null) {
                                C63133Sde c63133Sde32 = C64442TEa.A01;
                                interfaceC65289ThM3 = A00(BoolValue.DEFAULT_INSTANCE);
                                BoolValue.PARSER = interfaceC65289ThM3;
                            }
                        }
                        return interfaceC65289ThM3;
                    }
                    return interfaceC65289ThM66;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        boolean z = this instanceof com.google.repack.protobuf.Api;
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A01(com.google.repack.protobuf.Api.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
                case 3:
                    return new com.google.repack.protobuf.Api();
                case 4:
                    return new RZ4();
                case 5:
                    return com.google.repack.protobuf.Api.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65289ThM interfaceC65289ThM67 = com.google.repack.protobuf.Api.PARSER;
                    if (interfaceC65289ThM67 == null) {
                        synchronized (com.google.repack.protobuf.Api.class) {
                            interfaceC65289ThM2 = com.google.repack.protobuf.Api.PARSER;
                            if (interfaceC65289ThM2 == null) {
                                C63133Sde c63133Sde33 = C64442TEa.A01;
                                interfaceC65289ThM2 = A00(com.google.repack.protobuf.Api.DEFAULT_INSTANCE);
                                com.google.repack.protobuf.Api.PARSER = interfaceC65289ThM2;
                            }
                        }
                        return interfaceC65289ThM2;
                    }
                    return interfaceC65289ThM67;
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
                return A01(com.google.repack.protobuf.Any.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new com.google.repack.protobuf.Any();
            case 4:
                return new RZ3();
            case 5:
                return com.google.repack.protobuf.Any.DEFAULT_INSTANCE;
            case 6:
                InterfaceC65289ThM interfaceC65289ThM68 = com.google.repack.protobuf.Any.PARSER;
                if (interfaceC65289ThM68 == null) {
                    synchronized (com.google.repack.protobuf.Any.class) {
                        interfaceC65289ThM = com.google.repack.protobuf.Any.PARSER;
                        if (interfaceC65289ThM == null) {
                            C63133Sde c63133Sde34 = C64442TEa.A01;
                            interfaceC65289ThM = A00(com.google.repack.protobuf.Any.DEFAULT_INSTANCE);
                            com.google.repack.protobuf.Any.PARSER = interfaceC65289ThM;
                        }
                    }
                    return interfaceC65289ThM;
                }
                return interfaceC65289ThM68;
            default:
                throw AbstractC43592JPx.A11();
        }
    }

    @Override // X.InterfaceC65446TkI
    public final /* bridge */ /* synthetic */ RaB AwH() {
        return (RaB) A03(C05F.A0j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return SYY.A02.A00(this).AT0(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i == 0) {
            int CME = SYY.A02.A00(this).CME(this);
            this.memoizedHashCode = CME;
            return CME;
        }
        return i;
    }

    public static Object A02(Object obj, java.lang.reflect.Method method, Object... objArr) {
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

    public final String toString() {
        StringBuilder A0u = AbstractC58323PtF.A0u(super.toString());
        AbstractC63077Sbz.A01(this, A0u, 0);
        return A0u.toString();
    }
}
