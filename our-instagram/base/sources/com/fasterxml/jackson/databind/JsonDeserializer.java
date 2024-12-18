package com.fasterxml.jackson.databind;

import X.AbstractC63020Sal;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C60603RBu;
import X.C64520THn;
import X.C912845h;
import X.C914045z;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.RBV;
import X.SXY;
import com.facebook.common.json.FbJsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class JsonDeserializer implements InterfaceC102444jN {
    public JsonDeserializer A0A(SXY sxy) {
        return this;
    }

    public abstract Object A0D(C16L c16l, AnonymousClass469 anonymousClass469);

    public C64520THn A0F() {
        return null;
    }

    public Collection A0L() {
        return null;
    }

    /* loaded from: classes10.dex */
    public abstract class None extends JsonDeserializer {
        public None() {
            throw C00O.createAndThrow();
        }
    }

    public Integer A0B() {
        if (this instanceof StdScalarDeserializer) {
            return C05F.A01;
        }
        return C05F.A0C;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    public Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        JsonDeserializer jsonDeserializer;
        Object A0D;
        if (this instanceof UntypedObjectDeserializer) {
            UntypedObjectDeserializer untypedObjectDeserializer = (UntypedObjectDeserializer) this;
            if (!untypedObjectDeserializer.A06) {
                switch (c16l.A0x()) {
                    case 1:
                    case 2:
                    case 5:
                        jsonDeserializer = untypedObjectDeserializer.A01;
                        if (jsonDeserializer == null) {
                            if (obj instanceof Map) {
                                Map map = (Map) obj;
                                C16R A10 = c16l.A10();
                                if (A10 == C16R.A0D) {
                                    A10 = c16l.A1J();
                                }
                                if (A10 == C16R.A09) {
                                    return map;
                                }
                                String A0Y = c16l.A0Y();
                                do {
                                    c16l.A1J();
                                    Object obj2 = map.get(A0Y);
                                    if (obj2 != null) {
                                        A0D = untypedObjectDeserializer.A0C(c16l, anonymousClass469, obj2);
                                    } else {
                                        A0D = untypedObjectDeserializer.A0D(c16l, anonymousClass469);
                                    }
                                    if (A0D != obj2) {
                                        map.put(A0Y, A0D);
                                    }
                                    A0Y = c16l.A1N();
                                } while (A0Y != null);
                                return map;
                            }
                            return untypedObjectDeserializer.A0y(c16l, anonymousClass469);
                        }
                        return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
                    case 3:
                        jsonDeserializer = untypedObjectDeserializer.A00;
                        if (jsonDeserializer == null) {
                            if (obj instanceof Collection) {
                                Collection collection = (Collection) obj;
                                while (c16l.A1J() != C16R.A08) {
                                    collection.add(untypedObjectDeserializer.A0D(c16l, anonymousClass469));
                                }
                                return collection;
                            }
                            if (anonymousClass469.A0j(EnumC912945i.A0Q)) {
                                return untypedObjectDeserializer.A10(c16l, anonymousClass469);
                            }
                            return untypedObjectDeserializer.A0x(c16l, anonymousClass469);
                        }
                        return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
                    case 6:
                        jsonDeserializer = untypedObjectDeserializer.A03;
                        if (jsonDeserializer == null) {
                            return c16l.A1P();
                        }
                        return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
                    case 7:
                        jsonDeserializer = untypedObjectDeserializer.A02;
                        if (jsonDeserializer == null) {
                            if ((StdDeserializer.A02 & anonymousClass469.A01) != 0) {
                                return StdDeserializer.A07(c16l, anonymousClass469);
                            }
                            return c16l.A0p();
                        }
                        return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
                    case 8:
                        jsonDeserializer = untypedObjectDeserializer.A02;
                        if (jsonDeserializer == null) {
                            if (anonymousClass469.A0j(EnumC912945i.A0O)) {
                                return c16l.A0r();
                            }
                            return c16l.A0p();
                        }
                        return jsonDeserializer.A0C(c16l, anonymousClass469, obj);
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return c16l.A0V();
                }
            }
            return untypedObjectDeserializer.A0D(c16l, anonymousClass469);
        }
        anonymousClass469.A0X(this);
        return A0D(c16l, anonymousClass469);
    }

    public RBV A0E(String str) {
        throw new IllegalArgumentException(AnonymousClass001.A11("Cannot handle managed/back reference '", str, "': type: value deserializer of type ", getClass().getName(), " does not support them"));
    }

    public Boolean A0G(C912845h c912845h) {
        if (this instanceof StdScalarDeserializer) {
            return Boolean.FALSE;
        }
        if (this instanceof BaseNodeDeserializer) {
            return ((BaseNodeDeserializer) this).A00;
        }
        return null;
    }

    public Class A0H() {
        if (this instanceof StdDeserializer) {
            return ((StdDeserializer) this).A00;
        }
        return null;
    }

    public Integer A0I() {
        if (!(this instanceof UntypedObjectDeserializer) && !(this instanceof BaseNodeDeserializer)) {
            if (this instanceof StdScalarDeserializer) {
                StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) this;
                if (!(stdScalarDeserializer instanceof TokenBufferDeserializer)) {
                    if (stdScalarDeserializer instanceof StringDeserializer) {
                        return C05F.A1I;
                    }
                    if (stdScalarDeserializer instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
                        return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer).A00;
                    }
                    return C05F.A04;
                }
            } else {
                return null;
            }
        }
        return C05F.A0Y;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    public Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        double A0O;
        int A0Q;
        JsonDeserializer jsonDeserializer;
        if (this instanceof UntypedObjectDeserializer) {
            UntypedObjectDeserializer untypedObjectDeserializer = (UntypedObjectDeserializer) this;
            int A0x = c16l.A0x();
            if (A0x != 1 && A0x != 3) {
                switch (A0x) {
                    case 5:
                        break;
                    case 6:
                        jsonDeserializer = untypedObjectDeserializer.A03;
                        if (jsonDeserializer == null) {
                            return c16l.A1P();
                        }
                        return jsonDeserializer.A0D(c16l, anonymousClass469);
                    case 7:
                        jsonDeserializer = untypedObjectDeserializer.A02;
                        if (jsonDeserializer == null) {
                            if ((StdDeserializer.A02 & anonymousClass469.A01) != 0) {
                                return StdDeserializer.A07(c16l, anonymousClass469);
                            }
                            return c16l.A0p();
                        }
                        return jsonDeserializer.A0D(c16l, anonymousClass469);
                    case 8:
                        jsonDeserializer = untypedObjectDeserializer.A02;
                        if (jsonDeserializer == null) {
                            if (anonymousClass469.A0j(EnumC912945i.A0O)) {
                                return c16l.A0r();
                            }
                            return c16l.A0p();
                        }
                        return jsonDeserializer.A0D(c16l, anonymousClass469);
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return c16l.A0V();
                    default:
                        anonymousClass469.A0T(c16l, Object.class);
                        throw C00O.createAndThrow();
                }
            }
            return abstractC63020Sal.A03(c16l, anonymousClass469);
        }
        if (this instanceof StdScalarDeserializer) {
            StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) this;
            if (stdScalarDeserializer instanceof StringDeserializer) {
                return ((StringDeserializer) stdScalarDeserializer).A0D(c16l, anonymousClass469);
            }
            if (stdScalarDeserializer instanceof NumberDeserializers$IntegerDeserializer) {
                NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer;
                if (c16l.A15()) {
                    A0Q = c16l.A0i();
                } else if (numberDeserializers$PrimitiveOrWrapperDeserializer.A03) {
                    A0Q = numberDeserializers$PrimitiveOrWrapperDeserializer.A0Q(c16l, anonymousClass469);
                } else {
                    return numberDeserializers$PrimitiveOrWrapperDeserializer.A0c(c16l, anonymousClass469, Integer.class);
                }
                return Integer.valueOf(A0Q);
            }
            if (stdScalarDeserializer instanceof NumberDeserializers$DoubleDeserializer) {
                NumberDeserializers$DoubleDeserializer numberDeserializers$DoubleDeserializer = (NumberDeserializers$DoubleDeserializer) stdScalarDeserializer;
                if (c16l.A19(C16R.A0H)) {
                    A0O = c16l.A0g();
                } else if (numberDeserializers$DoubleDeserializer.A03) {
                    A0O = numberDeserializers$DoubleDeserializer.A0O(c16l, anonymousClass469);
                } else {
                    return numberDeserializers$DoubleDeserializer.A0x(c16l, anonymousClass469);
                }
                return Double.valueOf(A0O);
            }
            if (stdScalarDeserializer instanceof NumberDeserializers$BooleanDeserializer) {
                NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer2 = (NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer;
                C16R A10 = c16l.A10();
                if (A10 == C16R.A0K) {
                    return Boolean.TRUE;
                }
                if (A10 == C16R.A0F) {
                    return Boolean.FALSE;
                }
                if (numberDeserializers$PrimitiveOrWrapperDeserializer2.A03) {
                    return Boolean.valueOf(numberDeserializers$PrimitiveOrWrapperDeserializer2.A0v(c16l, anonymousClass469));
                }
                return numberDeserializers$PrimitiveOrWrapperDeserializer2.A0Y(c16l, anonymousClass469, ((StdDeserializer) numberDeserializers$PrimitiveOrWrapperDeserializer2).A00);
            }
            return abstractC63020Sal.A06(c16l, anonymousClass469);
        }
        return abstractC63020Sal.A03(c16l, anonymousClass469);
    }

    public Object A0K(AnonymousClass469 anonymousClass469) {
        if (this instanceof StringDeserializer) {
            return "";
        }
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
        }
        return BXX(anonymousClass469);
    }

    public boolean A0M() {
        if (!(this instanceof BaseNodeDeserializer) && !(this instanceof NumberDeserializers$IntegerDeserializer) && !(this instanceof StringDeserializer) && !(this instanceof UntypedObjectDeserializer) && !(this instanceof NumberDeserializers$LongDeserializer) && !(this instanceof FbJsonDeserializer)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC102444jN
    public Object AXq(AnonymousClass469 anonymousClass469) {
        if (this instanceof JsonNodeDeserializer) {
            return null;
        }
        return BXX(anonymousClass469);
    }

    @Override // X.InterfaceC102444jN
    public Object BXX(AnonymousClass469 anonymousClass469) {
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) this;
            if (numberDeserializers$PrimitiveOrWrapperDeserializer.A03 && anonymousClass469.A0j(EnumC912945i.A0D)) {
                anonymousClass469.A0h("Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", C914045z.A07(numberDeserializers$PrimitiveOrWrapperDeserializer.A0H()));
                throw C00O.createAndThrow();
            }
            return numberDeserializers$PrimitiveOrWrapperDeserializer.A02;
        }
        if (this instanceof JsonNodeDeserializer) {
            return C60603RBu.A00;
        }
        return null;
    }
}
