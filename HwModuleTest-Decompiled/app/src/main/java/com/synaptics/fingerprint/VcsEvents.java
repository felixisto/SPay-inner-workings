package com.synaptics.fingerprint;

public class VcsEvents {
    public static final int EVT_CAPTURE_STATUS_ARMED = 101;
    public static final int EVT_CAPTURE_STATUS_COMPLETED = 401;
    public static final int EVT_CAPTURE_STATUS_FINGER_DETECTED = 102;
    public static final int EVT_CAPTURE_STATUS_FINGER_REMOVED = 104;
    public static final int EVT_CAPTURE_STATUS_FINGER_SETTLED = 103;
    public static final int EVT_CLIENT_UNREGISTERED = 406;
    public static final int EVT_DEVICE_INFO = 405;
    public static final int EVT_DEVICE_SET_OWNERSHIP_COMPLETED = 408;
    public static final int EVT_DEVICE_STATE_READY = 1;
    public static final int EVT_DEVICE_STATE_UNAVAILABLE = 2;
    public static final int EVT_EIV_STATUS_BAD_CAPTURE = 201;
    public static final int EVT_EIV_STATUS_ENROLL_COMPLETED = 402;
    public static final int EVT_EIV_STATUS_ENROLL_PROGRESS = 202;
    public static final int EVT_EIV_STATUS_IDENTIFY_COMPLETED = 404;
    public static final int EVT_EIV_STATUS_VERIFY_COMPLETED = 403;
    public static final int EVT_SYSTEM_SERVICE_STOPPED = 407;
    public static final int VCS_CAP_DEVICE_HAS_FLASH = 8;
    public static final int VCS_CAP_DEVICE_OWNED = 2;
    public static final int VCS_CAP_DEVICE_PROVISIONED = 4;
    public static final int VCS_CAP_PRODUCT_TYPE_TOUCH = 1;
    public static final int VCS_CAP_UNKNOWN = 0;
    public static final int VCS_DEVICE_SENSOR_ID_82E1 = 4097;
    public static final int VCS_DEVICE_SENSOR_ID_82E2 = 4098;
    public static final int VCS_DEVICE_SENSOR_ID_82E3 = 4099;
    public static final int VCS_DEVICE_SENSOR_ID_82ES = 4100;
    public static final int VCS_DEVICE_SENSOR_ID_82ES3 = 4101;
    public static final int VCS_DEVICE_SENSOR_ID_86C = 4102;
    public static final int VCS_FINGER_DETECT_MODE_WOF = 2;
    public static final int VCS_FINGER_DETECT_MODE_WOVAR = 1;
    public static final int VCS_FINGER_INDEX_LEFT_INDEX = 2;
    public static final int VCS_FINGER_INDEX_LEFT_LITTLE = 5;
    public static final int VCS_FINGER_INDEX_LEFT_MIDDLE = 3;
    public static final int VCS_FINGER_INDEX_LEFT_RING = 4;
    public static final int VCS_FINGER_INDEX_LEFT_THUMB = 1;
    public static final int VCS_FINGER_INDEX_RIGHT_INDEX = 7;
    public static final int VCS_FINGER_INDEX_RIGHT_LITTLE = 10;
    public static final int VCS_FINGER_INDEX_RIGHT_MIDDLE = 8;
    public static final int VCS_FINGER_INDEX_RIGHT_RING = 9;
    public static final int VCS_FINGER_INDEX_RIGHT_THUMB = 6;
    public static final int VCS_FINGER_REJECT_FEATURE_EX_FAILURE = 67;
    public static final int VCS_FINGER_REJECT_FEATURE_SAME_AS_PREVIOUS = 68;
    public static final int VCS_FINGER_REJECT_REASON_BAD_QUALITY = 69;
    public static final int VCS_IDENTIFY_PRIORITY_HIGH = 2;
    public static final int VCS_IDENTIFY_PRIORITY_LOW = 1;
    public static final int VCS_IMAGE_QUALITY_ASP_DATA_INVALID = 1048576;
    public static final int VCS_IMAGE_QUALITY_BASELINE_DATA_INVALID = 4194304;
    public static final int VCS_IMAGE_QUALITY_EMPTY_TOUCH = 268435456;
    public static final int VCS_IMAGE_QUALITY_FINGER_OFFSET = 4096;
    public static final int VCS_IMAGE_QUALITY_FINGER_OFFSET_TOO_FAR_LEFT = 131072;
    public static final int VCS_IMAGE_QUALITY_FINGER_OFFSET_TOO_FAR_RIGHT = 262144;
    public static final int VCS_IMAGE_QUALITY_FINGER_TOO_THIN = 33554432;
    public static final int VCS_IMAGE_QUALITY_GOOD = 0;
    public static final int VCS_IMAGE_QUALITY_NOT_A_FINGER = 2097152;
    public static final int VCS_IMAGE_QUALITY_PARTIAL_TOUCH = 134217728;
    public static final int VCS_IMAGE_QUALITY_PRESSURE_TOO_HARD = 524288;
    public static final int VCS_IMAGE_QUALITY_PRESSURE_TOO_LIGHT = 65536;
    public static final int VCS_IMAGE_QUALITY_PROCESS_FAILED = Integer.MIN_VALUE;
    public static final int VCS_IMAGE_QUALITY_WATER_ON_SENSOR = 8192;
    public static final int VCS_PAYLOAD_PROTECTION_TYPE_APP = 2;
    public static final int VCS_PAYLOAD_PROTECTION_TYPE_USER = 1;
    public static final int VCS_PAYLOAD_TYPE_SIMPLE = 1;
    public static final int VCS_PAYLOAD_TYPE_UNKNOWN = 0;
    public static final int VCS_RESULT_DB_EMPTY = 502;
    public static final int VCS_RESULT_DB_FULL = 501;
    public static final int VCS_RESULT_GEN_ALREADY_ENROLLED = 105;
    public static final int VCS_RESULT_GEN_AUTHENTICATION_REQUIRED = 106;
    public static final int VCS_RESULT_GEN_BAD_PARAM = 111;
    public static final int VCS_RESULT_GEN_BUFFER_TOO_SMALL = 116;
    public static final int VCS_RESULT_GEN_BUSY = 102;
    public static final int VCS_RESULT_GEN_CORE_NOT_INITIALIZED = 101;
    public static final int VCS_RESULT_GEN_ERROR = 119;
    public static final int VCS_RESULT_GEN_FINGER_NOT_ENROLLED = 108;
    public static final int VCS_RESULT_GEN_NOT_IMPLEMENTED = 113;
    public static final int VCS_RESULT_GEN_NO_MATCH = 107;
    public static final int VCS_RESULT_GEN_NO_MORE_ENTRIES = 115;
    public static final int VCS_RESULT_GEN_NULL_POINTER = 112;
    public static final int VCS_RESULT_GEN_OBJECT_DOESNT_EXIST = 118;
    public static final int VCS_RESULT_GEN_OPERATION_CANCELED = 103;
    public static final int VCS_RESULT_GEN_OPERATION_DENIED = 104;
    public static final int VCS_RESULT_GEN_SIGNATURE_VERIFICATION_FAILED = 109;
    public static final int VCS_RESULT_GEN_TIMEOUT = 117;
    public static final int VCS_RESULT_GEN_UNEXPECTED_FORMAT = 114;
    public static final int VCS_RESULT_IMGPROC_COMPLETE = 401;
    public static final int VCS_RESULT_IMGPROC_FINGER_SETTLED = 403;
    public static final int VCS_RESULT_IMGPROC_IN_PROGRESS = 402;
    public static final int VCS_RESULT_IMGPROC_NO_IMAGE_CAPTURED = 404;
    public static final int VCS_RESULT_MATCHER_ADD_IMAGE_FAILED = 305;
    public static final int VCS_RESULT_MATCHER_ENROLL_FAILED = 304;
    public static final int VCS_RESULT_MATCHER_EXTRACT_FAILED = 303;
    public static final int VCS_RESULT_MATCHER_MATCH_FAILED = 302;
    public static final int VCS_RESULT_MATCHER_OPEN_FAILED = 301;
    public static final int VCS_RESULT_OK = 0;
    public static final int VCS_RESULT_SENSOR_BAD_CMD = 209;
    public static final int VCS_RESULT_SENSOR_CALIBRATION_FAIL = 214;
    public static final int VCS_RESULT_SENSOR_CALIBRATION_RETRY = 215;
    public static final int VCS_RESULT_SENSOR_DRV_OPEN_FAILED = 210;
    public static final int VCS_RESULT_SENSOR_FW_EXT_PROGRAM_FAILED = 208;
    public static final int VCS_RESULT_SENSOR_IN_AUTONOMOUS_MODE = 205;
    public static final int VCS_RESULT_SENSOR_MALFUNCTIONED = 202;
    public static final int VCS_RESULT_SENSOR_NEED_TO_RESET_OWNER = 204;
    public static final int VCS_RESULT_SENSOR_NOT_READY_FOR_USE = 206;
    public static final int VCS_RESULT_SENSOR_OUT_OF_OTP_OWNERSHIP = 207;
    public static final int VCS_RESULT_SENSOR_PARTITION_IS_FULL = 213;
    public static final int VCS_RESULT_SENSOR_PARTITION_NOT_OPENED = 212;
    public static final int VCS_RESULT_SENSOR_RESET = 201;
    public static final int VCS_RESULT_SENSOR_TLS_INTERNAL_FAILURE = 211;
    public static final int VCS_RESULT_SENSOR_UNAVAILABLE = 203;
    public static final int VCS_RESULT_SYS_CALL_FAILED = 601;
    public static final int VCS_RESULT_SYS_FILE_OPEN_FAILED = 603;
    public static final int VCS_RESULT_SYS_FILE_READ_FAILED = 605;
    public static final int VCS_RESULT_SYS_FILE_WRITE_FAILED = 604;
    public static final int VCS_RESULT_SYS_OUT_OF_MEMORY = 602;
    public static final int VCS_SECURITY_LEVEL_HIGH = 2;
    public static final int VCS_SECURITY_LEVEL_LOW = 0;
    public static final int VCS_SECURITY_LEVEL_REGULAR = 1;
    public static final int VCS_SECURITY_LEVEL_VERY_HIGH = 3;
    public static final int VCS_SENSOR_STATE_AUTHENTICATED = 3;
    public static final int VCS_SENSOR_STATE_AUTHENTICATING = 2;
    public static final int VCS_SENSOR_STATE_ERROR = 4;
    public static final int VCS_SENSOR_STATE_NOT_AUTHENTICATED = 1;
    public static final int VCS_SENSOR_STATE_UNDEFINED = 0;
}