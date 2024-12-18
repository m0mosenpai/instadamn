package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45371K6e;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Text extends RYn implements InterfaceC65445TkH {
    public static final int ANIMATEDEMOJICHARACTERRANGES_FIELD_NUMBER = 6;
    public static final int COMMANDS_FIELD_NUMBER = 5;
    public static final Text DEFAULT_INSTANCE;
    public static final int IS_SUGGESTED_REPLY_FIELD_NUMBER = 2;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int POSTBACK_PAYLOAD_FIELD_NUMBER = 3;
    public static final int POWER_UP_DATA_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public InterfaceC65691TsD animatedEmojiCharacterRanges_;
    public int bitField0_;
    public InterfaceC65691TsD commands_;
    public boolean isSuggestedReply_;
    public PowerUpsData powerUpData_;
    public String text_ = "";
    public String postbackPayload_ = "";

    static {
        Text text = new Text();
        DEFAULT_INSTANCE = text;
        RYn.A0B(text, Text.class);
    }

    public Text() {
        RWF rwf = RWF.A02;
        this.commands_ = rwf;
        this.animatedEmojiCharacterRanges_ = rwf;
    }

    @Override // X.RYn
    public final Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "text_", "isSuggestedReply_", "postbackPayload_", "powerUpData_", "commands_", CommandRangeData.class, "animatedEmojiCharacterRanges_", AnimatedEmojiCharacterRange.class});
            case 3:
                return new Text();
            case 4:
                return new C45371K6e();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Text.class) {
                        interfaceC50386MMo = PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                            PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo2;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}
